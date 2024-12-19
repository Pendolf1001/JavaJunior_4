package org.example;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws java.sql.SQLException {



        System.out.println("Hello world!");

        java.sql.Connection conn= DriverManager.getConnection("jdbc:mysql://192.168.1.138:3306","lesson4","1" );

        createDatabase(conn);
    }

    public static void createDatabase(java.sql.Connection connection) throws SQLException{
        String createDataBaseSQL = "CREATE DATABASE IF NOT EXISTS testDB;";
        try (PreparedStatement statement=connection.prepareStatement(createDataBaseSQL)){
            statement.execute();

        }
    }


}