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
