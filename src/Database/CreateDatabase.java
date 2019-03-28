package Database;

import java.sql.*;

/**
 *
 * @author kenny
 */
//Creates local Apache Derby Database for Account and Contact.
public class CreateDatabase {
    private static final String URL = "jdbc:derby://localhost:1527/CRM";
    
    public CreateDatabase() {
    }
    
    public void execute() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try (Connection connect = DriverManager.getConnection(URL);
                Statement stat = connect.createStatement()) {
            
            stat.executeUpdate("CREATE TABLE ACCOUNT (accountId INT PRIMARY KEY, amount INT, "
                    + "closeDate INT, accountName CHAR(100))");
            
            stat.executeUpdate("CREATE TABLE CONTACT (name CHAR(50),"
                    + " email CHAR(50) PRIMARY KEY, phoneNumber CHAR(20))");
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
