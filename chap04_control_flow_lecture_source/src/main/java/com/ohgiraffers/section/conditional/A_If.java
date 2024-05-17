package com.ohgiraffers.section.conditional;

import java.util.Scanner;

public class A_If {

    /*
    * [if문 표현식]
    * if([조건식]) {
    *       // 조건식이 true일 때 실행할 명령문
    * }
     */

    /*
    * 조건식: true or false 가 나오는 연산식을 조건식이라고 한다.
    * if 문은 조건식의 결과 값이 참(true) 나오면 {} 안에 있는 코드를 실행하고,
    * 조건식의 결과값이 거짓(false) {} 안에 있는 코드를 무시한다.
     */


    // 단일 if 문 흐름 확인
    public void testSimpleIfStatement() {

        // 정수 한개를 입력 받아
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 한개를 입력하시오");
        int num = sc.nextInt();

        // 그 수가 짝수이면 "입력하신 숫자는 짝수입니다." 라고 출력
        // 짝수가 아니면 출력하지 않는 코드를 작성한다.
        if(num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }

        // 단, 조건과 상관없이 프로그램이 종료될 때 " 프로그램을 종료합니다" 라고 출력
        System.out.println("프로그램을 종료합니다");


   }
//
//        // 중첩된 if 문 실행 흐름 확인
//    public void testNestedIfStatment() {
//        // 정수 한개를 입력받아
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("숫자를 한개 입력하세요.");
//        int num = sc.nextInt();
//
//        // 그 수가 양수인 경우에만 짝수인지를 확인하여
//        // 짝수이면 "입력하신 숫자는 양수이면서 짝수입니다." 라고 출력하고,
//        if(num>2) {
//            if (num % 2 == 0) {
//                System.out.println("입력하신 숫자는 양수이면서 짝수입니다.");
//            }
//        }
//
//        // 둘 중 하나라도 해당하지 않으면 아무 내용도 출력하지 않는 코드를 작성해보자.
//        // 단, 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다." 라고 출력한다.
//        System.out.println("프로그램을 종료합니다");


//    }
//
//    // 중첩된 if-else 문 실행 흐름 확인
//    public void testNestedIfStatment() {
//
//        // 숫자를 하나 입력 받아
//        Scanner sc = new Scanner(System.in);
//        System.out.println("정수를 하나 입력하세요 : ");
//        int num = sc.nextInt();
//
//        //양수이면 "입력하신 숫자는 양수입니다." 출력하고
//        // 음수이면 "입력하신 숫자는 음수 입니다." 출력하고
//        if(num!=0){
//            if(num>0){
//                System.out.println("입력하신 숫자는 양수입니다.");
//            } else {
//                System.out.println("입력하신 숫자는 음수 입니다.");
//            }
//            // 단, 0 이면 "0 입니다"라고 출력하세요
//        } else{
//                System.out.println("0 입니다.");
//            }
//        // 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다"라고 출력되도록 한다.
//        System.out.println("프로그램을 종료합니다.");



//    }

}
