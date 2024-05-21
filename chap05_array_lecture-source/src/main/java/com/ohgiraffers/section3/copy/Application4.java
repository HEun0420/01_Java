package com.ohgiraffers.section3.copy;

import org.w3c.dom.ls.LSOutput;

public class Application4 {
    public static void main(String[] args) {
        /*
        * 깊은 복사는 원본과 복사본 중 둘 중 한가지 값을 변경해도 다른 하나에 영향을 준다,
        * 같은 값을 가지고 있지만, 거로 다른 배열이기 때문이다.
         */

        int[] arr1= {1,2,3,4,5};
        // arr1의 깊은 복사
        int[] arr2= arr1.clone();

        // arr1 각 인덱스에 10씩 더해줌
        for(int i=0; i<arr1.length; i++) {
        arr1[i] += 10;
    }
        System.out.println();

    // arr1의 각 인덱스를 출력함
    for(int i = 0; i<arr1.length; i++){
        System.out.print(arr1[i] + " ");
    }
        System.out.println();

    // arr2의 각 인덱스를 출력함
        for(int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        /*
        * 향상된 for 문 -> jdk 1.5 버전부터 추가됨.
        *
        * 배열 인덱스에 하나씩 차례로 접근해서 담긴 값을 임시로 사용할 변수에 담고 사용할 반복문을 실행함.
        *
         */
        // {1,2,3,4,5}
        // {11,12,13,14,15}

        System.out.println();
        System.out.println("====향상된 for 문====");
        for(int i : arr2 ) {
            i += 10;
        }

        System.out.println("=====10씩 더한 후 출력====");
        for(int i: arr2){
            System.out.print(i+ " ");
        }

        /*
        * 주의: 향상된 for문은 배열에 인덱스에 차례로 접근할 때에는 편하게 사용할 수 잇지만,
        * 값변경은 불가능하며 대신 변경하는 것이 아니고, 사용한는 목적이라면 조금 더 편하게 사용 가능하다.
         */


    }
}