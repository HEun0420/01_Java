package com.ohgiraffers.section.conditional;

import java.util.Scanner;

public class B_IfElse {

    /*
    * [If-else문 표현식]
    *
    * if([조건식]){
    *       // 조건식이 True 일 경우 실행할 명령문
    * } else {
    *      // 조건식이 False 일 경우 실행할 명령문
    * }
    *
    * if문은 조건식의 결과 값이 참(true)이면 if{} 안에 있는 코드를 실행하고
    * 조건식의 결과 값이 거짓(false)이면 else {} 안에 있는 코드를 실행한다.
     */


    // 정수 한 개를 입력받아
    public void testSimpleIfElesStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        //그 수가 홀수이면 "입력하신 숫자는 홀수입니다."라고 출력하고,
        // 홀수가 아니면 "입력하신 숫자는 짝수 입니다." 라고 출력하는 코드를 작성해보자.
        if(num % 2 == 1) {

            System.out.println("입력하신 숫자는 홀수입니다.");
        } else {

            System.out.println("입력하신 숫자는 짝수 입니다.");
        }

        // 단, 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다"라고 출력되도록 한다.
        System.out.println("프로그램을 종료합니다.");
    }




}
