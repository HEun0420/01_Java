package com.ohgiraffers.section03.practice.practice01;

import com.ohgiraffers.section03.practice.practice02.class1;

public class Application {
    public static void main(String[] args) {

        setting setting = new setting();
        setting.setName("맥스");
        setting.setAge(5);
        setting.setKinds("강아지");

        System.out.println(setting.getInfo1());

        setting.setAuthor("Joshua Bloch");
        setting.setBookName("Effective Java");
        setting.setCover("하드커버");
        setting.setPage(416);

        System.out.println(setting.getInfo2());

        setting.setMode("전기차");
        setting.setModel("Tesla Model S");
        setting.setYear(2022);

        System.out.println(setting.getInfo3());

        class1.setName(James);

    }




}