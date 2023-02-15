package com.geekster.erpapp.model;

import java.util.List;

public class Student {

    private int rollNumber;
    private String name;
    private String gender;
    private List<Double> marks;
    private String city;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Double> getMarks() {
        return marks;
    }

    public void setMarks(List<Double> marks) {
        this.marks = marks;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", marks=" + marks +
                ", city='" + city + '\'' +
                '}';
    }

    public Student(int rollNumber, String name, String gender, List<Double> marks, String city) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
        this.city = city;
    }
}
