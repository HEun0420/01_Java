package com.ohgiraffers.section1.polymorphism;

public class Tiger extends Animal{
    @Override
    public void eat() {
        //
        System.out.println("호랑이가 고기를 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 달리지 않습니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이는 울부짖습니다. 어흥~~");
    }

    // 호랑이는 물어뜯기 가능
    public void bite(){
        System.out.println("호랑이가 물어뜯습니다. 앙~~~");
    }
}
