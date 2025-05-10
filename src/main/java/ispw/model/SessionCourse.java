package ispw.model;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class SessionCourse {

    private DayOfWeek day;
    private LocalTime start;
    private LocalTime end;

    public void SessionCourse(DayOfWeek day, LocalTime start, LocalTime end) {

        this.day = day;
        this.start = start;
        this.end = end;

    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public LocalTime getEnd() {
        return end;
    }

    public DayOfWeek getDay() {
        return day;
    }

    public LocalTime getStart() {
        return start;
    }
}
