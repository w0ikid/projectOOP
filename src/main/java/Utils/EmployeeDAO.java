package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import core.model.Employee;
import core.model.EmployeeType;
import core.model.Gender;
import core.model.Role;

public class EmployeeDAO {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/wspPoject";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "140205091205";

    public void registerEmployee(Employee employee) {
        String userSql = "INSERT INTO users (email, password, name, surname, phone_number, gender, family_status, role, is_admin) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String employeeSql = "INSERT INTO employees (user_id, salary, access_level, type) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement userStatement = connection.prepareStatement(userSql, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement employeeStatement = connection.prepareStatement(employeeSql)) {

            userStatement.setString(1, employee.getEmail());
            userStatement.setString(2, employee.getPassword());
            userStatement.setString(3, employee.getName());
            userStatement.setString(4, employee.getSurname());
            userStatement.setString(5, employee.getPhoneNumber());
            userStatement.setString(6, employee.getGender().toString());
            userStatement.setString(7, employee.getFamilyStatus());
            userStatement.setString(8, employee.getRole().toString());
            userStatement.setBoolean(9, employee.isAdmin());
            userStatement.executeUpdate();

            ResultSet generatedKeys = userStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int userId = generatedKeys.getInt(1);

                employeeStatement.setInt(1, userId);
                employeeStatement.setInt(2, employee.getSalary());
                employeeStatement.setInt(3, employee.getAccessLevel());
                employeeStatement.setString(4, employee.getType().toString());
                employeeStatement.executeUpdate();

                System.out.println("Сотрудник успешно зарегистрирован!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка при регистрации сотрудника!");
        }
    }

    public Employee getEmployeeById(int employeeId) {
        String sql = "SELECT u.*, e.* FROM users u INNER JOIN employees e ON u.id = e.user_id WHERE e.employee_id = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, employeeId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setEmail(resultSet.getString("email"));
                employee.setPassword(resultSet.getString("password"));
                employee.setName(resultSet.getString("name"));
                employee.setSurname(resultSet.getString("surname"));
                employee.setPhoneNumber(resultSet.getString("phone_number"));
                employee.setGender(Gender.valueOf(resultSet.getString("gender")));
                employee.setFamilyStatus(resultSet.getString("family_status"));
                employee.setRole(Role.valueOf(resultSet.getString("role")));
                employee.setSalary(resultSet.getInt("salary"));
                employee.setType(EmployeeType.valueOf(resultSet.getString("type")));

                return employee;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
