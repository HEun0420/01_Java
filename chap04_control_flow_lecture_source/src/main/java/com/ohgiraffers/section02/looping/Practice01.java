package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Practice01 {


    /*
    * 문제 1.
    *   *****
    *   ****
    *   ***
    *   **
    *   *
     */
public void starNum1(){
    Scanner sc = new Scanner(System.in);
    System.out.println("출력할 줄의 수를 입력하시오");
    int row = sc.nextInt();
    for (int i = row; i > 0; i--) {

        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        // 별찍고 줄바꾸기
        System.out.println();
    }

}

    /*문제 2.
    *       *
    *      **
    *     ***
    *    ****
    *   *****
     */
    public void starNum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄의 수를 입력하시오");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 별찍고 줄바꾸기
            System.out.println();
        }

    }

    /* 문제 3.
    *     *
    *    ***
    *   *****
    *  *******
     */
    public void starNum3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄의 수를 입력하시오");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            // 별찍고 줄바꾸기
            System.out.println();
        }

    }

}
