package com.ohgiraffers.section5.typecasting;

public class Apllication2 {
    public static void main(String[] args) {

        /*
        * 강제 형변환
        *
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환 한다.
        * 예시) (바꿀자료형) 값;
         */

        /*
        * 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
        * 1. 강제형 규칙
        *   1-1. 큰 자료형에서 작은 자료형으로 변경시 강제 형변환이 필요하다.
        *   1-2. 실수를 정수로 변경 시 강제형변환이 필요하다.
        *   1-3. 문자형을 int미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
        *   1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
         */

        // long 자료형 -> int 자료형
        long lnum = 8;
        // int inum = lnum; // 데이터 손실 가능성을 컴파일러가 알려준다
        int inum = (int) lnum; // 변경하려는 자료형을 명시하여, 강제 형변환을 해야한다.
        System.out.println("inum = " + inum); // 8

        short snum = (short) inum;
        System.out.println("snum = " + snum); // 8

        byte bnum = (byte) snum;
        System.out.println("bnum = " + bnum); // 8

        // 실수끼리의 강제형변환
        double dnum = 8.0;
        // float fnum = dnum;
        float fnum = (float) dnum;
        System.out.println("fnum = "  + fnum); // 8.0

        // 실수를 정수로 변경시 강제 형변환
        float fnum2 = 4.0f;
        // long lnum2 = fnum2;
        long lnum2 = (long) fnum2;
        System.out.println("lnum2 = " + lnum2); // 4

        // 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요
        char ch = 'a';

        //byte bnum2 = (byte) ch;
        byte bnum2 = (byte) ch;
        System.out.println("bnum2 = " + bnum2); // 97

        short snum2 = (short) ch;
        System.out.println("snum2 = " + snum2); // 97

        // 정수를 char 자료형에 강제형변환해서 대입하기
        int num1 = 97;
        int num2 = -97; // 음수도 형변환이 가능하다.

        char ch2 = (char) num1;
        System.out.println("ch2 = " + ch2); // a
        char ch3 = (char) num2;
        System.out.println("ch3 = " + ch3);

        /*강제 형변환을 해도 논리형은 규칙에서 제외된다.*/
        boolean isTrue = true;
        //  byte b = (byte) isTrue;
        //  short s = (short) isTrue;
        //  int i =  (int) isTrue;
        //  long l = (long) isTrue;
        //  char c = (char) isTrue;
        //  float f = (float) isTrue;
        //  double d = (double) isTrue;


    }
}
