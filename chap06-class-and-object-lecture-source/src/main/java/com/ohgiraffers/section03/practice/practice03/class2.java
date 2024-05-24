package com.ohgiraffers.section03.practice.practice03;

public class class2 {
    // Dell 브랜드의 XPS 13 모델이고, 16GB RAM과 512GB SSD를 가진 노트북을 표현하는 클래스를 만들고,
    // 객체를 생성하여 값을 출력하세요

    private String model;
    private String brand;
    private int ramSize;
    private int ssdSize;

    public void setModel(String model){
        this.model=model;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setRamSize(int ramSize){
       if(ramSize>0) {
           this.ramSize = ramSize;
       } else {
           System.out.println("잘 못 입력하셨습니다.");
       }
    }

    public void setSsdSize(int ssdSize){
        if(ssdSize>0) {
            this.ssdSize= ssdSize;
        } else {
            System.out.println("잘 못 입력하셨습니다.");
        }
    }

    public String getInfo(){
        return "이 노트북은 " + this.brand+ "의 " + this.model+ "이고, " +
                this.ramSize + "GB RAM과 " + this.ssdSize + " GB SSD를 가지고 있다.";
    }
}
