package com.ohgiraffers.section01.generic;

public class GenericTest<T> {

    // 변수가 여러개면 <T,N,N...등> 하면 됨.
    /*
    * 제네릭 설정은 클래스 선언부 마지막 부분에 다이아몬드 연산자를 이용하여 작성하게 된다.
    * 다이아몬드 연산자 내부에 작성하는 영문자는 관례상 대문자로 작성된다.
     */

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
