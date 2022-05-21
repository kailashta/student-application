package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static  Scanner sc = new Scanner(System.in);
    static   int id=1;
    static   String name;
    static   String gender;
    static   byte age;
    static   String course;
    static   String department;
    static   long phoneNumber;
    static   String emailId;
    static ArrayList<InputStudentDetails> studentInfo = new ArrayList<>();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        // write your code here

        boolean condition = true;
        System.out.println("\n---------------------------------------------------");
        System.out.println("   Welcome To Zoho School For Graduates Studies    ");
        System.out.println("---------------------------------------------------");
        while(condition){

            System.out.println("\n Enter 1 To Add Student Details");
            System.out.println(" Enter 2 To View All Student Details");
            System.out.println(" Enter 3 To View Specific Student Details");
            System.out.println(" Enter 4 To Update Specific Student Details");
            System.out.println(" Enter 5 TO remove Specific Student Details");
            System.out.println(" Enter 6 To Delete All Student Details");
            System.out.println(" Enter 7 To Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1 :
                        studentDetails();
                        boolean duplicateId = false;
                        for (int i=0;i<studentInfo.size();i++) {
                            if (studentInfo.get(i).getId() == id) {
                                duplicateId = true;
                            }
                        }
                        if (duplicateId){

                            System.err.println(" warning!... another Student have that ID \n Please add correct ID ");
                        }
                        else{

                            studentInfo.add(new InputStudentDetails<>(id,name,gender,age,course,department,phoneNumber,emailId));
                            if(studentInfo.size()>=1){
                                System.err.println(".....Student Detail Added Successfully..... ");
                            }

                        }
                        break;
                case 2 :
                        if(studentInfo.isEmpty()){
                            System.err.println(" oops!... There is No Data Available \n please add Student Details");
                        }
                        else{
                            printAllStudentDetails();
                        }
                        break;
                case 3 :
                    if(studentInfo.isEmpty()){
                        System.err.println(" oops!... There is No Data To Display \n please add Student Details");
                    }
                    else{
                        searchSpecificStudent();
                    }
                    break;
                case 4:
                    if(studentInfo.isEmpty()){
                        System.err.println(" oops!... There is No Data To Display \n please add Student Details");
                    }
                    else{
                       updateSpecificStudent();
                    }
                    break;
                case 5:
                    if(studentInfo.isEmpty()){
                        System.err.println(" oops!... There is No Data To Remove..... ");
                    }
                    else{
                        removeSpecificStudentData();
                    }
                    break;
                case 6:
                    if(studentInfo.isEmpty()){
                        System.err.println(" oops!...There is No Data To Deleted....");
                    }
                    else{
                        removeAllData();
                    }
                    break;
                case 7:
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("               THANKS YOU FOR USING MY APPLICATION                        ");
                        System.out.println("--------------------------------------------------------------------------");
                        condition = false;
                        break;
                default:
                        System.err.println("......Please Enter Valid Input ");
                        break;
            }
        }





    }
    private static void studentDetails(){
        System.out.println("Enter id");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name");
        name = sc.nextLine();
        System.out.println("Enter Gender");
        gender = sc.nextLine();
        System.out.println("Enter Age");
        age = sc.nextByte();
        sc.nextLine();
        System.out.println("Enter Course");
        course = sc.nextLine();
        System.out.println("Enter Department");
        department = sc.nextLine();
        System.out.println("Enter Phone Number");
        phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter Email ID");
        emailId = sc.nextLine();
    }
    public static void printAllStudentDetails() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %20s %5s %5s %10s %10s %20s %20s", "STUDENT ID", "NAME", "GENDER","AGE","COURSE","DEPARTMENT","PHONE NUMBER", "EMAIL ID");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < studentInfo.size(); i++) {
            System.out.format("%10s %20s %5s %5s %10s %10s %20s %25s",(studentInfo.get(i).getId()), studentInfo.get(i).getName(),
                    studentInfo.get(i).getGender(),studentInfo.get(i).getAge(),
                    studentInfo.get(i).getCourse(),studentInfo.get(i).getDepartment(),
                    studentInfo.get(i).getPhoneNumber(),studentInfo.get(i).getEmailId());
            System.out.println();
        }
    }
    public static void searchSpecificStudent(){
        System.out.println("Enter Student ID To Display Details");
        int requriesId = sc.nextInt();
        boolean duplicateId = false;
        for (int i=0;i<studentInfo.size();i++) {
            if (studentInfo.get(i).getId() == requriesId) {
                duplicateId = true;
            }
        }
        if(duplicateId) {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%10s %20s %5s %5s %10s %10s %20s %20s", "STUDENT ID", "NAME", "GENDER", "AGE", "COURSE", "DEPARTMENT", "PHONE NUMBER", "EMAIL ID\n");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------");

            for (int i = 0; i < studentInfo.size(); i++) {
                if (studentInfo.get(i).getId() == requriesId) {
                    System.out.format("%10s %20s %5s %5s %10s %10s %20s %25s", (studentInfo.get(i).getId()), studentInfo.get(i).getName(),
                            studentInfo.get(i).getGender(), studentInfo.get(i).getAge(),
                            studentInfo.get(i).getCourse(), studentInfo.get(i).getDepartment(),
                            studentInfo.get(i).getPhoneNumber(), studentInfo.get(i).getEmailId());
                    System.out.println();
                }
            }
        }
        else{
            System.err.println("......oops! There No Student with ID...... : "+requriesId);

        }

    }
    public static void updateSpecificStudent(){
        System.out.println("Enter Student ID To Update Details");
        int requriesId = sc.nextInt();
        boolean duplicateId = true;
        for (int i=0;i<studentInfo.size();i++) {
            if (studentInfo.get(i).getId() == requriesId) {
                duplicateId = false;
            }
        }
        if (duplicateId){
            System.err.println("......oops! There No Student with ID...... : "+requriesId);

        }
        else{
            System.out.println("Enter How Changes you want to make");
            int changesCount  = sc.nextInt();
            for (int j=0;j<changesCount;j++){
                System.out.println("What Do you want to Change");
                System.out.println(" Enter 1 For ID ");
                System.out.println(" Enter 2 For Name ");
                System.out.println(" Enter 3 For Gender");
                System.out.println(" Enter 4 For Age");
                System.out.println(" Enter 5 For Course");
                System.out.println(" Enter 6 For Department");
                System.out.println(" Enter 7 For Phone Number");
                System.out.println(" Enter 8 For Email ID");
                int modificationChoice = sc.nextInt();
                int objectNumber = 0;
                for(int i=0;i<studentInfo.size();i++){
                    if(studentInfo.get(i).getId()==requriesId){
                        objectNumber = i;
                    }
                }
                sc.nextLine();
                switch(modificationChoice){
                    case 1:
                        System.out.println("Enter New ID");
                        int newId = sc.nextInt();
                        if(newId == studentInfo.get(objectNumber).getId() ){
                            System.err.println("\n.....The Old ID and New ID are same.....\n.....please Enter different ID....." +
                                    " ");
                        }
                        else{
                            studentInfo.get(objectNumber).setId(newId);
                            System.out.println("\n.....Student Data Updated Successfully.....");
                        }
                        break;
                    case 2:
                        System.out.println("Enter New Name");
                        String newName = sc.nextLine();
                        if(newName.equals(studentInfo.get(objectNumber).getName()) ){
                            System.out.println("\n.....The Old Name and New Name are same.....\n.....please Enter different Name..... ");
                        }
                        else{
                            studentInfo.get(objectNumber).setName(newName);
                            System.out.println("\n.....Student Data Updated Successfully.....");
                        }
                        break;
                    case 3:
                        System.out.println("Enter New Gender");
                        String newGender = sc.nextLine();
                        if(newGender.equals(studentInfo.get(objectNumber).getGender() )){
                            System.out.println("\n.....The Old Gender and New Gender are same.....\n.....please Enter different Gender..... ");
                        }
                        else{
                            studentInfo.get(objectNumber).setGender(newGender);
                            System.out.println("\n.....Student Data Updated Successfully.....");
                        }
                        break;
                    case 4:
                        System.out.println("Enter New Age");
                        byte newAge = sc.nextByte();
                        if(newAge==(studentInfo.get(objectNumber).getAge() )){
                            System.err.println("\n.....The Old Age and New Age are same.....\n......please Enter different Age.....");
                        }
                        else{
                            studentInfo.get(objectNumber).setAge(newAge);
                            System.out.println("\n.....Student Data Updated Successfully.....");
                        }
                        break;
                    case 5:
                        System.out.println("Enter New Course");
                        String newCourse = sc.nextLine();
                        if(newCourse.equals(studentInfo.get(objectNumber).getCourse() )){
                            System.err.println("\n.....The Old Course and New Course are same.....\n.....please Enter different Course..... ");
                        }
                        else{
                            studentInfo.get(objectNumber).setCourse(newCourse);
                            System.out.println("\n.....Student Data Updated Successfully.....");
                        }
                        break;
                    case 6:
                        System.out.println("Enter New Department");
                        String newDepartment = sc.nextLine();
                        if(newDepartment.equals(studentInfo.get(objectNumber).getDepartment() )){
                            System.out.println("\n.....The Old Department and New Department are same.....\n.....please Enter different Department..... ");
                        }
                        else{
                            studentInfo.get(objectNumber).setDepartment(newDepartment);
                        }
                        break;
                    case 7:
                        System.out.println("Enter New Phone Number");
                        long newPhoneNumber = sc.nextLong();
                        if(newPhoneNumber==(studentInfo.get(objectNumber).getPhoneNumber() )){
                            System.err.println("\n.....The Old Phone Number and New Phone Number are same.....\n.....please Enter different Phone Number..... ");
                        }
                        else{
                            studentInfo.get(objectNumber).setPhoneNumber(newPhoneNumber);
                        }
                        break;
                    case 8:
                        System.out.println("Enter New Email ID");
                        String newEmailID = sc.nextLine();
                        if(newEmailID.equals(studentInfo.get(objectNumber).getEmailId() )){
                            System.err.println("\n.....The Old Age and New Age are same.....\n.....please Enter different Age.....");
                        }
                        else{
                            studentInfo.get(objectNumber).setEmailId(newEmailID);
                        }
                        break;
                    default:
                        System.err.println(".....Please Enter Valid Number.....");


                }

            }


        }

    }
    public static void removeSpecificStudentData(){
        System.out.println("Enter Student ID To Be Removed");
        int removeObjNumber = sc.nextInt();
        boolean duplicateId = true;
        for (int i=0;i<studentInfo.size();i++) {
            if (studentInfo.get(i).getId() == removeObjNumber) {
                duplicateId = false;
            }
        }
        if(duplicateId){
            System.out.println(".....oops! There is No Student with Id :"+removeObjNumber);
        }
        else{
            if(studentInfo.contains(removeObjNumber)){
                for(int i=0;i<studentInfo.size();i++){
                    if(studentInfo.get(i).getId()==removeObjNumber){
                        studentInfo.remove(i);
                    }
                }
                System.out.println("\n.....Student Data Removed Successfully.....");
            }
        }


    }
    public static void removeAllData(){
        studentInfo.clear();
        System.out.println("\n.....All Students Data Deleted Successfully");
    }

}
