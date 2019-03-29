package Database.model;

import Menu.MenuItem;
import java.sql.*;

/**
 *
 * @author kenny
 * 
 * Creates local Apache Derby Database and Tables for Account, Contact,
 * and relationship between the two.
 * Uses Java DB Driver - derby.jar/derbyclient.jar/derbynet.jar
 * Apache Derby database version 10.10.2.0
 * Persistence JPA 2.1
 */
public class CreateDatabase implements MenuItem{
    //URL to where database is created
    private static final String URL = "jdbc:derby://localhost:1527/CRM";
    
    public CreateDatabase() {
    }
    
    //Pre: Database for Account, Contact, and WORKS_FOR have not been created yet
    //Post: Database is created for Account, Contact, and their relationship
    //ACCOUNT attributes: accountId(Primary Key), amount,
    //                    closeDate(Store as milliseconds), accountName
    //CONTACT attributes: name, email(Primary Key), phoneNumber
    //WORKS_FOR attributes: email Foreign Key of CONTACT, accountId Foreign Key of ACCOUNT
    //                      Primary Key (email, accountId)
    @Override
    public void execute() {
        try {
            // Load Derby's network client driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        // Establish connection to given database URL
        try (Connection connect = DriverManager.getConnection(URL);
                Statement stat = connect.createStatement()) {
            
            // Create ACCOUNT Table
            stat.executeUpdate("CREATE TABLE ACCOUNT (accountId INT PRIMARY KEY, amount INT, "
                    + "closeDate INT, accountName CHAR(100))");
            
            // Create CONTACT Table
            stat.executeUpdate("CREATE TABLE CONTACT (name CHAR(50),"
                    + " email CHAR(50) PRIMARY KEY, phoneNumber CHAR(20))");
            
            // Create WORKS_FOR Table
            stat.executeUpdate("CREATE TABLE WORKS_FOR (email CHAR(50) REFERENCES CONTACT(email), "
                    + "accountId INT REFERENCES ACCOUNT(accountId), "
                    + "PRIMARY KEY (email, accountId))");
            
            // Close connection
            connect.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    @Override
    public String toString() {
        return "Create Database";
    }
}
