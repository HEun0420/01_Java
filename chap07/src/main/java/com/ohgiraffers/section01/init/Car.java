package com.ohgiraffers.section01.init;

public class Car {

    // 모델이름
    private String modelName;
    // 최고 속력
    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    // 필드값 출력 메서드
    public void driveMaxSpeed(){
        System.out.println(modelName + "(이)가 최고 시속 " +maxSpeed + "로 달립니다.");
    }

}
