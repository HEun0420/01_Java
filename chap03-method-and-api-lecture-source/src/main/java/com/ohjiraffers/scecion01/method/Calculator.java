package com.ohjiraffers.scecion01.method;

public class Calculator {
    // 삼황연산자로 두수를 비교해서 작은 값을 return 해주는 메서드
    public int nonStaticNumber0f(int first,int second) {

        //int return = (first>second)? second : first;

        return (first > second) ? second : first;
    }

    // 삼황연산자로 두수를 비교해서 큰 값을 return 해주는 메서드
    public static int staticNumber0f(int first,int second) {

        return (first > second) ? first : second; // 큰값
    }

    // 더하기, 빼기, 곱하기, 나누기, 나머지
    // 이 각각을 수행할 수 있는 메서드를 만들고
    // 더하기|빼기, 곱하기, 나누기=> non-static
    // 나머지 -->staic

    public int nonStaticPlus1(int num1,int num2) {

        return ( num1 + num2);

    }

    public int nonStaticMinus1(int num1,int num2) {

        return ( num1 - num2);


    }

    public int nonStaticmultiple(int num1,int num2) {

        return ( num1 * num2);

    }

    public int nonStaticdivide(int num1,int num2) {

        return ( num1 / num2);

    }

    public static int staticDivide(int num1,int num2) {

        return ( num1 % num2);

    }

}
