package com.example.demo.model;

public class Student {
    public Student() {
    }

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private int id;
    private String gender;

    public Student(String name, int id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }


}
