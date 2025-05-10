package main.java.com.example.bodybuild.beans;

public class RequestBean {
    public long ID;
    public ScheduleBean scheduleBean;
    public ExerciseBean exerciseBean;
    public String reason;

    public RequestBean(long ID, ScheduleBean scheduleBean, ExerciseBean exerciseBean, String reason) {
        this.ID = ID;
        this.scheduleBean = scheduleBean;
        this.exerciseBean = exerciseBean;
        this.reason = reason;
    }

    public RequestBean(long ID) {
        this.ID = ID;
        this.scheduleBean = null;
        this.exerciseBean = null;
        this.reason = "";
    }

    public long getID() {
        return ID;
    }

    public ScheduleBean getSchedule() {
        return scheduleBean;
    }

    public ExerciseBean getExercise() {
        return exerciseBean;
    }

    public String getReason() {
        return reason;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setScheduleBean(ScheduleBean scheduleBean) {
        this.scheduleBean = scheduleBean;
    }

    public void setExerciseBean(ExerciseBean exerciseBean) {
        this.exerciseBean = exerciseBean;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
