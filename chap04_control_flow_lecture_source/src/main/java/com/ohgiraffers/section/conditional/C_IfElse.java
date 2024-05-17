package com.ohgiraffers.section.conditional;

import java.util.Scanner;

public class C_IfElse {

    /*
    * [if-else-it문 표현식]
    *
    * if([조건식1]) {
    *   // 조건식1이 true일 때 실행할 명령문
    * } else if([조건식2]) {
    *   // 조건식1이 false이고, 조건식2가 true일 때 실행할 명령문
    * } elst {
    *   // 조건식1 false이고, 조건식2가 false일 때 실행할 명령문
    * }
    *
    * if-else-if문은 조건식 1의 결과 값이 참(true)이면 if {} 안에 있는 코드를 실행하고,
    * 조건식 1일 false이면 조건식 2를 확인하여 참(true)이면 else if {} 안에 있는 코드를 실행한다.
    * 조건식 1과 조건식 2가 결과값이 모두 거짓(false)이면 else {} 안에 있는 코드를 실행한다.
     */

    /*
    * 금도기 은도끼 동화에서 산신령이 어떤 도끼가 나무꾼의 도끼인지 물어보는 시나리오
     */

    public void tetsSimpleIfElseStatement() {
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

        System.out.println("어느 도끼가 너의 도끼이냐 (1. 금도끼 2. 은도끼 3. 쇠도끼");

        Scanner sc =new Scanner(System.in);
        int answer =sc.nextInt(); // 1, 2, 3 중에 받아온다.

        if(answer == 1) {
            System.out.println("이런 거짓말쟁이!! 너에게는 아무 도끼도 줄 수 없구나, 이 욕심쟁이야!!");
        } else if(answer == 2) {
            System.out.println("욕심이 과하지는 않지만, 넌 거짓말을 하고 있구나!! 어서 썩 사라지거라");
        } else if(answer== 3){
            System.out.println("오호~ 정직하구나 금도끼, 은도끼, 쇠도끼 전부 다 가져가거라~");
        } else {
            System.out.println("잘못 입력했구나. 돌아가거라 ~");
        }
        System.out.println("그렇게.. 산신령은.. 다시 연못으로 사라지고 말았다...");

    }


}
