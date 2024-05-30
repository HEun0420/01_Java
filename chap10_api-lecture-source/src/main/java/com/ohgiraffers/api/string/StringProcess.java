package com.ohgiraffers.api.string;

public class StringProcess {


    public String preChar(String s) {
       char firstLetter =s.charAt(0);  // 뽑은 앞자리 문자
       char replaceFirstLetter= Character.toUpperCase(firstLetter); // 변환할 앞자리 문자
        return s.replace(s.charAt(0),replaceFirstLetter); // 앞자리 수를 rpfl로 변환

//        String newStr = s.substring(0,1);
//        newStr = newStr.toUpperCase();
//        newStr += newStr.substring(1);
//        return newStr;
    }
    /*
    * 다른 풀이
     */
//// 1.문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성 +preChar(String s): String
//    public String preChar(String s) {
//
//        return s.substring(0, 1).toUpperCase() + s.substring(1);
//
//    }
//
//    // 1.문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성 +preChar(String s): String
//    public String preChar2(String s) {
//
//        char[] c = s.toCharArray();
//
//        if(c[0]>='a' && c[0]<='z')
//            c[0] = (char)(c[0]-32);
//
//        return new String(c);


    public int charSu(String s2, char c) {
 //**
        int count= 0;
        for (int i=0; i<s2.length(); i++) {
            if(s2.charAt(i)==c){
             count++;
            }
        }
        return count;
    }
}
