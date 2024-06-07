package com.ohgiraffers.test.Member.model;

public class Vip extends Member{
    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    protected double rateVip = 0.1;

    @Override
    public double calculateInterest(double cal) {
        double v1 = rateVip * getPoint();
        return v1;
    }
}
