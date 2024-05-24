package com.ohgiraffers.section03.practice.practice02;

import java.util.Scanner;

public class Class1 {
    //나이가 30살이고 이름이 James인 남자가 있습니다. 이 남자는 결혼을 했고 자식이 셋 있습니다.
    // 이를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.

    private int age2;
    private String name2;
    private String gene;
    private boolean isMerry;
    private boolean isChild;


    public void setAge2(int age2) {
        this.age2 = age2;
        System.out.println("이 사람의 나이는 " + this.age2 + "이고, ");
    }

    public void setName(String name2) {
        this.name2 = name2;
        System.out.println("이 사람의 이름은 " + this.name2 + "살 이다.");
    }


    public void setGene(String gene) {
        this.gene = gene;
        System.out.println("이 사람의 성별은 " + this.gene + "이며 ");
    }

    public String getInfo() {
        return this.age2 + this.name2 + this.gene;

    }
    Scanner sc= new Scanner(System.in);

    public void isMerry(boolean isMerry) {
        if (isMerry) {
            this.isMerry = true;
            System.out.println(" 이 사람은 결혼을 했다.");
        } else {
            System.out.println("잘못된 정보 입니다.");
        }
    }

    public void isChild(boolean isChild) {
        if (isChild) {
            this.isChild = true;
            System.out.println(" 자식이 세 명 있다.");
        } else {
            System.out.println("잘못된 정보 입니다.");
        }

    }

}


