package model;

import java.util.Date;

public class User {

    private Long id;
    private String fName;
    private String lName;
    private String gender;
    private Date dob;
    private String userName;
    private String password;

    public User(Long id, String fName, String lName, String gender, Date dob, String userName, String password) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.dob = dob;
        this.userName = userName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
