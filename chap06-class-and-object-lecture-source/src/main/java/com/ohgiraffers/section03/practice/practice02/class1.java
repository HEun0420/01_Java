package com.ohgiraffers.section03.practice.practice02;

public class class1 {
    //나이가 30살이고 이름이 James인 남자가 있습니다. 이 남자는 결혼을 했고 자식이 셋 있습니다.
    // 이를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.

    private int age;
    private String name;
    private String gene;
    private boolean isMerry;

    public void setAge(){
        this.age = age;
    }
    public void setName(){
        this.name = name;
    }
    public void setGene(){
        this.gene = gene;
    }
    public void isMerry () {
        if(isMerry){
            System.out.println(" 이 사람은 결혼을 했고, 자식이 셋입니다.");
        }
    }


}
