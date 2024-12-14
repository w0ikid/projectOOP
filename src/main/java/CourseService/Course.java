package CourseService;

public class Course {

    private String name;
    private String courseId;
    private int credits;

    public Course() {
    }

    public Course(String name, String courseId, int credits) {
        this.name = name;
        this.courseId = courseId;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", courseId='" + courseId + '\'' +
                ", credits=" + credits +
                '}';
    }
}
