package StudentService.Model;

public class GraduateStudent extends Student {

    private String researchTopic;
    private boolean isResearchProjectComplete;
    
    public String getResearchTopic() {
        return this.researchTopic;
    }
    
    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public boolean isResearchProjectComplete() {
        return this.isResearchProjectComplete;
    }
    
    public void setResearchProjectComplete(boolean isResearchProjectComplete) {
        this.isResearchProjectComplete = isResearchProjectComplete;
    }

    
    public void submitResearchProject() {
        System.out.println("Исследовательский проект подан.");
        setResearchProjectComplete(true);
    }

    public void viewResearchProgress() {
        if (isResearchProjectComplete) {
            System.out.println("Исследовательский проект завершён.");
        } else {
            System.out.println("Исследовательский проект в процессе.");
        }
    }

    public void requestFunding() {
        System.out.println("Заявка на финансирование исследования отправлена.");
    }

    public void registerResearchCourses() {
        System.out.println("Студент зарегистрирован на исследовательские курсы.");
    }
}
