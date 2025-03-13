package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
   private final static String URL = "jdbc:mysql://localhost/dbl";
   private final static String USER = "root";
   private final static String PASSWORD = "root";
    public static Connection getConnection() {
        Connection connection = null;
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        return connection;
    }
}
