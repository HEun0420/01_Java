package com.ohgiraffers.api.split;

public class SplitTest {
    public static void main(String[] args) {
        String s = "J a v a P r o g r a m ";

        //문자열 값을 공백 단위로 분리하 char[] 에 저장하여 출력하시오.
        for (int i = 0; i < s.length(); i++) {
            System.out.println("char[" + i + "] = " + s.charAt(i));
        }
        String[] strArr1 = s.split(" ");
        for (int i = 0; i < strArr1.length; i++) {
            System.out.println("strArr1[" + i + "] :" + strArr1[i]);
        }

        //분리전 글자 및 개수 출력
        System.out.println("분리 전 글자 갯수 : " + s.length()); // 갯수 출력
        System.out.println("분리 전 글자 : " + s.trim()); // 분리 전 글자

        //분리 후 문자배열 갯수 출력 확인

        System.out.println("분리 후 문자 배열 갯수 : " + strArr1.length);



        //char[] 값 출력
        for (int i = 0; i < strArr1.length; i++) {
            System.out.println("strArr1[" + i + "] :" + strArr1[i]);
        }
//        System.out.println("result = " + result);




        //char[] 을 다시 String 으로 변환, 모두 대문자로 변환하여 출력
        String str2 = "";
        System.out.print("char[] 을 다시 String 으로 변환:");
        for (String newStr1 : strArr1) {
            str2 = str2 + newStr1;
        }
        System.out.println();
        System.out.println(str2.toUpperCase());
//        System.out.println(newStr1.toUpperCase());

//        result = result.toUpperCase();
//        System.out.println(" 모두 대문자로 바꾼 result = " + result);


//
//        // 처리전 글자 출력
//        System.out.println(s);
//
//        // 전 글자갯수 출력
//        System.out.println(s.length());
//
//        // 토큰 처리 후 글자갯수 출력 확인
//        String[] sarr = s.split(" ");
//        System.out.println(sarr.length);
//
//        char[] carr = new char[sarr.length];
//
//        for (int i = 0; i < sarr.length; i++) {
//            carr[i] = sarr[i].charAt(0);
//        }
//
//        //char[] 값 출력
//        System.out.println(Arrays.toString(carr)); // [J, a, v, a, P, r, o, g, r, a, m]
//        System.out.println(carr); // 문자열로 출력 "JavaProgram"
//
//        //char[] 을 다시 String 으로 바꾼 후 모두 대문자로 변환하여 출력
//        System.out.println(new String(carr).toUpperCase()); // JAVAPROGRAM


    }
}
