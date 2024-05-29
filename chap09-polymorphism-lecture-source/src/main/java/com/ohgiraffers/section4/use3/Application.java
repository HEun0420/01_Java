package com.ohgiraffers.section4.use3;

public class Application {
    public static void main(String[] args) {

//        Dice dice = new HellDice();   // superDice로 변경해도 적용되게
        Dice dice = new SuperDice();

        Dicer dicer = new Dicer();

        dicer.throwDice(dice);
    }
}
