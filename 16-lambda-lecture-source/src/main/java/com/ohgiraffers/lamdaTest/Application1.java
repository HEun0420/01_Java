package com.ohgiraffers.lamdaTest;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.*;

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
        app.test4();
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

        /*
        * Set 특징: 중복저장이 허용되지 않음
        * TreeSet 특징: 자동정렬
        * 컬렉션 -> 컬렉션에서 다룰 수 있는 데이터는 기본적으로 객체만 가능 -> Integer를 사용한 이유
         */

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
        Function<Integer, Double> calc = won ->{
            double rate = 1300;
            return won / rate;
        };
        double dollar = calc.apply(3000);
        System.out.println(dollar);
    }

    /**
     * <pre>
     * @실습문제5
     * 공백을 제외한 문자열의 길이가 0인지를 체크하는 람다식을 만들고,
     * 문자열리스트 {"abc","","대한민국","   "}를 체크하세요.
     * </pre>
     */
    private void test5() {
//      리스트 만드는 방법 1.
//        List<String> strList1 = new ArrayList<>();
//        strList1.add("abc");
//        strList1.add("");
//        strList1.add("대한민국");
//        strList1.add("    ");

       // 리스트 만드는 방법 2.
//        Arrays.asList() : 나열된 값을 리스트로 만들어준다.
//        asList()로 만든 리스트의 경우, 컬렉션 프레임워크가 아닌 Arrays 클래스 내부의
//        Static inner class로 만들어진다 -> 추가 .삭제 불가능 / 변경만 가능
        List<String> strList = Arrays.asList("abc", "", "대한민국", "   "); // 위와 동일
        List<String> strAsListTest = Arrays.asList("1","2");
        // strAsList.add("3"); // unsupportedOperationException 발생
        // strAsList.clear(); // unsupportedOperationException 발생
        //

//        리스트 만드는 방법 3.
//        List.of () : 팩토리 메소드, 나열된 값을 리스트로 만들어준다.
//        List.of () 로 만든 리스트는 ImmutableCollections 객체의 내부클래스인 ListN 클래스로 List를 생성
//        -> 추가, 삭제 불가능 / 변경만 가능하다.
        List<String> strListOfTest = List.of ("1", "2");
//        strListOfTest.add("3"); //  unsupportedOperationException 발생
//        strListOfTest.clear();
//

        /*
        * List.of() , Arrays.asList() -> 추가, 삭제 불가능하게 한 이유
        * 불변객체이어야 다른 컬렉션으로 변황이 용이하기 때문
         */

        // 공백을 제외한 문자열의 길이가 0인지
        Predicate<String> strLe0 = str -> str.trim().length()==0;

        for (String str : strList){
            System.out.println(str + "은 문자열의 길이가 0입니까?"+ strLe0.test(str));
        }
    }
    }

