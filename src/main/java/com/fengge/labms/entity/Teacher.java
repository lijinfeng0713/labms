package com.fengge.labms.entity;

/**
 * Created by ljf-ÁºÑàË«ÆÜ on 2016/2/28.
 */


public class Teacher {
    private String teacherId;
    private String password;
    private String name;
    private String department;
    private String title;
    private String gender;
    private String phone;
    private String email;
    private String inYear;
    private String nativePlace;

    public Teacher() {
    }

    public Teacher(String teacherId, String password, String name, String department, String title, String gender, String phone, String email, String inYear, String nativePlace) {
        this.teacherId = teacherId;
        this.password = password;
        this.name = name;
        this.department = department;
        this.title = title;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.inYear = inYear;
        this.nativePlace = nativePlace;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setInYear(String inYear) {
        this.inYear = inYear;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getInYear() {
        return inYear;
    }

    public String getNativePlace() {
        return nativePlace;
    }
}
