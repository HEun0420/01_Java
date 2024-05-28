package com.ohgiraffers.section2.abstractclass;

public class Application {
    public static void main(String[] args) {
        /*
        * 추상클래스와 추상메소드
        * 추상메소드를 0개 이상 포함하는 클ㄹ래스를 추상클래스
        * 추상클래스는 클래스 선언부에 abstract 키워드를 명시해야한다.
        * 추상클래스로는 인스턴스를 생성할 수 없다.
        * 추상클래스를 사용하려면 추상클래스를 상속받은 하위 클래스를
        * 이용해서 인스턴스를 생성해야한다.
        * 이때, 추상 클래스는 상위 타입으로 사용될 수 잇으며, 다형성을 이용할 수 있다.
        *
        * 추상클래스에 작성한 추상메소드는 반드시 후손이 오버라이딩해서 작성해야한다.
        * 후손 클래스들의 메소들의 공통 인터페이스로의 역할을 수행할 수 있다.
        * 추상클래스에 작성하나 메소드를 호출하게 되면 실제 후손 타입의 인스턴스가 가지는
        * 매소드는 다형성이 적용되어 동적 바인딩에 의해 다양한 응답을 할 수 있게 된다.
        *
        * 추상 클래스를 상속받아 구현할 때는 extends 키워드를 사용하며
        * 자바에서는 extends로 상속받을 시 하나의 부모 클래스만 가질 수 있다.
        *
        * 추상메소드
        * 메소드의 선부만 있고 구현부가 없는 메소드
        * 추상메소드의 경우 반드시 abstract 키워드를 메소드 헤드에 작성해야한다.
        * 예) public abstract void method();
         */
    }
}