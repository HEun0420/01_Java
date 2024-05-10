package com.ohgiraffers.section1.literal;

public class Application2 {
    public static void main(String[] args) {

        // 수업 목표: 값을 직접 연산하여 출력 할 수 있다.
        // 이때 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.

        // 정수와 정수의 연산
        System.out.println("=========== 정수와 정수의 연산 ===========");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10); /// 나누기를 한 몫의 값
        System.out.println(123 % 10); /// 나누기를 한 나머지 값 => 12 ....3

        // 실수와 실수의 연산
        System.out.println("=========== 실수와 실의 연산 ===========");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23); //계산의 결과는 실수 형태로 나온다
        System.out.println(1.23 * 10);
        System.out.println(1.23 / 10);
        System.out.println(1.23 % 1.0);

        // 정수와 실수의 연산
        System.out.println("=========== 정수와 실수의 연산 ===========");
        System.out.println(123 + 0.5); // 실수
        System.out.println(123 - 0.5); // 실수
        System.out.println(123 * 0.5); // 실수
        System.out.println(123 / 0.5); //실수
        System.out.println(123 % 0.5); //실수

        // 문자와 문자의 연산
        // 문자는 내부적으로 숫자로 인식되어 연산된다
        System.out.println("=========== 문자와 문자의 연산 ===========");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        //문자와 정수의 연산
        System.out.println("=========== 문자와 정수의 연산 ===========");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 10);
        System.out.println('a' / 10);
        System.out.println('a' % 10);

        //문자와 실수의 연산
        System.out.println("=========== 문자와 실수의 연산 ===========");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 10.0);
        System.out.println('a' / 10.0);
        System.out.println('a' % 10.0);

        /*
        *결론은 문자는 내부적으로 숫자 취급을 한다.
         */

        // 문자열과 문자열의 연산
        // 문자열과 문자열의 연산은 합치기(이어붙이기)가 된다.
        // 문자열과 문자열의 연산은 '+' 연산만 가능하다
        System.out.println("=========== 문자열과 문자열의 연산 ===========");
        System.out.println("hello" + "world");
        //System.out.println("hello" - "world");
        //System.out.println("hello" * "world");
        //System.out.println("hello" / "world");
        //System.out.println("hello" % "world");

        //문자열과 다른 형태의 값 연산
        System.out.println("=========== 문자열과 다른 형태의 값의 연산 ===========");
        System.out.println("HaEun" + 123); // 정수와의 연산
        System.out.println("KAYah" + 123.456); // 실수와의 연산
        System.out.println("Hora" + 'a'); // 문자와의 연산
        System.out.println("MA_E" + true); // 논리값과의 연산

        // 주의해야할점 숫자로 된 문자열 형태의 값도 + 연산을 햇을 때 문자열 합치기가 된다
        System.out.println("123" + "456"); //123456

        // 논리값과 논리값의 연산
        // 논리값 끼리의 연산은 모든 연산자 사용이 불가능하다.
//        System.out.println(true + false);
//        System.out.println(true - false);
//        System.out.println(true * false);
//        System.out.println(true / false);
//        System.out.println(true % false);

        // 논리값과 정수의 연산도 안된다.
        // 논리값과 실수의 연산도 안된다.
        // 논리값과 문자의 연산도 안되요
        // 논리값과 문자열의 연산은 + 됩니당

        System.out.println("=========== 논리값과 문자열 값의 연산 ===========");
        System.out.println(true + "a");






    }
}
