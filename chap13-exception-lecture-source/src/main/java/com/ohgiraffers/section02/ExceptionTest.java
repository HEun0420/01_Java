package com.ohgiraffers.section02;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {

        if (money>=price){
            System.out.println("상품을 구입하기 충분합니다.");
        }else {
            throw new Exception();
        }
    }
}
