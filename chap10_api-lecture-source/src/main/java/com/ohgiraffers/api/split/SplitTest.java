package com.ohgiraffers.api.split;

public class SplitTest {
    public static void main(String[] args) {
        String str1 = "J a v a P r o g r a m ";

        //문자열 값을 공백 단위로 분리하 char[] 에 저장하여 출력하시오.
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("char[" + i + "] = " + str1.charAt(i));
        }
        String[] strArr1 = str1.split(" ");
        for (int i = 0; i < strArr1.length; i++) {
            System.out.println("strArr1[" + i + "] :" + strArr1[i]);
        }
        //분리전 글자 및 개수 출력
        System.out.println("분리 전 글자 갯수 : " + str1.length()); // 갯수 출력
        System.out.println("분리 전 글자 : " + str1.trim()); // 분리 전 글자

        //분리 후 문자배열 갯수 출력 확인

        System.out.println("분리 후 문자 배열 갯수 : " + strArr1.length);

        //char[] 값 출력
        for (int i = 0; i < strArr1.length; i++) {
            System.out.println("strArr1[" + i + "] :" + strArr1[i]);
        }

        //char[] 을 다시 String 으로 변환, 모두 대문자로 변환하여 출력
        String str2 = "";
        System.out.print("char[] 을 다시 String 으로 변환:");
        for (String newStr1 : strArr1) {
            str2 = str2 + newStr1;
        }
        System.out.println();
        System.out.println(str2.toUpperCase());
//        System.out.println(newStr1.toUpperCase());

    }
}
