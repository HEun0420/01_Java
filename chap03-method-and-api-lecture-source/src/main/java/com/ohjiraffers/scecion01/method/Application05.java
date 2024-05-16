package com.ohjiraffers.scecion01.method;

public class Application05 {
    public static void main(String[] args) {

        /*
        * return(반환)
        *
        * 모든 메소드의 내부에는 return;이 존재한다.
        * void 메소드의 경우 return; 명시적으로 작성하지 않아도, 마지막줄에 자동으로 추가해준다.
        * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가라는 명령이다.
         */

        System.out.println("main() 메소드 시작함...");

        System.out.println("main() 메소드 종료됨...");

    }

    public void testMethod() {
        System.out.println("testMethod() 동작 확인...");

        //resturn; // 리턴은 매소드 끝에만 달 수 있다.

        System.out.println("test");

        return;

    }


}
