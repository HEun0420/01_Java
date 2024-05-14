package com.ohgriraffers.section7.practice;

public class Application1 {
    public static void main(String[] args) {

        /* 산술 연산자
        * 1. 변수 a가 15이고, b가 4 일 때, a/b의 값을 구하세요.
        * 2. 두 수 8과 3에 대해 나머지 연산을 수행하는 코드를 작성하세요.
        * 3.5*2-3을 계산하고 결과를 출력하는 코드를 작성하세요.
         */

        System.out.println();
        System.out.println("=== 산술 연산자 =====");

        int a = 15;
        int b = 4;

        System.out.println("문제 1번: " + (a / b)); // 3
        System.out.println("문제 2번: " + (8 % 3)); // 2
        System.out.println("문제 3번: " + (5 * 2 - 3)); // 7

        /* 복합 대입 연산자
        * 1. 변수 x가 10일 때, x += 5의 결과는 얼마인가요?
        * 2. 변수 x가 20일 때, y /= 4의 결과를 구하세요
        * 3. 변수 z가 8이고, z %= 3을 수행한 후의 z의 값을 구하세요.
         */

        System.out.println();
        System.out.println("=== 복합 대입 연산자 ===");

        int x = 10;
        int y = 20;
        int z = 8;

        System.out.println("문제 1번: " + (x += 5)); // 15
        System.out.println("문제 2번: " + (y /= 4)); // 5
        System.out.println("문제 3번: " + (z %= 3)); // 2

        /* 증감 연산자
        * 1. 변수 i가 0일 때, i++ 후의 i의 값을 출력하세요.
        * 2. int j = 10; 선언 후 -j의 결과를 출력하세요.
        * 3. int k = 5; 선언 후 k 값을 증가시키고, 증가된 값을 출력하는 코드를 작성하세요.
         */
        System.out.println();
        System.out.println("=== 증감 연산자 ===");

        int i = 0;
        int j = 10;
        int k = 5;

        i++;
        System.out.println("문제 1번 i: " + i); // 1

        j *= -1;
        System.out.println("문제 2번 j: " + j);

        k++;
        System.out.println("문제 3번 k: " + k); // 6

        /*비교 연산자
        * 1. 두 변수 num1 = 10, num2 = 20이 같은지 비교하는 코드를 작성하세요.
        * 2.15가 10보다 큰지 확인하는 Java 코드를 작성하세요.
        * 3. 변수 age가 18 이상인지 확인하는 조건문을 작성하세요.
         */

        System.out.println();
        System.out.println("== 비교연산자 ==");

        int num1 = 10;
        int num2 = 20;
        System.out.println("num1과 num2가 같은지: " + (num1 == num2)); // false

        int num3 = 15;
        System.out.println("15가 10보다 큰지 확인하는 코드: " + (num3 > num1)); // true

        int age = 28;
        System.out.println("age가 18 이상인지: " + (age >= 18));

        /*논리 연산자
        * 1. 변수 bool1 = true, bool2 = false일 때, 둘 다 참이어야 참을 반환하는 조건문을 작성하세요.
        * 2. int age = 20;이 18 이상이면서 65 미만인지 확인하는 코드를 작성하세요.
        * 3. 변수 x = 10, y = 20일 때, x가 10이 아니거나 y가 25 이상인지 확인하는 코드를 작성하세요.
         */

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1 && bool2);

        age = 20;

        System.out.println("age가 18 이상이면서 65 미만인지 코드: " + (age >=18 && age < 65));

        x = 10;
        y = 20;
        System.out.println("x가 10이 아니거나 y가 25 이상: " + (x != 10 || y > 25));









    }
}
