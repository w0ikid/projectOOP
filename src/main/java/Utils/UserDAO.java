package Utils;

import core.model.User;
import core.model.Gender;
import core.model.Role;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/wspPoject";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "140205091205";


    public void registerUser(User user) {
        String sql = "INSERT INTO users (email, password, name, surname, phone_number, gender, family_status, role, is_admin, msg_controller) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getName());
            statement.setString(4, user.getSurname());
            statement.setString(5, user.getPhoneNumber());
            statement.setString(6, user.getGender() != null ? user.getGender().toString() : null);
            statement.setString(7, user.getFamilyStatus());
            statement.setString(8, user.getRole() != null ? user.getRole().toString() : null);
            statement.setBoolean(9, user.isAdmin());
            statement.setString(10, user.getMsgController());

            statement.executeUpdate();
            System.out.println("Пользователь успешно зарегистрирован!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static User loginUser(String email, String password) {
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setEmail(resultSet.getString("email"));
                user.setPassword(resultSet.getString("password"));
                user.setName(resultSet.getString("name"));
                user.setSurname(resultSet.getString("surname"));
                user.setPhoneNumber(resultSet.getString("phone_number"));
                user.setGender(resultSet.getString("gender") != null ? Gender.valueOf(resultSet.getString("gender")) : null);
                user.setFamilyStatus(resultSet.getString("family_status"));
                user.setRole(resultSet.getString("role") != null ? Role.valueOf(resultSet.getString("role")) : null);
                user.setAdmin(resultSet.getBoolean("is_admin"));
                user.setMsgController(resultSet.getString("msg_controller"));
                return user;
            } else {
                System.out.println("Неверные учетные данные!");
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
