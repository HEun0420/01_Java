package com.ohgiraffers.chap08_Ingerit.hw1.model.dto;

public class StudentDTO extends PersonDTO {

    private int grade;
    private String major;


    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(name, age, height, weight);
        this.grade = grade;
        this.major = major;
    }


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {

    return super.toString()+ ", grade= " + grade + ", major= " + major;
    }
}




