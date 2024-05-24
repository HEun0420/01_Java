package com.ohgiraffers.section03.practice.practice01;

public class Application {
    public static void main(String[] args) {

        dogbook dogbook = new dogbook();
        dogbook.setName("맥스");
        dogbook.setAge(5);
        dogbook.setKinds("강아지");

        System.out.println(dogbook.getInfo1());

        dogbook.setAuthor("Joshua Bloch");
        dogbook.setBookName("Effective Java");
        dogbook.setCover("하드커버");
        dogbook.setPage(416);

        System.out.println(dogbook.getInfo2());

        dogbook.setMode("전기차");
        dogbook.setModel("Tesla Model S");
        dogbook.setYear(2022);

        System.out.println(dogbook.getInfo3());


    }




}