package org.example;

import java.sql.*;


public class Homework {

    private static final String URL = "jdbc:postgresql://localhost:5432/homework3";
    private static final String USER_NAME = "postgres";
    private static final String PASSWORD = "0000";

    public static Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            System.out.println("Connected to the postgresql successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return connection;
    }
}
