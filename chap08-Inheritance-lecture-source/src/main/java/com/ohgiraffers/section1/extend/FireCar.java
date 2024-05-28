package com.ohgiraffers.section1.extend;

public class FireCar extends Car{

    /*
    * Firecar extends Car
     * Car 클래스를 부모클래스로 FireCar를 자식클래스로 사용한다는 뜻
     * Car의 모든 멤버 -> FireCar로 상속 받음
     * 생성자는 상속 받지 못한다.
     * 부모의 private 멤버는 접근 불가
     */

    // 기본생성자
    public FireCar(){

        // 부모 클래스의 생성자를 호출
        // 컴파일러가 자동으로 추가해줘서 명시적, 묵시적 작성 가능

        super();

        System.out.println("FireCar의 기본 생성자 호출.....");
    }

    // FireCar 목적에 맞게 메소드 재정의 = 오버라이딩

    /*
    * @Override 어노테이션
    * 오버라이딩이 정상적으로 작성된 것인지 체크해주는 기능
    * 오버라이딩 하는 메소드는 기본적으로 부모 메서드 선언 내용을
     */
    @Override
    public void soundHorn(){

        /*
        * isRunning은 private일 때는 사용이 불가능 했다.
        * 하지만 protected 접근제한자로 바꿔 사용이 가능하게 함.
        * (캡술화 위배) 그나마 범위가 좁은 것으로 대체 했다.
         */


        if(isRunning()){
            System.out.println("빠아아앙아아아앙~~~~~~~~");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다....비키세요.");
        }

    }

    // 물뿌리는 기능 추가
    public void spraytWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
    }

}
