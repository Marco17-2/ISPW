package ispw.model;

import ispw.bean.RequestBean;

import java.time.LocalDateTime;

public class Reservation {

    Customer customer;
    Course course;
    LocalDateTime dateTime;


    public void Reservation(RequestBean requestBean){
        this.customer = requestBean.getCustomer();
        this.course = requestBean.getCourse();
        this.dateTime = requestBean.getDateTime();
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.dateTime = datetime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDateTime getDatetime() {
        return dateTime;
    }
}
