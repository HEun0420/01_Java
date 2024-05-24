package com.ohgiraffers.section03.practice.practice02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Class1 cl1 = new Class1();
        cl1.setName("James");
        cl1.setAge2(30);
        cl1.setGene("남자");

        System.out.println(cl1.getInfo());

        Scanner sc= new Scanner(System.in);
        boolean isMerry = sc.nextBoolean();
        System.out.println("이 사람은 결혼을 했습니까? true/false로 대답해주세요.");
        cl1.isMerry(true);
        boolean isChild = sc.nextBoolean();
        System.out.println("이 사람은 자식이 있습니까? true/false로 대답해주세요.");
        cl1.isChild(true);
    }
}
