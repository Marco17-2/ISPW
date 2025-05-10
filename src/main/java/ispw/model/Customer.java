package ispw.model;

import ispw.bean.CustomerBean;

import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String password;
    private List<String> injuries;
    private Boolean subscription;
    private int userID;

    public void setCredentialsByBean(CustomerBean clientbean){
        this.firstName = clientbean.getFirstName();
        this.lastName = clientbean.getLastName();
        this.gender = clientbean.getGender();
        this.email = clientbean.getEmail();
        this.password = clientbean.getPassword();

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSubscription(Boolean subscription) {
        this.subscription = subscription;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getGender(){
        return this.gender;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public Boolean getSubscription(){
        return this.subscription;
    }

    public int getUserID(){
        return this.userID;
    }

    public List<String> getInjuries() {
        return injuries;
    }

    public void setInjuries(List<String> injuries) {
        this.injuries = injuries;
    }

    public void addInjuries(String injuries){
        this.injuries.add(injuries);
    }
}
