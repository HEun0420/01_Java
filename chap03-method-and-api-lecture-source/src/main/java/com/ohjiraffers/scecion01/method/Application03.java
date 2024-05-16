package com.ohjiraffers.scecion01.method;

public class Application03 {
    public static void main(String[] args) {

        int num =0;

        /*
        * 전달인자와 매개변수를 이용한 메소드 호출
        *
        * 변수의 종류
        *   1. 지역변수
        *   2. 매개변수
        *   3. 전역변수(필드)
        *   4. 클래스(static) 변수
         */

        /*
        * 지역변수
        *
        * 지역변수는 선언한 메소드 블럭(영역) 내부에서만 사용 가능하다.
        * 다른 메소드간 서로 공유해야하는 값이 존재할 경우, 메소드 호출시 사용하는 괄호를 이용하여 값을 전달할 수 있다.
        * 이 때, 전달되는 값을 전달인자라고 부르고
        * 메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 매개변수라고 부른다.
         */

        Application03 app3 = new Application03();

        app3.testMethod(28);
//        app3.testMethod( "28"); // 자료형이 틀림
//        app3.testMethod(20,30,40); // 갯수가 틀림
//        app3.testMethod(); // 아무것도 들어가지 않음

        // 전달인자와 매개변수를 이용한 메소드 호출 테스트

        int age = 15;
        // String str = "15";
        app3. testMethod(age);

        // 자동형변환을 이용해 값 전달이 가능하다.
        byte byteAge = 10;
        app3. testMethod(byteAge); // 자동형변환이 가능해서 byte임에도 int 출력

        long longAge = 5;
        app3. testMethod((int)longAge); // longAge로는 오류가 나니, 강제형변환 ()를 사용

        app3. testMethod(age + 3); // 15+ 3

    }

    // 나이를 받아와서 "당신의 나이는 ~세 입니다."

    public void testMethod(int age) {

        System.out.println("당신의 나이는 " + age +"세 입니다.");

    }

    // 순서-> 메인 시작-> 28을 인식하고 매소드 시작-> 매소드 끝-> 바로 밑에 15 인식하고 매소드 시작-> 매소드 종료






    }

