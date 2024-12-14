package StudentService.Model;

public class Master extends GraduateStudent {
    
    private String thesisTopic;
    private boolean isThesisCompleted;                      
    
    public String getThesisTopic() {
        return this.thesisTopic;
    }
    
    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }
    
    public boolean isThesisCompleted() {
        return this.isThesisCompleted;
    }
    
    public void setThesisCompleted(boolean isThesisCompleted) {
        this.isThesisCompleted = isThesisCompleted;
    }                         
    
    public void defendThesis() {
        if (isThesisCompleted) {
            System.out.println("Магистерская диссертация успешно защищена.");
        } else {
            System.out.println("Магистерская диссертация еще не завершена.");
        }
    }
    
    public void submitThesis() {
        System.out.println("Магистерская диссертация подана.");
        setThesisCompleted(true);
    }

    public void publishResearch() {
        System.out.println("Исследование магистранта опубликовано.");
    }
    
    public void registerCourses() {
        System.out.println("Магистрант зарегистрирован на курсы.");
    }
}