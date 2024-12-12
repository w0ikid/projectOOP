package CourseService;

import java.util.Map;

import StudentService.Model.Student;

public class Transcript {

    private int totalCredits;
    private double gpa;
    private Map<Student, Double> marks;

    public Transcript() {
    }

    public Transcript(int totalCredits, double gpa, Map<Student, Double> marks) {
        this.totalCredits = totalCredits;
        this.gpa = gpa;
        this.marks = marks;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Map<Student, Double> getMarks() {
        return marks;
    }

    public void setMarks(Map<Student, Double> marks) {
        this.marks = marks;
    }


    public void addOrUpdateMark(Student student, double mark) {
        if (marks != null) {
            marks.put(student, mark);
        }
    }

    public boolean removeMark(String courseId) {
        if (marks != null && marks.containsKey(courseId)) {
            marks.remove(courseId);
            return true;
        }
        return false;
    }

    public Double getMark(String courseId) {
        return marks != null ? marks.get(courseId) : null;
    }

    public void calculateGpa() {
        if (marks == null || marks.isEmpty()) {
            gpa = 0.0;
            return;
        }

        double totalMarks = 0.0;
        for (Double mark : marks.values()) {
            totalMarks += mark;
        }
        gpa = totalMarks / marks.size();
    }

    public String toString() {
        return "Transcript{" +
                "totalCredits=" + totalCredits +
                ", gpa=" + gpa +
                ", marks=" + marks +
                '}';
    }
}
