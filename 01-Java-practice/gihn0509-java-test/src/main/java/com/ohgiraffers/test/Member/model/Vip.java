package com.ohgiraffers.test.Member.model;

public class Vip extends Member{
    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public void calculateInterest(double cal) {
        super.calculateInterest(cal);
    }
}
