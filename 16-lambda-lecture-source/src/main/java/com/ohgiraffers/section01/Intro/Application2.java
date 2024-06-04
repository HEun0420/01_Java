package com.ohgiraffers.section01.Intro;

public class Application2 {
    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x ,y) -> x + y;
        OuterCalculator.Minus minus = (x ,y) -> x - y;
        OuterCalculator.Multiple multiple = (x ,y) -> x * y;
        OuterCalculator.Divisaion division = (x ,y) -> x / y;

        System.out.println(" 20과 10 의 합: " + sum.sumTwoNumbers(10,20));
        System.out.println(" 20과 10 의 빼기: " + minus.minusTwoNumbers(10,20));
        System.out.println(" 20과 10 의 곱하기: " + multiple.miltiple(10,20));
        System.out.println(" 20과 10 의 나누기: " + division.division(10,20));


    }
}
