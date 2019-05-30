package com.example.firestore;

public class Counselee {

    protected String name;
    protected String email;
    protected String phone;
    protected String password;
    protected String myCounselor;

    public Counselee(String name, String email, String phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public Counselee(String name, String email, String phone, String password, String myCounselor) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.myCounselor = myCounselor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMyCounselor() {
        return myCounselor;
    }

    public void setMyCounselor(String myCounselor) {
        this.myCounselor = myCounselor;
    }
}
