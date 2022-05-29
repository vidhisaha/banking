package com.example.userlogin;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class DataConncection {

    public static Connection getConnection() throws SQLException {
        String databaseName = "transactions"; // Database Name
        String databaseUser = "root"; // Database User
        String databasePassword = "klmp3631"; // Database Password
        String url = "jdbc:mysql://localhost:3306/" + databaseName + "?useSSL=false"; // Database URL
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, databaseUser, databasePassword);
            System.out.println(connection);
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        return connection;
    }


}
