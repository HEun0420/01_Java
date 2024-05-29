package com.ohgiraffers.section2.String;

import org.w3c.dom.ls.LSOutput;

public class Application3 {
    public static void main(String[] args) {
        /*
         * split(): 정규표현식을 이용하여 문자열을 분리한다.
         *          비정규화된 문자열을 분리할 때 좋다. (공백 문자열 값 포함)
         *          정규표현식을 이용하기  떄문에 속도가 느리다는 단점을 가진다.
         * StringTokenizer: 문자열의 모든 문자를 구분자로 하여 문자열을 분리한다.
         *                  정형화된 문자열 패턴을 분리할 때 사용하기 좋다. (공백 문자열 무시)
         *                  split보다 속도면에서 더 빠르다.
         *                  구분자를 생략하는 경우 공백이 구분자이다.
         */

        String emp1 = "100, 홍길동,서울, 영업부";  // 모든값 존재
        String emp2 = "200, 유관순, 총무부";      // 주소 x
        String emp3 = "300, 이순신 , 경기도";     // 부서x

        String[] empArr1 = emp1.split(",");
        String[] empArr2 = emp2.split(",");
        String[] empArr3 = emp3.split(",");

        System.out.println("===================empArr1===========");
        for (int i =0; i< empArr1.length; i++){
            System.out.println("empArr1[" + i + "] :"+ empArr1[i]);
        }

        System.out.println("===================empArr2===========");     // 마지막 값 출력 x
        for (int i =0; i< empArr2.length; i++){
            System.out.println("empArr2[" + i + "] :"+ empArr2[i]);
        }

        System.out.println("===================empArr3===========");         // 마지막 값 출력 x
        for (int i =0; i< empArr3.length; i++){
            System.out.println("empArr3[" + i + "] :"+ empArr3[i]);
        }

        String[] empArr4 = emp3.split(",",-1);
        System.out.println("===================empArr4===========");         // 마지막 값 출력 x
        for (int i =0; i< empArr4.length; i++){
            System.out.println("empArr4[" + i + "] :"+ empArr4[i]);
        }



    }


}
