package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        //1. 실행할 메소드 작성 : public void test1(){}
        //   키보드로 문자열을 입력받아 사용
        //   `countAlpha` 메소드로 문자열 전달하고, 실행결과 받아 출력함.
        //    반드시 try ~ catch 문 사용.
        //  에러메시지 : "체크할 문자열 안에 공백 포함할 수 없습니다."

        public void test1(){
            CharacterProcess cp = new CharacterProcess();
            Scanner sc = new Scanner();
            sc.nextInt();
            cp.countAlpha("Hello World");

            CharCheckException ccE = new CharCheckException();
            try {
                ccE.ccException();
            } catch (Exception e) {
        }
        }



        //[수행결과]
        //
        //문자열을 입력하세요 : Hello World
        //
        //체크할 문자열 안에 공백 포함할 수 없습니다.

}




