package com.ohgiraffers.test.Member.controller;

import com.ohgiraffers.test.Member.model.Member;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class MemberRepository {
//    * Silver 등급, Gold 등급, Vip 등급 등 회원을 최대 40명 관리할수 있는  ArrayList
    // 변수 이름 MemberList

    ArrayList<Member> MemberList = new ArrayList<>();
//    private List<Member> MemberList = new ArrayList<>();

//### MemberRepository 멤버메소드
//
//**`insertMember(Member m)`**
//- 회원을 추가할때 사용하는 메서드, 만약 10명이 넘어가면 OverMemberException 발생
//- 직접 처리 하지 않고, insertMember메소드를 호출한 곳으로 위임.


    public void insertMember(Member m) {
        if (MemberList.size() < 10) {
            this.MemberList.add(m);
        } else if (MemberList.size()>=10) {
            try {
                throw new OverMemberException();
            } catch (OverMemberException e) {
                throw new RuntimeException(e);
            }
        }
        }


//**`OverMemberExeption`**
//- Exception을 상속받아 구현
//- Exception 발생시 `"Member List is full"` 라는 메시지 출력
//- OverMemberException 발생할 경우를 대비해 실행클래스(Run)에서 try catch로 처리 할 것



//**`printData()`*
//- 모든 회원이 가지고 있는 포인트의 이자 포인트를 계산하여 출력하는 메소드
    public void printData() {
        for (Member m: MemberList){
            System.out.println( + " 등급 회원 "+ getname + "의 포인트는 "+ point+
                    "이고, 이자 포인트는 " +points+ "입니다.");
        }
//        double points = Member.calculateInterst();
//        System.out.println(getGrade + " 등급 회원 "+ getname + "의 포인트는 "+ point+
//                "이고, 이자 포인트는 " +points+ "입니다.");
        }

    }


