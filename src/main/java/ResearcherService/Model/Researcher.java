package ResearcherService.Model;

import java.util.ArrayList;
import java.util.List;

import core.model.Gender;
import core.model.Role;
import core.model.User;

public class Researcher extends User {

    private String researchField;
    private List<String> publications;

    public Researcher(int id, String email, String password, String personAllInfo, String name, String surname,
            String phoneNumber, Gender gender, String familyStatus, Role role, boolean isAdmin, 
            String msgController, String researchField) {
    	super(id, email, password, personAllInfo, name, surname, phoneNumber, gender, familyStatus, role, isAdmin, msgController);
    	this.researchField = researchField;
    	this.publications = new ArrayList<>();
    }

    public String getResearchField() {
        return this.researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public List<String> getPublications() {
        return this.publications;
    }

    public void addPublication(String publication) {
        this.publications.add(publication);
    }

    public void removePublication(String publication) {
        this.publications.remove(publication);
    }

    public String getResearcherInfo() {
        return "Имя: " + getName() + "\n" +
               "Email: " + getEmail() + "\n" +
               "Область исследований: " + this.researchField + "\n" +
               "Публикации: " + String.join(", ", this.publications);
    }

}
