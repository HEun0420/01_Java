package com.ohgiraffers.chap08_Ingerit.hw1.run;

import com.ohgiraffers.chap08_Ingerit.hw1.model.Exception.ageNegativeException;
import com.ohgiraffers.chap08_Ingerit.hw1.model.Exception.heightNegativeException;
import com.ohgiraffers.chap08_Ingerit.hw1.model.Exception.weightNegativeException;
import com.ohgiraffers.chap08_Ingerit.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.chap08_Ingerit.hw1.model.dto.StudentDTO;

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

        System.out.println("==============학생 조회=================");
        for (int i=0; i< sDTO.length; i++){
            System.out.println(sDTO[i].toString());
        }

        EmployeeDTO[] eDTO = new EmployeeDTO[10];
        EmployeeDTO em1 = new EmployeeDTO("박보검",26,180.3,72.0,100000000,"영업부");
        EmployeeDTO em2 = new EmployeeDTO("강동원",38,182.0,76.0,200000000,"기획부");
        eDTO[0]= em1;
        eDTO[1]= em2;
        int j = 2;


        System.out.println("==========사원 입력==========");

        while(true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("이름을 입력해주세요.");
            String name = sc.nextLine();

            System.out.println("나이를 입력해주세요.");
            int age = sc.nextInt();

            System.out.println("키를 입력해주세요.");
            int height = sc.nextInt();

            System.out.println("몸무게를 입력해주세요.");
            int weight = sc.nextInt();

            System.out.println("급여를 입력해주세요.");
            int salary = sc.nextInt();

            sc.nextLine();
            System.out.println("부서를 입력해주세요.");
            String department = sc.nextLine();


            eDTO[j] = new EmployeeDTO(name, age, height, weight, salary, department);
            j++;

            ExceptionTest et = new ExceptionTest();
            try {
                et.checkInt(age,weight,height);
            } catch (Exception e) {

            System.out.println("계속 추가하시겠습니까? 1. Yes  2. No");
            int answer = sc.nextInt();
            if (answer==2){
                break;
            }
        }

        System.out.println("사원 조회 ");
//        System.out.println(Arrays.toString(eDTO));

        for(j = 0; j < eDTO.length; j++){
            if (eDTO[j] != null){
                System.out.println(eDTO[j].toString());
            } else{
                break;
            }
        }


    }
}
