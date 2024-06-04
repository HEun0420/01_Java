package com.ohgiraffers.section01.Intro;

public interface OuterCalculator {
    // 내부 인터페이스
    public interface Sum{
        int sumTwoNumbers(int a, int b);
    }

    public  interface Minus{
        int minusTwoNumbers(int a, int b);
    }

    public interface Multiple{
        int miltiple (int a, int b);
    }

    public interface Divisaion{
        int division(int a, int b);
    }




}
