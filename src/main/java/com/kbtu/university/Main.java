package com.kbtu.university;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.kbtu.university.util.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        // Используем DatabaseConnection для подключения
        Connection connection = DatabaseConnection.connect();
        
        if (connection != null) {
            try {
                // Пример запроса
                String query = "SELECT * FROM users"; // Замените на вашу таблицу
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    System.out.println(resultSet.getString("first_name")); // Замените на имя вашей колонки
                }
            } catch (SQLException e) {
                System.out.println("Error while executing query: " + e.getMessage());
            }
        }
    }
}
