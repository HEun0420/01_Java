package com.ohjiraffers.scecion01.method;

public class Application07 {
    public static void main(String[] args) {

        /* 매개변수와 리턴값의 복합 활용*/

        int first = 20;
        int second = 10;

        Application07 app7 = new Application07();
        System.out.println("두수를 더한 결과 = " + app7.plusTwoNumber(first, second));
        System.out.println("두수를 뺀 결과 = " + app7.minusTwoNumber(first, second));
        System.out.println("두수를 곱한 결과 = " + app7.multipleTwonumber(first, second));
        System.out.println("두수를 나눈 결과 = " + app7.divideTwonubver(first, second));


    }

    // 두수를 더한 결과를 반환하는 메서드
    public int plusTwoNumber(int first, int second) {
        return first + second; // 30

    }
    // 두수를 뺀 결과를 반환하는 메서드
    public int minusTwoNumber(int first, int second) {
        return first - second; // 10

    }

    // 두수를 곱한 결과를 반환하는 메서드
    public int multipleTwonumber(int first, int second) {
        return first * second; // 200

    }
    // 두수를 나눈 결과를 반환하는 메서드
    public int divideTwonubver(int first, int second) {
        return first / second; // 2





    }
}
