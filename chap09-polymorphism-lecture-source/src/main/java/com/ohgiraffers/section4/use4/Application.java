package com.ohgiraffers.section4.use4;

public class Application {
    public static void main(String[] args) {

        Dice dice = new SuperDice();

        Dicer dicer = new Dicer();

        dicer.throwDice(dice);
    }
}
