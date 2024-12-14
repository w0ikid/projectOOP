/*package main;

import Utils.StudentDAO;
import Utils.EmployeeDAO;
import Utils.UserDAO;
import StudentService.Model.Student;
import core.model.Employee;
import core.model.EmployeeType;
import core.model.Gender;
import core.model.Role;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResourceBundle messages = selectLanguage(scanner);
        UserDAO userDAO = new UserDAO();
        StudentDAO studentDAO = new StudentDAO();
        EmployeeDAO employeeDAO = new EmployeeDAO();

        while (true) {
            System.out.println("\n=================================");
            System.out.println(messages.getString("welcome"));
            System.out.println("1. " + messages.getString("register_student"));
            System.out.println("2. " + messages.getString("register_employee"));
            System.out.println("3. " + messages.getString("view_student"));
            System.out.println("4. " + messages.getString("view_employee"));
            System.out.println("5. " + messages.getString("exit"));
            System.out.println("=================================");

            System.out.print(messages.getString("select_action"));
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print(messages.getString("enter_name"));
                    String studentName = scanner.nextLine();
                    System.out.print(messages.getString("enter_surname"));
                    String studentSurname = scanner.nextLine();
                    System.out.print(messages.getString("enter_email"));
                    String studentEmail = scanner.nextLine();
                    System.out.print(messages.getString("enter_password"));
                    String studentPassword = scanner.nextLine();
                    System.out.print(messages.getString("enter_phone"));
                    String studentPhone = scanner.nextLine();
                    System.out.print(messages.getString("enter_gender"));
                    Gender studentGender = Gender.valueOf(scanner.nextLine().toUpperCase());
                    System.out.print(messages.getString("enter_faculty"));
                    String faculty = scanner.nextLine();
                    System.out.print(messages.getString("enter_year"));
                    int yearOfStudy = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print(messages.getString("enter_member"));
                    String member = scanner.nextLine();

                    Student newStudent = new Student();
                    newStudent.setName(studentName);
                    newStudent.setSurname(studentSurname);
                    newStudent.setEmail(studentEmail);
                    newStudent.setPassword(studentPassword);
                    newStudent.setPhoneNumber(studentPhone);
                    newStudent.setGender(studentGender);
                    newStudent.setRole(Role.STUDENT);
                    newStudent.setFaculty(faculty);
                    newStudent.setYearOfStudy(yearOfStudy);
                    newStudent.setMember(member);

                    studentDAO.registerStudent(newStudent);
                    break;

                case 2:
                    System.out.print(messages.getString("enter_name"));
                    String employeeName = scanner.nextLine();
                    System.out.print(messages.getString("enter_surname"));
                    String employeeSurname = scanner.nextLine();
                    System.out.print(messages.getString("enter_email"));
                    String employeeEmail = scanner.nextLine();
                    System.out.print(messages.getString("enter_password"));
                    String employeePassword = scanner.nextLine();
                    System.out.print(messages.getString("enter_phone"));
                    String employeePhone = scanner.nextLine();
                    System.out.print(messages.getString("enter_gender"));
                    Gender employeeGender = Gender.valueOf(scanner.nextLine().toUpperCase());
                    System.out.print(messages.getString("enter_salary"));
                    int salary = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print(messages.getString("enter_type"));
                    String type = scanner.nextLine();

                    Employee newEmployee = new Employee();
                    newEmployee.setName(employeeName);
                    newEmployee.setSurname(employeeSurname);
                    newEmployee.setEmail(employeeEmail);
                    newEmployee.setPassword(employeePassword);
                    newEmployee.setPhoneNumber(employeePhone);
                    newEmployee.setGender(employeeGender);
                    newEmployee.setRole(Role.EMPLOYEE);
                    newEmployee.setSalary(salary);
                    newEmployee.setType(EmployeeType.valueOf(type.toUpperCase()));

                    employeeDAO.registerEmployee(newEmployee);
                    break;

                case 3:
                    System.out.print(messages.getString("enter_student_id"));
                    int studentId = scanner.nextInt();
                    Student student = studentDAO.getStudentById(studentId);
                    if (student != null) {
                        System.out.println(messages.getString("student_info") + ":");
                        System.out.println(messages.getString("name") + ": " + student.getName());
                        System.out.println(messages.getString("surname") + ": " + student.getSurname());
                        System.out.println(messages.getString("email") + ": " + student.getEmail());
                        System.out.println(messages.getString("faculty") + ": " + student.getFaculty());
                        System.out.println(messages.getString("year_of_study") + ": " + student.getYearOfStudy());
                        System.out.println(messages.getString("member") + ": " + student.getMember());
                    } else {
                        System.out.println(messages.getString("student_not_found"));
                    }
                    break;

                case 4:
                    System.out.print(messages.getString("enter_employee_id"));
                    int employeeId = scanner.nextInt();
                    Employee employee = employeeDAO.getEmployeeById(employeeId);
                    if (employee != null) {
                        System.out.println(messages.getString("employee_info") + ":");
                        System.out.println(messages.getString("name") + ": " + employee.getName());
                        System.out.println(messages.getString("surname") + ": " + employee.getSurname());
                        System.out.println(messages.getString("email") + ": " + employee.getEmail());
                        System.out.println(messages.getString("salary") + ": " + employee.getSalary());
                        System.out.println(messages.getString("type") + ": " + employee.getType());
                    } else {
                        System.out.println(messages.getString("employee_not_found"));
                    }
                    break;

                case 5:
                    System.out.println(messages.getString("exit_message"));
                    scanner.close();
                    return;

                default:
                    System.out.println(messages.getString("invalid_choice"));
            }
        }
    }

    private static ResourceBundle selectLanguage(Scanner scanner) {
        System.out.println("Select language / Тіл таңдау / Выберите язык:");
        System.out.println("1. English");
        System.out.println("2. Қазақша");
        System.out.println("3. Русский");

        int langChoice = scanner.nextInt();
        scanner.nextLine();

        if (langChoice == 3) {
            return ResourceBundle.getBundle("messages", new Locale("ru", "RU"));
        } else if (langChoice == 2) {
            return ResourceBundle.getBundle("messages", new Locale("kk", "KZ"));
        } else {
            return ResourceBundle.getBundle("messages", new Locale("en", "US"));
        }
    }

} */


package main;

import Utils.StudentDAO;
import Utils.EmployeeDAO;
import Utils.UserDAO;
import StudentService.Model.Student;
import core.model.Employee;
import core.model.EmployeeType;
import core.model.Gender;
import core.model.Role;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResourceBundle messages = selectLanguage(scanner);
        UserDAO userDAO = new UserDAO();
        StudentDAO studentDAO = new StudentDAO();
        EmployeeDAO employeeDAO = new EmployeeDAO();

        while (true) {
            System.out.println("\n=================================");
            System.out.println(messages.getString("welcome"));
            System.out.println("1. " + messages.getString("register_student"));
            System.out.println("2. " + messages.getString("register_employee"));
            System.out.println("3. " + messages.getString("view_student"));
            System.out.println("4. " + messages.getString("view_employee"));
            System.out.println("5. " + messages.getString("log_in"));
            System.out.println("6. " + messages.getString("exit"));
            System.out.println("=================================");

            System.out.print(messages.getString("select_action"));
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print(messages.getString("enter_name"));
                    String studentName = scanner.nextLine();
                    System.out.print(messages.getString("enter_surname"));
                    String studentSurname = scanner.nextLine();
                    System.out.print(messages.getString("enter_email"));
                    String studentEmail = scanner.nextLine();
                    System.out.print(messages.getString("enter_password"));
                    String studentPassword = scanner.nextLine();
                    System.out.print(messages.getString("enter_phone"));
                    String studentPhone = scanner.nextLine();
                    System.out.print(messages.getString("enter_gender"));
                    Gender studentGender = Gender.valueOf(scanner.nextLine().toUpperCase());
                    System.out.print(messages.getString("enter_faculty"));
                    String faculty = scanner.nextLine();
                    System.out.print(messages.getString("enter_year"));
                    int yearOfStudy = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print(messages.getString("enter_member"));
                    String member = scanner.nextLine();

                    Student newStudent = new Student();
                    newStudent.setName(studentName);
                    newStudent.setSurname(studentSurname);
                    newStudent.setEmail(studentEmail);
                    newStudent.setPassword(studentPassword);
                    newStudent.setPhoneNumber(studentPhone);
                    newStudent.setGender(studentGender);
                    newStudent.setRole(Role.STUDENT);
                    newStudent.setFaculty(faculty);
                    newStudent.setYearOfStudy(yearOfStudy);
                    newStudent.setMember(member);

                    studentDAO.registerStudent(newStudent);
                    break;

                case 2:
                    System.out.print(messages.getString("enter_name"));
                    String employeeName = scanner.nextLine();
                    System.out.print(messages.getString("enter_surname"));
                    String employeeSurname = scanner.nextLine();
                    System.out.print(messages.getString("enter_email"));
                    String employeeEmail = scanner.nextLine();
                    System.out.print(messages.getString("enter_password"));
                    String employeePassword = scanner.nextLine();
                    System.out.print(messages.getString("enter_phone"));
                    String employeePhone = scanner.nextLine();
                    System.out.print(messages.getString("enter_gender"));
                    Gender employeeGender = Gender.valueOf(scanner.nextLine().toUpperCase());
                    System.out.print(messages.getString("enter_salary"));
                    int salary = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print(messages.getString("enter_type"));
                    String type = scanner.nextLine();

                    Employee newEmployee = new Employee();
                    newEmployee.setName(employeeName);
                    newEmployee.setSurname(employeeSurname);
                    newEmployee.setEmail(employeeEmail);
                    newEmployee.setPassword(employeePassword);
                    newEmployee.setPhoneNumber(employeePhone);
                    newEmployee.setGender(employeeGender);
                    newEmployee.setRole(Role.EMPLOYEE);
                    newEmployee.setSalary(salary);
                    newEmployee.setType(EmployeeType.valueOf(type.toUpperCase()));

                    employeeDAO.registerEmployee(newEmployee);
                    break;

                case 3:
                    System.out.print(messages.getString("enter_student_id"));
                    int studentId = scanner.nextInt();
                    Student student = studentDAO.getStudentById(studentId);
                    if (student != null) {
                        System.out.println(messages.getString("student_info") + ":");
                        System.out.println(messages.getString("name") + ": " + student.getName());
                        System.out.println(messages.getString("surname") + ": " + student.getSurname());
                        System.out.println(messages.getString("email") + ": " + student.getEmail());
                        System.out.println(messages.getString("faculty") + ": " + student.getFaculty());
                        System.out.println(messages.getString("year_of_study") + ": " + student.getYearOfStudy());
                        System.out.println(messages.getString("member") + ": " + student.getMember());
                    } else {
                        System.out.println(messages.getString("student_not_found"));
                    }
                    break;

                case 4:
                    System.out.print(messages.getString("enter_employee_id"));
                    int employeeId = scanner.nextInt();
                    Employee employee = employeeDAO.getEmployeeById(employeeId);
                    if (employee != null) {
                        System.out.println(messages.getString("employee_info") + ":");
                        System.out.println(messages.getString("name") + ": " + employee.getName());
                        System.out.println(messages.getString("surname") + ": " + employee.getSurname());
                        System.out.println(messages.getString("email") + ": " + employee.getEmail());
                        System.out.println(messages.getString("salary") + ": " + employee.getSalary());
                        System.out.println(messages.getString("type") + ": " + employee.getType());
                    } else {
                        System.out.println(messages.getString("employee_not_found"));
                    }
                    break;
                    
                case 5:
                	System.out.print(messages.getString("enter_email"));
                	String email = scanner.next();
                	System.out.print(messages.getString("enter_password"));
                	String password = scanner.next();

                	if (UserDAO.loginUser(email, password) != null) {
                    	System.out.print(messages.getString("hello_you_are_entered"));
                	}
                	break;

                case 6:
                    System.out.println(messages.getString("exit_message"));
                    scanner.close();
                    return;

                default:
                    System.out.println(messages.getString("invalid_choice"));
            }
        }
    }

    private static ResourceBundle selectLanguage(Scanner scanner) {
        System.out.println("Select language / Тіл таңдау / Выберите язык:");
        System.out.println("1. English");
        System.out.println("2. Қазақша");
        System.out.println("3. Русский");

        int langChoice = scanner.nextInt();
        scanner.nextLine();

        if (langChoice == 3) {
            return ResourceBundle.getBundle("messages", new Locale("ru", "RU"));
        } else if (langChoice == 2) {
            return ResourceBundle.getBundle("messages", new Locale("kk", "KZ"));
        } else {
            return ResourceBundle.getBundle("messages", new Locale("en", "US"));
        }
    }

} 