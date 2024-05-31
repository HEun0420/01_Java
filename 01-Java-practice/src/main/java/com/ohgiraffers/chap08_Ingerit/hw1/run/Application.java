package com.ohgiraffers.chap08_Ingerit.hw1.run;

import com.ohgiraffers.chap08_Ingerit.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.chap08_Ingerit.hw1.model.dto.StudentDTO;

import java.util.Arrays;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        //1. 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고 아래의
        //   사용데이터를 참고하여 3명의 학생 객체 생성 후 반복문을 통해 출력 -> 향상된 for문 이용해서
        //2. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고
        //   반복문을 사용하여 키보드로 사원 정보를 입력 받도록 구현--> while(true) 무한 반복문을 통해
        //   계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        //   한 명씩 추가 될 때마다 카운트함
        //2명 정도의 사원 정보를 입력 받아 각 객체에 저장하고 현재까지 기록된
        //   사원들의 정보 출력


        StudentDTO[] sDTO = new StudentDTO[3];
        StudentDTO student1= new StudentDTO("홍길동",20,178.2,70.0,1,"정보시스템공학과");
        StudentDTO student2= new StudentDTO("김말똥",21,187.3,80.0,2,"경영학과");
        StudentDTO student3= new StudentDTO("강개순",23,167.0,45.0,4,"정보통신학과");
        sDTO[0]=student1;
        sDTO[1]=student2;
        sDTO[2]=student3;

        for (int i=0; i< sDTO.length; i++){
            System.out.println(sDTO[i].toString());
        }

        EmployeeDTO[] eDTO = new EmployeeDTO[10];
        EmployeeDTO em1 = new EmployeeDTO("박보검",26,180.3,72.0,100000000,"영업부");
        EmployeeDTO em2 = new EmployeeDTO("강동원",38,182.0,76.0,200000000,"기획부");
        eDTO[0]= em1;
        eDTO[1]= em2;

        while() {
            for (int i = 0; i < sDTO.length; i++) {
                System.out.println(sDTO[i].toString());

            }
        }

        System.out.println("인원을 더 추가하실건가요? 1. Yes / 2. No");
        Scanner sc=new Scanner(System.in);
        sc.nextInt();

        // j++
        //



    }
}
