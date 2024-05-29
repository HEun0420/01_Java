package com.ohgiraffers.section4.use4;

public class Dicer {
    /*
    * - throwDice 메서드를 가지고 있는 클래스
- throwDice
    - Dice를 매개변수로 받는다.
    - 해당 Dice의 getNumber()를 통해 정수를 반환받고
    - dice Number를 출력해준다.
     */

    public void throwDice(Dice dice){
        int num= dice.getNumber();
        System.out.println(" 내가 나온 숫자는 ["+ num +"]이다");
    }

}
