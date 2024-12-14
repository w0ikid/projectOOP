package CourseService.Controller;

import CourseService.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseController {

    private List<Course> courses;

    public CourseController() {
        this.courses = new ArrayList<>();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    public boolean addCourse(Course course) {
        if (course != null && !courses.contains(course)) {
            courses.add(course);
            return true;
        }
        return false;
    }

    public boolean removeCourse(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                courses.remove(course);
                return true;
            }
        }
        return false;
    }

    public Course getCourse(String courseId) {
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    public boolean updateCourse(String courseId, Course updatedCourse) {
        Course course = getCourse(courseId);
        if (course != null) {
            course.setName(updatedCourse.getName());
            course.setCredits(updatedCourse.getCredits());
            return true;
        }
        return false;
    }

    public List<Course> listAllCourses() {
        return courses;
    }
    
    public List<Course> listCoursesByName(String name) {
        List<Course> filteredCourses = new ArrayList<>();
        for (Course course : courses) {
            if (course.getName().toLowerCase().contains(name.toLowerCase())) {
                filteredCourses.add(course);
            }
        }
        return filteredCourses;
    }

    public String toString() {
        return "CourseController{" +
                "courses=" + courses +
                '}';
    }
}
