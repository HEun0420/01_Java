package com.ohgiraffers.exception.charcheck;

public class CharCheckException {

    public void ChracterProcess(String s) throws Exception{
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
        if(s.charAt(i)==126){
            System.out.println("예외가 발생했습니다. 오류입니다.");
        }
    }
//2. 단, 공백문자가 있으면, `CharCheckException` 발생



}
}
