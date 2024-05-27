package com.ohgiraffers.section03.practice.practice02;

import java.util.Scanner;

public class Class1_1 {
    private String isMarry;
    private String isChild;


    public void setMarry(String isMarry) {
        System.out.println("이 사람은 결혼을 했나요? true/false로 적어주세요.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        if (isMarry == "true") {
            System.out.println("이 사람이 결혼을 한 것은 사실이다.");
        } else if (isMarry == "false") {
            System.out.println("틀렸습니다.");
        } else {
            System.out.println("잘못 입력하셨습니다. 제대로 입력해 주세요.");
        }

    }
    public void setChild(String isChild) {
        System.out.println("이 사람은 자식이 3명 입니까? true/false로 적어주세요.");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        if (isChild == "true") {
            System.out.println("이 사람의 자식이 3명인 것은 사실이다.");
        } else if (isChild == "false") {
            System.out.println("틀렸습니다.");
        } else {
            System.out.println("잘못 입혁하셨습니다. 제대로 입력해 주세요.");
        }

    }
}