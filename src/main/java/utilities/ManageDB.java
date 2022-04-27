package utilities;

import java.sql.DriverManager;

public class ManageDB extends CommonOps {
    public static void openConnection (String dbURL, String Username, String Password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Con = DriverManager.getConnection(dbURL, Username, Password);
            Sta = Con.createStatement();
        } catch (Exception e) {
            System.out.println("Unable to connect to DATABASE see details:" + e);
        }
    }

    public  static void closeConnection() {
        try {
            Con.close();
        }  catch (Exception e) {
            System.out.println("The DATABASE could not be closed see details:" + e);
        }
    }
}

