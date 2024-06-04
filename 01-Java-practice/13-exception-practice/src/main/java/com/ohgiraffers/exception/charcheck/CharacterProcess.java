package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {
    public CharacterProcess() {
    }

//1. 전달된 문자열값에서 영문자가 몇개인지 카운트해서 리턴
//2. 단, 공백문자가 있으면, `CharCheckException` 발생
// a= 97 , z= 122
    // A=65, Z= 90
    // int count = 0; --> 하고 문자열 하나를 추출할 때, a(97)보다 크고 z(122)보다
    // 작으면 소문자
    // A보다 크고 Z보다 작으면 영문자 입니다.
    // count ++;


    public int countAlpha(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 96 & s.charAt(i) < 123) {
                count++;
            } else if (s.charAt(i) > 64 & s.charAt(i) < 91) {
                count++;
            }
        }
            return count;
        }

    }

