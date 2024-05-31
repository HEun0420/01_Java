package com.ohgiraffers.chap08_Ingerit.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {
   private int salary;
   private String department;


    public EmployeeDTO(String name, int age, double height, double weight,int salary,String department) {
        super(name, age, height, weight);
        this.salary = salary;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary= "+ salary+ ", department" + department;
    }
}
