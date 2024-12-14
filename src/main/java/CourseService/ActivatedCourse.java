package CourseService;

import java.time.LocalDate;
import java.util.List;

public class ActivatedCourse {

    private int courseId;
    private String courseName;
    private String instructorName;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> enrolledStudents;

    public ActivatedCourse(int courseId, String courseName, String instructorName, LocalDate startDate, LocalDate endDate) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<String> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }


    public boolean addStudent(String studentName) {
        if (enrolledStudents != null && !enrolledStudents.contains(studentName)) {
            enrolledStudents.add(studentName);
            return true;
        }
        return false;
    }

    public boolean removeStudent(String studentName) {
        if (enrolledStudents != null && enrolledStudents.contains(studentName)) {
            enrolledStudents.remove(studentName);
            return true;
        }
        return false;
    }

    public boolean isStudentEnrolled(String studentName) {
        return enrolledStudents != null && enrolledStudents.contains(studentName);
    }

    public String toString() {
        return "ActivatedCourse{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
}
