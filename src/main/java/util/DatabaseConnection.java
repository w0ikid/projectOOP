package com.kbtu.university.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    private static String URL;
    private static String USER;
    private static String PASSWORD;

    // Метод для загрузки настроек из файла config.properties
    static {
        try (FileInputStream input = new FileInputStream("src/main/resources/config.properties")) {
            Properties properties = new Properties();
            properties.load(input);
            URL = properties.getProperty("db.url");
            USER = properties.getProperty("db.username");
            PASSWORD = properties.getProperty("db.password");
        } catch (IOException e) {
            System.out.println("Error reading config.properties: " + e.getMessage());
        }
    }

    /**
     * Метод для подключения к базе данных PostgreSQL.
     *
     * @return объект Connection
     */
    public static Connection connect() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection to PostgreSQL database established successfully.");
            return connection;
        } catch (SQLException e) {
            System.out.println("Error while connecting to the database: " + e.getMessage());
            return null;
        }
    }
}
