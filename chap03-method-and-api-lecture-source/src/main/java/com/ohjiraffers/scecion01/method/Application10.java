package com.ohjiraffers.scecion01.method;

public class Application10 {
    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 5;

        Calculator calc = new Calculator();


        // 더하기

        int plus = calc.nonStaticPlus1(num1, num2);
        System.out.println("num1 + num2의 값은: " + plus);  // 21

        // 빼기

        int minus = calc.nonStaticMinus1(num1, num2);
        System.out.println("num1 - num2의 값은: " + minus); // 11


        // 곱하기

        int multiple = calc.nonStaticmultiple(num1, num2);
        System.out.println("num1 * num2의 값은: " + multiple); // 80

        // 나누기

        int divide = calc.nonStaticdivide(num1, num2);
        System.out.println("num1 / num2의 값은: " + divide); // 3

        // 나머지

        int divide2 = Calculator.staticDivide(num1, num2);
        System.out.println("num1 % num2의 값은: " + divide2); // 1

        // remainder
    }
}
