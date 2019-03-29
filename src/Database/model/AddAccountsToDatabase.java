package Database.model;

import Accounts.model.Account;
import Accounts.model.AccountList;
import Contact.model.Contact;
import Contact.model.ContactsList;
import Menu.MenuItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kenny
 *
 * Inserts new accounts and contacts into ACCOUNT and CONTACT Tables of Database
 */
public class AddAccountsToDatabase implements MenuItem {

    // URL to where database is created
    private static final String URL = "jdbc:derby://localhost:1527/CRM";
    private final AccountList accountList;

    // Constructor takes current AccountList
    public AddAccountsToDatabase(AccountList accountList) {
        this.accountList = accountList;
    }

    // Loads Apache Derby driver and called insert() to insert data to database
    @Override
    public void execute() {

        try {
            // Load Derby's network client driver
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        insert();
    }

    // Inserts account and contacts into associated tables
    // Pre: Database and Tables for ACCOUNT and CONTACT must be setup
    // Post: New Accounts and Contacts from current session added to tables
    private void insert() {
        // Establish connection to given database URL
        try (Connection connect = DriverManager.getConnection(URL);) {

            for (Account account : accountList.getList()) {
                int accountId = account.getAccountId();

                // Check if account exists in table
                String checkRecordExists = "SELECT accountId FROM Account "
                        + "WHERE accountId=" + Integer.toString(accountId);
                PreparedStatement ps = connect.prepareStatement(checkRecordExists);

                // If it does not exist then insert account
                if (!(ps.execute())) {
                    int amount = account.getAmount();
                    // Convert clostDate to milliseconds
                    long closeDate = account.getCloseDate().getTimeInMillis();
                    String accountName = account.getAccountName();
                    ContactsList contactsList = account.getContactsList();

                    String insertAccount = "INSERT INTO ACCOUNT VALUES (?, ?, ?, '?')";
                    ps = connect.prepareStatement(insertAccount);
                    ps.setInt(1, accountId);
                    ps.setInt(2, amount);
                    ps.setLong(3, closeDate);
                    ps.setString(4, accountName);
                    ps.executeUpdate();

                    // Insert contacts into Contact table
                    for (Contact contact : contactsList.getContactsList()) {
                        String name = contact.getName();
                        String email = contact.getEmail();
                        String phoneNumber = contact.getPhoneNumber();
                        String insertContacts = "INSERT INTO CONTACT VALUES ('?', '?', '?')";
                        ps = connect.prepareStatement(insertContacts);

                        ps.setString(1, name);
                        ps.setString(2, email);
                        ps.setString(3, phoneNumber);
                        ps.executeUpdate();

                        // Insert relation between Account and Contacts
                        String insertWorksFor = "INSERT INTO WORKS_FOR VALUES ('?', ?)";
                        ps = connect.prepareStatement(insertWorksFor);

                        ps.setString(1, email);
                        ps.setInt(2, accountId);
                    }

                }
            }

            // Close connection
            connect.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
