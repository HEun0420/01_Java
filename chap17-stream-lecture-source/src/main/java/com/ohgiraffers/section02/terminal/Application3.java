package com.ohgiraffers.section02.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {

        /*
        * collect() : Collector 타입을 받아서 처리하는데,
        *             메소드를 통해 컬렉션을 출력으로 받을 수 있다.
         */

        List<Member> memberList = Arrays.asList(
                new Member("test01", "testName01"),
                new Member("test02", "testName02"),
                new Member("test03", "testName03"));

        List<String> collectorCollection = memberList
                .stream()
                .map(Member::getMemberName) // testName01 testName02 testName03
                .toList();

        System.out.println("collectorCollection= " + collectorCollection);

        String str = memberList
                .stream()
                .map(Member::getMemberName) // 각 member 객체를 이름으로 매핑
                .collect(Collectors.joining()); // Stream에 있는 값을 구분자 없이 하나의 문자열로
        System.out.println("str = " + str);    // testName01testName02testName03

        String str2 = memberList
                .stream()
                .map(Member::getMemberName)
                // "||"로 구분자로 구분
                .collect(Collectors.joining("||","*시작*","*끝*"));
        System.out.println("str2 = " + str2);    //*시작*testName01||testName02||testName03*끝*

    }
}
