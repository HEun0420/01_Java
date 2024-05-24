package com.ohgiraffers.section03.practice.practice02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        Class1 cl1 = new Class1();
        cl1.setName("James");
        cl1.setAge2(30);
        cl1.setGene("남자");

        System.out.println(cl1.getInfo());

        cl1.setMerry(true);
        cl1.setChild(true);
    }
}
