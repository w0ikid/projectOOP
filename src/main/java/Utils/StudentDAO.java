package Utils;

import core.model.Gender;
import core.model.Role;
import java.sql.*;
import StudentService.Model.Student;

public class StudentDAO {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/wspPoject";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "140205091205";

    public void registerStudent(Student student) {
        String userSql = "INSERT INTO users (email, password, name, surname, phone_number, gender, family_status, role, is_admin) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String studentSql = "INSERT INTO students (user_id, faculty, year_of_study, member) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement userStatement = connection.prepareStatement(userSql, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement studentStatement = connection.prepareStatement(studentSql)) {

            userStatement.setString(1, student.getEmail());
            userStatement.setString(2, student.getPassword());
            userStatement.setString(3, student.getName());
            userStatement.setString(4, student.getSurname());
            userStatement.setString(5, student.getPhoneNumber());
            userStatement.setString(6, student.getGender().toString());
            userStatement.setString(7, student.getFamilyStatus());
            userStatement.setString(8, student.getRole().toString());
            userStatement.setBoolean(9, student.isAdmin());
            userStatement.executeUpdate();

            ResultSet generatedKeys = userStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int userId = generatedKeys.getInt(1);

                studentStatement.setInt(1, userId);
                studentStatement.setString(2, student.getFaculty());
                studentStatement.setInt(3, student.getYearOfStudy());
                studentStatement.setString(4, student.getMember());
                studentStatement.executeUpdate();

                System.out.println("Студент успешно зарегистрирован!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка при регистрации студента!");
        }
    }

    public Student getStudentById(int studentId) {
        String sql = "SELECT u.*, s.* FROM users u INNER JOIN students s ON u.id = s.user_id WHERE s.student_id = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, studentId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setEmail(resultSet.getString("email"));
                student.setPassword(resultSet.getString("password"));
                student.setName(resultSet.getString("name"));
                student.setSurname(resultSet.getString("surname"));
                student.setPhoneNumber(resultSet.getString("phone_number"));
                student.setGender(Gender.valueOf(resultSet.getString("gender")));
                student.setFamilyStatus(resultSet.getString("family_status"));
                student.setRole(Role.valueOf(resultSet.getString("role")));
                student.setFaculty(resultSet.getString("faculty"));
                student.setYearOfStudy(resultSet.getInt("year_of_study"));
                student.setMember(resultSet.getString("member"));

                return student;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
