package com.example.firestore;

public class Counselor {

    protected String name;
    protected String email;
    protected String phone;
    protected String password;
    protected String myCounselee;
    protected String contract;
    protected String codeNum;

    public Counselor(String name, String email, String phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public Counselor(String name, String email, String phone, String password, String contract) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.contract = contract;
    }

    public Counselor(String name, String email, String phone, String password, String contract, String codeNum) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.contract = contract;
        this.codeNum = codeNum;
    }

    public Counselor(String name, String email, String phone, String password, String myCounselee, String contract, String codeNum) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.myCounselee = myCounselee;
        this.contract = contract;
        this.codeNum = codeNum;
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

    public String getMyCounselee() {
        return myCounselee;
    }

    public void setMyCounselee(String myCounselee) {
        this.myCounselee = myCounselee;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getCodeNum() {
        return codeNum;
    }

    public void setCodeNum(String codeNum) {
        this.codeNum = codeNum;
    }
}
