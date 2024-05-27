package com.ohgiraffers.section03.practice.practice02;

import java.util.Scanner;

public class Class1 {
    //나이가 30살이고 이름이 James인 남자가 있습니다. 이 남자는 결혼을 했고 자식이 셋 있습니다.
    // 이를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.

    private int age;
    private String name;
    private String gene;
    private boolean isMarry;
    private boolean isChild;
    private int isMarry2;
    private int isChild2;


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public String getInfo() {
        return "이 사람의 나이는 " + this.age + "이고, "+ "이 사람의 이름은 " +
                this.name + "살 이다."+"이 사람의 성별은 " + this.gene + "이다. ";

    }

        public void setMarry(boolean isMarry) {
            System.out.println("이 사람은 결혼을 했나요? true/false로 적어주세요.");
            Scanner sc = new Scanner(System.in);
            isMarry=sc.nextBoolean();
            if (isMarry) {
                System.out.println("이 사람이 결혼을 한 것은 사실이다.");
            } else {
                System.out.println("틀렸습니다. 제대로 입력해 주세요.");
            }

        }
        public void setChild(boolean isChild) {
            System.out.println("이 사람은 자식이 3명 입니까? true/false로 적어주세요.");
            Scanner sc = new Scanner(System.in);
            isChild=sc.nextBoolean();
            if (isChild) {
                System.out.println("이 사람의 자식이 3명인 것은 사실이다.");
            } else {
                System.out.println("틀렸습니다. 제대로 입력해 주세요.");
            }

        }



    public void setMarry2(int isMarry2) {
        System.out.println("이 사람은 결혼을 했습니까?");
         this.isMarry2 =isMarry2;
        if (isMarry2== 1) {
            System.out.println(" 이 사람은 결혼을 했다.");
        } else if(isMarry2==2) {
            System.out.println("이 사람은 결혼을 안했다.");
        } else if (isMarry2==3) {
            System.out.println("모른다.");
        }
    }

    public void setChild2(int isChild2) {
        System.out.println("이 사람은 자식이 있습니까?");
        this.isChild2 = isChild2;
        if (isChild2 > 0) {
            System.out.println(" 자식이 "+ isChild +"명 있다.");
        } else if(isChild2 ==0) {
            System.out.println("자식이 없습니다.");
        }else if(isChild2 <0) {
            System.out.println("잘못된 입력입니다.");
        }

    }

}


