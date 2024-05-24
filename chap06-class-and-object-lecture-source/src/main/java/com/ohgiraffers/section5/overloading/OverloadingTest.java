package com.ohgiraffers.section5.overloading;

public class OverloadingTest {

    /*
     * 메소드의 시그니처
     *
     *
     */


    // 기준
    public void test() {
    }

    // 메소드의 시그니처가 동일한경우 컴파일 에러를 발생시킨다,
    //    public void test(){}

    // 접근제한자에 따른 오버로딩 성립확인
    //    private void test(){} // 접근제한자는 메소드 시그니처에 해당하지 않음

    // 반환형에 따른 오버로딩 성립 확인
    //  public int test(){
    //        return 0;
    // }// 반환형도 메소드 시그니처에 해당하지 않음

    // 매개변수 유무에 따른 오버로딩 성립 확인
    public void test(int num){} // 파라미터(매개변수) 선언부는 메소드 시그니처에 해당하기에 오버로딩 성립

    // 매개변수 갯수에 따른 오버로딩 성립 확인
    public void test(int num1, int num2){} // 매개변수의 갯수에 따라 오버로딩 성립

    // 매개변수 변수명에 따른 오버로딩 성립 확인
    // public void test(int num2){} // 매개변수 변수명은 메소드 시그니처에 해당하지 않음.

    // 매개변수 타입 변화에 따른 오버로딩 확인
    public void test(int num, String str){} // 매개변수의 타입에 따라 오버로딩 성립

    // 매개변수의 순서에 따라 오버로딩 성립 확인
    public void test(String str,int num){} // 매개변수의 순서에 따라 오버로딩 성립
}