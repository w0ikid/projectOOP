package CourseService;

import java.util.List;

import StudentService.Model.Student;

public class Group {

    private String teacher;
    private List<Student> students;
    private Course course;

    public Group() {
    }

    public Group(String teacher, List<Student> students, Course course) {
        this.teacher = teacher;
        this.students = students;
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    public boolean addStudent(Student studentName) {
        if (students != null && !students.contains(studentName)) {
            students.add(studentName);
            return true;
        }
        return false;
    }


    public boolean removeStudent(String studentName) {
        if (students != null && students.contains(studentName)) {
            students.remove(studentName);
            return true;
        }
        return false;
    }

    public boolean isStudentInGroup(String studentName) {
        return students != null && students.contains(studentName);
    }

    public String toString() {
        return "Group{" +
                "teacher='" + teacher + '\'' +
                ", students=" + students +
                ", course=" + course +
                '}';
    }
}
