package com.ohgiraffers.lamda;

import com.ohgiraffers.section01.Intro.OuterCalculator;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
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
        Supplier<Set<Integer>> lotto = () -> {
            Set<Integer> set = new TreeSet<>();
            while (set.size() < 6) {
                set.add((int) ((Math.random() * 45) + 1));
            }
            return set;
        };
        System.out.println("Lotto= " + lotto.get());
    }

    /**
     * <pre>
     * @실습문제3
     * 원화 입력시 환율 계산을 통해 얻어진 달러를 출력하는 람다식을 작성
     * 현재 1달러는 1350원이다.
     * </pre>
     */
    private void test3() {
 Consumer<Double> consumer = (Double won) -> {
double rate = 1350;
double dollar = won / rate;
     System.out.println("$ : " + dollar);
 }; consumer.accept(180250324.0);
    }

    /**
     * <pre>
     * @실습문제4
     * 위 문제를 jdk가 제공하는 Function 함수형인터페이스 형식에 맞게 변형하세요.
     * </pre>
     */
    private void test4() {
        ToDou

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

