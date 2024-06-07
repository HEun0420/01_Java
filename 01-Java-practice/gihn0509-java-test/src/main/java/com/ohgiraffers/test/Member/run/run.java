package com.ohgiraffers.test.Member.run;

import com.ohgiraffers.test.Member.controller.MemberRepository;
import com.ohgiraffers.test.Member.controller.OverMemberException;
import com.ohgiraffers.test.Member.model.Gold;
import com.ohgiraffers.test.Member.model.Member;
import com.ohgiraffers.test.Member.model.Silver;
import com.ohgiraffers.test.Member.model.Vip;

import java.lang.reflect.Array;
import java.util.List;

public class run {
    public static void main(String[] args) throws OverMemberException {
//        try-catch 구문을 추가하여 알맞게 작성하시오

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.insertMember(new Silver("홍길동", "Silver", 1000));
        memberRepository.insertMember(new Silver("고길동", "Silver", 2000));
        memberRepository.insertMember(new Silver("홍동민", "Silver", 3000));
        memberRepository.insertMember(new Gold("김회장", "Gold", 1000));
        memberRepository.insertMember(new Gold("이회장", "Gold", 2000));
        memberRepository.insertMember(new Gold("오회장", "Gold", 3000));
        memberRepository.insertMember(new Vip("이순신", "Vip", 10000));


            System.out.println();

            System.out.println("=========================== 회원 포인트 적립 정보 ===========================");
            memberRepository.printData();


//        =========================== 회원 포인트 적립 정보 ===========================
//        Silver 등급 회원 홍길동의 포인트는 1000이고, 이자 포인트는 20.0입니다.
//                Silver 등급 회원 고길동의 포인트는 2000이고, 이자 포인트는 40.0입니다.
//                Silver 등급 회원 홍동민의 포인트는 3000이고, 이자 포인트는 60.0입니다.
//                Gold 등급 회원 김회장의 포인트는 1000이고, 이자 포인트는 50.0입니다.
//                Gold 등급 회원 이회장의 포인트는 2000이고, 이자 포인트는 100.0입니다.
//                Gold 등급 회원 오회장의 포인트는 3000이고, 이자 포인트는 150.0입니다.
//                Vip 등급 회원 이순신의 포인트는 10000이고, 이자 포인트는 1000.0입니다.

//
//
//
//
//
//        MemberRepository memberRepository = new MemberRepository();
//        memberRepository.insertMember(new Silver("홍길동", "Silver", 1000));
//        memberRepository.insertMember(new Silver("고길동", "Silver", 2000));
//        memberRepository.insertMember(new Silver("홍동민", "Silver", 3000));
//        memberRepository.insertMember(new Gold("김회장", "Gold", 1000));
//        memberRepository.insertMember(new Gold("이회장", "Gold", 2000));
//        memberRepository.insertMember(new Gold("오회장", "Gold", 3000));
//        memberRepository.insertMember(new Vip("이순신", "Vip", 10000));
//
//
//        System.out.println("=========================== 회원 포인트 적립 정보 ===========================");
//        memberRepository.printData();
//
//        System.out.println("=========================== 회원 물품 금액 정보 ===========================");
//        int price = 10000;
//        memberRepository.printBuyInfo(price);
//
//
////        =========================== 회원 포인트 적립 정보 ===========================
////        Silver 등급 회원 홍길동의 포인트는 1000이고, 이자 포인트는 20.0입니다.
////                Silver 등급 회원 고길동의 포인트는 2000이고, 이자 포인트는 40.0입니다.
////                Silver 등급 회원 홍동민의 포인트는 3000이고, 이자 포인트는 60.0입니다.
////                Gold 등급 회원 김회장의 포인트는 1000이고, 이자 포인트는 50.0입니다.
////                Gold 등급 회원 이회장의 포인트는 2000이고, 이자 포인트는 100.0입니다.
////                Gold 등급 회원 오회장의 포인트는 3000이고, 이자 포인트는 150.0입니다.
////                Vip 등급 회원 이순신의 포인트는 10000이고, 이자 포인트는 1000.0입니다.
////                =========================== 회원 물품 금액 정보 ===========================
////        Silver 등급 회원 홍길동는 10000원 상품을 9800원에 구매합니다.
////        Silver 등급 회원 고길동는 10000원 상품을 9800원에 구매합니다.
////        Silver 등급 회원 홍동민는 10000원 상품을 9800원에 구매합니다.
////        Gold 등급 회원 김회장는 10000원 상품을 9500원에 구매합니다.
////        Gold 등급 회원 이회장는 10000원 상품을 9500원에 구매합니다.
////        Gold 등급 회원 오회장는 10000원 상품을 9500원에 구매합니다.
////        Vip 등급 회원 이순신는 10000원 상품을 9000원에 구매합니다.
//    }
        }
    }

