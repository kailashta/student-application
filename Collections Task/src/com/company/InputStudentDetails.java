package com.company;

public class InputStudentDetails<isd> {

    private  int id;
    private  String name;
    private  String gender;
    private  byte age;
    private  String course;
    private  String department;

    private  long phoneNumber;
    private  String emailId;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public byte getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCourse() {
        return course;
    }

    public String getDepartment() {
        return department;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public InputStudentDetails(int id, String name, String gender, byte age, String department, String course, long phoneNumber, String emailId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.course = course;
        this.department = department;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }
}
