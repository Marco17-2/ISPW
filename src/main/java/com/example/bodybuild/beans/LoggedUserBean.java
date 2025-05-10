package main.java.com.example.bodybuild.beans;

public abstract class LoggedUserBean {
    private CredentialsBean credentialsBean;
    private String name;
    private String surname;
    private boolean online;

    protected LoggedUserBean(CredentialsBean credentialsBean, String name, String surname, boolean isOnline) {
        this.credentialsBean = credentialsBean;
        this.name = name;
        this.surname = surname;
        this.online = isOnline;
    }

    protected  LoggedUserBean(CredentialsBean credentialsBean){
        this.credentialsBean = credentialsBean;
        this.name = null;
        this.surname = null;
        this.online = false;
    }
    //getter e setter per i nuovi campi

    public CredentialsBean getCredentialsBean() {
        return credentialsBean;
    }

    //FORSE DA TOGLIERE
    public void setCredentialsBean(CredentialsBean credentialsBean) {
        this.credentialsBean = credentialsBean;
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

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

}