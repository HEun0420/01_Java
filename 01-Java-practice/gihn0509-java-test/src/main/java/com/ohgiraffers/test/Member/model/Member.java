package com.ohgiraffers.test.Member.model;

public abstract class Member {

    private String name;
    private String grade;
    private int point;

    public Member(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public double calculateInterest(double cal) {
        if (this instanceof Gold) {
            return point * ((Gold) this).rateGold;
        } else if (this instanceof Silver) {
            return point * ((Silver) this).rateSilver;
        } else if (this instanceof Vip) {
            return point * ((Vip) this).rateVip;
        }
        return cal;
    }


}

