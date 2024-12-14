package StudentService.Model;

public class PhD extends GraduateStudent {
    
    private String researchTopic;
    private boolean isDissertationCompleted;
    
    public String getResearchTopic() {
        return this.researchTopic;
    }
    
    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }
    
    public boolean isDissertationCompleted() {
        return this.isDissertationCompleted;
    }
    
    public void setDissertationCompleted(boolean isDissertationCompleted) {
        this.isDissertationCompleted = isDissertationCompleted;
    }
    
    public void defendDissertation() {
        if (isDissertationCompleted) {
            System.out.println("Докторская диссертация защищена успешно.");
        } else {
            System.out.println("Докторская диссертация еще не завершена.");
        }
    }
    
    public void publishResearch() {
        System.out.println("Исследование опубликовано.");
    }
    
    public void submitDissertation() {
        System.out.println("Диссертация подана.");
        setDissertationCompleted(true);
    }
    
}
