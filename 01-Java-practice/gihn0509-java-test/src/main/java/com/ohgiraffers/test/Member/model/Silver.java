package com.ohgiraffers.test.Member.model;

public class Silver extends Member{
    public Silver(String name, String grade, int point) {
        super(name, grade, point);
    }

    protected double rateSilver = 0.02;

    @Override
    public double calculateInterest(double cal) {
        double v3 = rateSilver * getPoint();
        return v3;
    }
}
