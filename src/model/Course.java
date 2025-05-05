package model;


import java.util.ArrayList;
import java.util.List;


// correzione costruttore by bean
public class Course {

    private int courseID;
    private String courseName;
    private Trainer trainer;
    private int slots;
    private int duration;
    private String level;
    private List<SessionCourse> sessions;

    public Course(String courseName, Trainer trainer, int slots, String duration, String level) {

        this.courseName = courseName;
        this.trainer = trainer;
        this.slots = slots;
        this.duration = duration;
        this.level = level;
        sessions = new ArrayList<>();

    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setSlots(int slots) {
        this.slots = slots;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setSessions(List<SessionCourse> sessions) {
        this.sessions = sessions;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public int getSlots() {
        return slots;
    }

    public int getDuration() {
        return duration;
    }

    public String getLevel() {
        return level;
    }

    public List<SessionCourse> getSessions() {
        return sessions;
    }

    public void addSession(SessionCourse session) {
        sessions.add(session);
    }
}
