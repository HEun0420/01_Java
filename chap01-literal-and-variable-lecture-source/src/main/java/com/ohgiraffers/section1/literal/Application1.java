package com.ohgiraffers.section1.literal;

public class Application1 {
    public static void main (String[] argss) {

        System.out.print("a");
        System.out.print("a");
        System.out.println("b");
        System.out.print("c");


        System.out.println("아이고 ㅎㅎ");
        System.out.println();


        /*
        *여기 사이에는 모든게 주석이 된다.
         */

        // 수업목표 : 여러 가진 값의 형태를 출력할 수 있다.

        // 정수 출력
        System.out.println(123);
        // 실수 출력
        System.out.println(12.3);

        // 문자 출력
        System.out.println('a');  //문자 형태의 값은 홀따옴표로 감싸주어야한다.
        //System.out.println('ab'); => 문자열이라서 안된다. 한 문자씩
        System.out.println('1'); // 숫자 값이지만 홀따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다
        //System.out.println(''); // 이거 취급 x

        //문자열 출력
        System.out.println("안녕하세요 내 점심은 따뜻한 국!");  //문자열은 문자가 여러개가 나열된 의미하며 쌍따옴표로 감싸져있다
        System.out.println("123"); // 필기: 정수이지만 쌍따옴표로 감싸져 있기 때문에 문자열로 보아야 한다.
        System.out.println(""); //아무값도 없는 빈쌍따옴표도 문자열로 취급한다.
        System.out.println("a"); //한개의 문자도 쌍따옴표로 감싸면 문자열이다 (문자 'a'랑은 다르다)

        //논리값 출력
        System.out.println(true);
        System.out.println(false);



    }
}
