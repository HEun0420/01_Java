package com.ohgiraffers.section03.practice.practice03;

public class Application {
    public static void main(String[] args) {

        class2 cl2 =new class2();
        cl2.setSsdSize(512);
        cl2.setBrand("Dell");
        cl2.setModel("XPS 13");
        cl2.setRamSize(16);

        System.out.println(cl2.getInfo());

    }
}
