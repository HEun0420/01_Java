package com.ohgiraffers.section4.use3;

import java.util.Random;

public class SuperDice implements Dice{

    private int min;
    private int max;

    public SuperDice(){
        this.min= 1;
        this.max= 10;
    }

    @Override
    public int getNumber() {
        Random random = new Random();
        return (random.nextInt(max - min + 1) + min);
    // return (int)(Math.radom()* (max - min +1 ) + min);
    }
}
