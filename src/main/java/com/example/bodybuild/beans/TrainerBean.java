package main.java.com.example.bodybuild.beans;

import java.util.ArrayList;
import java.util.List;

public class TrainerBean extends LoggedUserBean {

    private ArrayList<String> endorsements;

    public TrainerBean(CredentialsBean credentialsBean, String name, String surname, boolean isOnline) {
        super(credentialsBean, name, surname, isOnline);
        this.endorsements = new ArrayList<>();
    }

    public TrainerBean(CredentialsBean credentialsBean) {
        super(credentialsBean);
        this.endorsements = new ArrayList<>();
    }

    public ArrayList<String> getEndorsements() {
        return endorsements;
    }

    public void addEndorsement(String endorsement) {
        endorsements.add(endorsement);
    }

    public void setEndorsements(List<String> endorsements) {
        this.endorsements = (ArrayList<String>) endorsements;
    }
}
