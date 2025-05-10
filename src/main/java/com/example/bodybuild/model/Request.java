package main.java.com.example.bodybuild.model;

public class Request {
    public long ID;
    public Schedule schedule;
    public Exercise exercise;
    public String reason;

    public Request(long ID, Schedule schedule, Exercise exercise, String reason) {
        this.ID = ID;
        this.schedule = schedule;
        this.exercise = exercise;
        this.reason = reason;
    }

    public Request(long ID) {
        this.ID = ID;
        this.schedule = null;
        this.exercise = null;
        this.reason = "";
    }

    public long getID() {
        return ID;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public String getReason() {
        return reason;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
