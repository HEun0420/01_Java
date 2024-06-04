package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        //1. 실행할 메소드 작성 : public void test1(){}
        //   키보드로 문자열을 입력받아 사용
        //   `countAlpha` 메소드로 문자열 전달하고, 실행결과 받아 출력함.
        //    반드시 try ~ catch 문 사용.
        //  에러메시지 : "체크할 문자열 안에 공백 포함할 수 없습니다."
//        new Run().test1(); // 밑과 동일 여튼.
        Run run =new Run();
        run.test1();

    }

        public void test1(){
            Scanner sc = new Scanner(System.in);
            System.out.println("문자열을 입력하세요: ");
            try {
                String s = sc.nextLine();
                CharacterProcess cp = new CharacterProcess();
                System.out.println(cp.countAlpha(s));

            CharCheckException ccE = new CharCheckException();

                ccE.ChracterProcess("Hello World");
            } catch (Exception e) {
                System.out.println(" 잘못입력했다.");
        }
        }



        //[수행결과]
        //
        //문자열을 입력하세요 : Hello World
        //
        //체크할 문자열 안에 공백 포함할 수 없습니다.

}




