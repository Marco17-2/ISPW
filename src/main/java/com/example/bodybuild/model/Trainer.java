package main.java.com.example.bodybuild.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trainer extends LoggedUser{

    private ArrayList<String> endorsements;

    public Trainer(Credentials credentials, String name, String surname, boolean isOnline) {
        super(credentials, name, surname, isOnline);
        this.endorsements = new ArrayList<>();
    }

    public Trainer(Credentials credentials) {
        super(credentials);
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
