package ManagerService.Model;

import java.util.List;

public class Manager {

    private List<String> listManager;
    private List<String> requests;
    
    public List<String> getListManager() {
        return this.listManager;
    }
    
    public void setListManager(List<String> listManager) {
        this.listManager = listManager;
    }
    
    public List<String> getRequests() {
        return this.requests;
    }
    
    public void setRequests(List<String> requests) {
        this.requests = requests;
    }

    public String getTeacherInfo() {
        return "Информация о преподавателе";
    }
    
    public String getStudentInfo() {
        return "Информация о студенте";
    }
    
    public String getStudentsRequests() {
        return "Запросы студентов";
    }
}
