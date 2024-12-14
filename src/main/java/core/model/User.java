package core.model;

public class User {

    private int id;
    private String email;
    private String password;
    private String personAllInfo;
    private String name;
    private String surname;
    private String phoneNumber;
    private Gender gender; 
    private String familyStatus;
    private Role role;
    private boolean isAdmin;
    private String msgController;
    
    public User() {
    }

    public User(int id, String email, String password, String personAllInfo, String name, String surname,
                String phoneNumber, Gender gender, String familyStatus, Role role, boolean isAdmin, String msgController) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.personAllInfo = personAllInfo;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.familyStatus = familyStatus;
        this.role = role;
        this.isAdmin = isAdmin;
        this.msgController = msgController;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPersonAllInfo() {
        return personAllInfo;
    }

    public void setPersonAllInfo(String personAllInfo) {
        this.personAllInfo = personAllInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getMsgController() {
        return msgController;
    }

    public void setMsgController(String msgController) {
        this.msgController = msgController;
    }


    public boolean signin(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", familyStatus='" + familyStatus + '\'' +
                ", role='" + role + '\'' +
                ", isAdmin=" + isAdmin +
                ", msgController='" + msgController + '\'' +
                '}';
    }
}
