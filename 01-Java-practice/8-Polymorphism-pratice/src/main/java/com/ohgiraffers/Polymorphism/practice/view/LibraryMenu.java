package com.ohgiraffers.Polymorphism.practice.view;

import com.ohgiraffers.Polymorphism.practice.controller.LibaryManager;
import com.ohgiraffers.Polymorphism.practice.model.dto.Book;
import com.ohgiraffers.Polymorphism.practice.model.dto.Member;

import java.awt.*;
import java.util.Scanner;

public class LibraryMenu {

    private LibaryManager lm =new LibaryManager();
    Scanner scanner = new Scanner(System.in);

    public void mainMenu() {
// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성


        System.out.println("이름을 적어주세요.");
        String name = scanner.nextLine();
        System.out.println("나이를 적어주세요.");
        int age = scanner.nextInt();
        System.out.println("성별을 적어주세요. 남/여 ");
        char gender= scanner.next().charAt(0);
        lm.insertMember(new Member(name,age,gender));
// LibraryManager의 insertMember() 메소드에 전달



//==== 메뉴 ====
//        1.            //        마이페이지
//        2.            //        도서 전체 조회
//        3.            //        도서 검색
//        4.            //        도서 대여하기
//        0.            //        프로그램 종료하기
// 무한 반복 실행
//
 while (true){
        System.out.println("========= 메뉴 ========");
        System.out.println("1. 마이페이지");
        System.out.println("2. 도서 전체 조회");
        System.out.println("3. 도서 검색");
        System.out.println("4. 도서 대여하기");
        System.out.println("0. 프로그램 종료하기");
        System.out.print("메뉴 선택 : ");
        int menu = scanner.nextInt();

//            System.out.println(menu);
            switch (menu) {
                case 1:
                    System.out.println(lm.myInfo());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("다시 입력해주세요");
            }



        }
    }

// LibraryManager의 myInfo() 호출하여 출력
// LibraryMenu의 selectAll() 호출
// LibraryMenu의 searchBook() 호출
// LibraryMenu의 rentBook() 호출


        public void selectAll() {
// LibraryManager의 selectAll() 메소드 호출하여 결과 값 Book[] 자료형에 담기
 Book[] bList = lm.selectAll();
// for문 이용하여 bList의 모든 도서 목록 출력
            System.out.println("=====전체 도서목록 조회====");
        for(int i = 0; i < bList.length; i++){
            System.out.println(i + "번째 도서 : " + bList[i]);
        }
            }
// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
//            ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true



        public void searchBook() {
// “검색할 제목 키워드 : “ >> 입력 받음 (keyword)
            System.out.println("검색할 제목 키워드: ");
            String keyword = scanner.next();
// LibraryManager의 searchBook() 에 전달
// 그 결과 값을 Book[] 자료형에 담기
 Book[] searchList = lm.searchBook(keyword);

 // for each문(향상된 for문)을 이용하여 검색 결과의 도서 목록 출력
            for (Book book : searchList) {
                if(book!= null) {
                    System.out.println(book);
                }
            }
            }
// NullPointerException 발생 시 오류 해결하시오 ㅎㅎ



        public void rentBook() {
// 도서대여를 위해 도서번호를 알아야된다. → selectAll() 메소드 호출
            selectAll();
// “대여할 도서 번호 선택 : ” >> 입력 받음 (index)
            System.out.println("대여할 도서 번호 선택: ");
            int index = scanner.nextInt();
// LibraryManager의 rentBook() 에 전달
// 그 결과 값을 result로 받고 그 result가
            int result = lm.rentBook(index);
// 0일 경우 → “성공적으로 대여되었습니다.” 출력
// 1일 경우 → “나이 제한으로 대여 불가능입니다.” 출력
// 2일 경우 → “성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.
            if(result == 0) {
                System.out.println("성공적으로 대여되었습니다.");
            }else if (result == 1) {
                System.out.println("나이 제한으로 대여 불가능입니다.");
            } else {
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다." +
                        "마이페이지를 통해 확인하세요");
            }

//            마이페이지를 통해 확인하세요” 출력

        }
        }
