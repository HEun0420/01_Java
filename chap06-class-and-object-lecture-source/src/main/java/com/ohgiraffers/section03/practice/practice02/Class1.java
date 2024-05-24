package com.ohgiraffers.section03.practice.practice02;

import java.util.Scanner;

public class Class1 {
    //나이가 30살이고 이름이 James인 남자가 있습니다. 이 남자는 결혼을 했고 자식이 셋 있습니다.
    // 이를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.

    private int age2;
    private String name2;
    private String gene;
    private int isMerry;
    private int isChild;


    public void setAge2(int age2) {
        this.age2 = age2;
    }

    public void setName(String name2) {
        this.name2 = name2;
    }


    public void setGene(String gene) {
        this.gene = gene;
    }

    public String getInfo() {
        return "이 사람의 나이는 " + this.age2 + "이고, "+ "이 사람의 이름은 " +
                this.name2 + "살 이다."+"이 사람의 성별은 " + this.gene + "이다 ";

    }

    public void setMerry(int isMerry) {
        Scanner sc= new Scanner(System.in);
        System.out.println("이 사람은 결혼을 했습니까?");
         this.isMerry =isMerry;
        if (isMerry== 1) {
            System.out.println(" 이 사람은 결혼을 했다.");
        } else if(isMerry==2) {
            System.out.println("이 사람은 결혼을 안했다.");
        } else if (isMerry==3) {
            System.out.println("모른다.");
        }
    }


    public void setChild(int isChild) {
        Scanner sc= new Scanner(System.in);
        System.out.println("이 사람은 자식이 있습니까?");
        this.isChild = isChild;
        if (isChild > 0) {
            System.out.println(" 자식이 "+ isChild +"명 있다.");
        } else if(isChild ==0) {
            System.out.println("자식이 없습니다.");
        }

    }

}


