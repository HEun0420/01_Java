package com.ohgiraffers.test.Member.model;

public class Gold extends Member{
    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }


    protected double rateGold = 0.05;

    @Override
    public double calculateInterest(double cal) {
        double v2 = rateGold * getPoint();
        return v2;
    }


}
