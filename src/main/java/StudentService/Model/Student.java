package StudentService.Model;

import ResearcherService.Model.*;
import core.model.User;

public class Student extends User {
    
    private String faculty;
    private int yearOfStudy;
    private String member;
    
    private Researcher researcherInstance;
    
    public String getFaculty() {
        return this.faculty;
    }
    
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    
    public int getYearOfStudy() {
        return this.yearOfStudy;
    }
    
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    
    public String getMember() {
        return this.member;
    }
    
    public void setMember(String member) {
        this.member = member;
    }
    
    public Researcher getResearcherInstance() {
        return this.researcherInstance;
    }
    
    public void setResearcherInstance(Researcher researcherInstance) {
        this.researcherInstance = researcherInstance;
    }                         
    
    public void register() {
        System.out.println("Студент зарегистрирован.");
    }
    
    public String getTeacherInfo() {
        return "Информация о преподавателе";
    }
    
    public void viewTranscript() {
        System.out.println("Транскрипт просмотрен.");
    }
    
    public void viewFinancialInfo() {
        System.out.println("Финансовая информация просмотрена.");
    }
    
    public void rateTeacher() {
        System.out.println("Преподаватель оценен.");
    }
    
    public void toRequest() {
        System.out.println("Запрос отправлен.");
    }
    
    public void viewSchedules() {
        System.out.println("Расписание просмотрено.");
    }
    
    public void FXRegister() {
        System.out.println("FX регистрация выполнена.");
    }
    
    public void willBeAssistent() {
        System.out.println("Студент стал ассистентом.");
    }
    
    public void viewFiles() {
        System.out.println("Файлы просмотрены.");
    }
    
    public void viewExamSchedule() {
        System.out.println("Расписание экзаменов просмотрено.");
    }
}
