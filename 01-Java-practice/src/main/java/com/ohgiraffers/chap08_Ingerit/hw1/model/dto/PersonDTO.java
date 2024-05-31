package com.ohgiraffers.chap08_Ingerit.hw1.model.dto;

public class PersonDTO {

    protected String name;
    private int age;
    private double height;
    private double weight;

    public PersonDTO(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeght() {
        return height;
    }

    public void setHeght(double heght) {
        this.height = heght;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PersonDTO" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight;
    }
}
