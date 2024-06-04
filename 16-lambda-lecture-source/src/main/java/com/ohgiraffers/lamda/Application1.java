package com.ohgiraffers.lamda;

import com.ohgiraffers.section01.Intro.OuterCalculator;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Application1 app = new Application1();
        System.out.println("지금 시간은?");
        app.test1();
        System.out.println("로또");
        app.test2();
        System.out.println("원화와 환율을 순서대로적으시오");
        app.test3();
        System.out.println();
        System.out.println("function interface 환율");
        app.test4(13800,1350);
        System.out.println();
        app.test5();
    }

    /**
     * <pre>
     * @실습문제1
     * 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
     * </pre>
     */
    private void test1() {
        Supplier<LocalDateTime>supplier = () -> LocalDateTime.now();
        LocalDateTime localDateTime = supplier.get();
        System.out.println(localDateTime);


//        // 방법 1
//        Runnable now = () -> System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
//        now.run();
//
//        // 방법 2
//        Consumer<LocalTime> now2 = (time) -> System.out.println(time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
//        now2.accept(LocalTime.now());
    }

    /**
     * <pre>
     * @실습문제2
     * 로또를 생성하는 람다식을 작성하세요.
     * - 리턴타입 Set<Integer>
     * </pre>
     */
    private void test2() {

//         자동 정렬하기 위해 TreeSet 사용
        Supplier<Set<Integer>> lotto = () ->{
            Set<Integer> lotte = new TreeSet<>();


        }
    }

    /**
     * <pre>
     * @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1350원이다.
     * </pre>
     */
    private void test3(double d1, double d2) {
        OuterCalculator.Divisaion divisaion1 = (x, y) -> x/ y;
        System.out.println((double) );
    }

    /**
     * <pre>
     * @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     * </pre>
     */
    private void test4(int a, int b) {

        OuterCalculator.Divisaion divisaion = (x, y) -> x/ y;

        @FunctionalInterface
        interface Division{
            int divisionTwoNumber (double a , double b);
        }
        System.out.println((double) divisaion.division(13500,1350));
    }

    /**
     * <pre>
     * @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
     * </pre>
     */
    private void test5() {
//        List<String> strList = Arrays.asList("abc", "", "대한민국", "   ");

    }
    }

