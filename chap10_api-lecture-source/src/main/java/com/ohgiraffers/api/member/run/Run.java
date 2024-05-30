package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        String data= "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        // | 기준으로 분리
        String[] firstSplitArr = data.split("\\|"); // | 이 정규표현식에 사용되므로 escape문을 써야함.
        System.out.println(firstSplitArr.length);
        System.out.println("firstArr = " + Arrays.toString(firstSplitArr));

        // , 기준으로 분리
        // firstSplitArr[0] = 1,김연아,165,47,19900905
//        String[] secondSplitArr0 = firstSplitArr[0].split(",");
//        System.out.println("secondSplitArr[0] = " + Arrays.toString(secondSplitArr0));
//
//        String[] secondSplitArr2 = firstSplitArr[2].split(",");
//        System.out.println("secondSplitArr[2] = " + Arrays.toString(secondSplitArr2));
//
//        String[] secondSplitArr3 = firstSplitArr[3].split(",");
//        System.out.println("secondSplitArr[3] = " + Arrays.toString(secondSplitArr3));


        // 멤버 객체 배열
        Member[] members = new Member[firstSplitArr.length];

        for(int i = 0; i< firstSplitArr.length; i++){
            String[] secoundSplitArr = firstSplitArr[i].split(",");
            // 분리해서 나온 데이터들을 Member라는 클래스의 필드값으로 저장
            Member member = new Member();
            member.setMemberNo(Integer.parseInt(secoundSplitArr[0]));
            member.setMemberName(secoundSplitArr[1]);
            member.setHeight((Integer.parseInt(secoundSplitArr[2])));
            member.setWeight(Integer.parseInt(secoundSplitArr[3]));
            LocalDate birth = LocalDate.parse(secoundSplitArr[4], DateTimeFormatter.ofPattern("yyyyMMdd"));
            member.setBirth(birth);

        }

        //멤버 객체 확인
        System.out.println(Arrays.toString(members));




    }
}
