package jm.task.core.jdbc.util;

import com.mysql.cj.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util implements AutoCloseable {
   private final static String URL = "jdbc:mysql://localhost/dbl";
   private final static String USER = "root";
   private final static String PASSWORD = "root";
   private static Connection connection;
    public static Connection getConnection() {
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD) ) {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        return connection;
    }

    @Override
    public void close() throws Exception {
        connection.close();
    }
}

