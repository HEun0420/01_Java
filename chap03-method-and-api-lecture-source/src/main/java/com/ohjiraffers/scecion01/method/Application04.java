package com.ohjiraffers.scecion01.method;

public class Application04 {
    public static void main(String[] args) {

        /* 여러개의 전달인자를 이용한 메소드의 호출 테스트*/
        Application04 testMehod = new Application04();

        String name = "배하은";
        int age = 28;
        String gender = "여";

    }

    // "당신의 이름은 ~이고, 나이는 ~이며, 성별은 ~입니다."
    public void testMethod(String name, int age, final char gender) {

        System.out.println("당신의 " + name +"이고, 나이는 " + age + "세 이며, 성별은 " + gender +"입니다.");

    }
}
