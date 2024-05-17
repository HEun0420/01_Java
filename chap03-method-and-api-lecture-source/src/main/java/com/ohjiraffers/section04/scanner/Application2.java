package com.ohjiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /*
        * nextline() : 공백을 포함한 한 줄 입력을 위한 개행문자 전까지 문자열로 반환한다.
        * next() : 공백문자나 기행문자 전까지 읽어서 문자열로 반환한다.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("인삿말을 입력해주세요."); // 안녕하세요
        String greeting = sc.nextLine();
        System.out.println(greeting);


        System.out.println("인삿말을 입력해주세요."); // 안녕하세요
        String greeting2 = sc.nextLine();
        System.out.println(greeting2);



    }
}
