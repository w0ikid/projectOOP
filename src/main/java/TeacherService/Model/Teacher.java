package TeacherService.Model;

import core.model.Employee;
import core.model.EmployeeType;

public class Teacher extends Employee {
    
    private EmployeeType type;
    private Object researcherInstance;

    public EmployeeType getType() {
        return this.type;
    }
    
    public void setType(EmployeeType type) {
        this.type = type;
    }

    public Object getResearcherInstance() {
        return this.researcherInstance;
    }
    
    public void setResearcherInstance(Object researcherInstance) {
        this.researcherInstance = researcherInstance;
    }

    public void putMark(String studentId, String courseName, double mark) {
        System.out.println("Оценка " + mark + " поставлена студенту с ID " + studentId + " за курс " + courseName);
    }
    
    public void putAttendance(String studentId, boolean isPresent) {
        String status = isPresent ? "присутствует" : "отсутствует";
        System.out.println("Студент с ID " + studentId + " " + status + " на занятии.");
    }
    
    public void viewTeacherSchedules(String teacherId) {
        System.out.println("Расписание преподавателя с ID " + teacherId);
    }
}
