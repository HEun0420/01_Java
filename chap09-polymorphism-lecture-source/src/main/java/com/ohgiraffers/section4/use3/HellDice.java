package com.ohgiraffers.section4.use3;

public class HellDice implements Dice {

    @Override
    public int getNumber() {
        System.out.println("4를 구현한다.");
        return 4;
    }
}
