package org.example.model;

public class Student {
    private int id;
    private String name;
    private String gender;
    private String classroom;
    private float average;

    public Student(){}
    public Student(int id, String name, String gender, String classroom, float average) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.classroom = classroom;
        this.average = average;
    }
}
