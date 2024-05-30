package com.oghiraffers.section01.list.run;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Application1 {
    public static void main(String[] args) {

        /*
         * 컬렉션 프레임워크 (Collection Framework)
         * 자바에서 컬렉션 프레임 워크는 여러개의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
         * 표준화 된 방법을 제공하는 클래스들의 집합이다.
         * ==> 데이터를 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 구현해놓은 클래스
         */

        /*
         * Collection FameWork는 크게 3가지 인터페이스 중 한 가지를 상속 받아 구현해 두었다.
         * 1. List 인터페이스
         * 2. Set 인터페이스
         * 3. Map 인터페이스
         *
         * List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의
         * 하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의되지 않음.
         */

        /*
         * 각 인터페이스 별 특징
         * 1. List 인터페이스
         * - 순서가 있는 데이터의 집합으로 데이터의 중복 저장을 허용한다.
         * - Vector, ArrayList, LinkedList, Stack, Queue등이 있다.
         * 2. Set 인터페이스
         * - 순서가 없는 데이터의 집합으로 데이터의 중복을 허용하지 않는다.
         * - HashSet, TreeSet 등이 있다.
         * 3. Map 인터페이스
         * - 키와 값 한 쌍으로 이루어지는 데이터 집합이다.
         * - ket를 set방식으로 관리하기 때문에 데이터의 순서를 관리하지 않고, 중복된 key를 허용하지 않는다.
         * - HashMap, TreeMap, HashTable, Properties 등이 있다.
         */

        /*
         * ArrayList
         * -> 배열의 단점을 보완하기 위해 만들어졌다.
         * 배열의 단점 : 크기 변경 불가, 요소의 추가, 수정, 삭제, 정렬 복잡함
         * 크기 변경(새로운 더큰 배열 만들고 옮기기), 요소의 추가, 수정, 삭제, 정렬 기능을
         * 미리 메소드로 구현해서 제공한다.
         */

        ArrayList<Object> alist = new ArrayList();

        /*
         * 다형성을 적용해 상위 레퍼런스로 ArrayList 객체를 만들 수 잇다.
         * List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
         * 레퍼런스 타입은 List 로 해두는게 더 유연한 코드를 작성 가능하다.
         */
        List<Object> list = new ArrayList<>();

        /*
        * arrayList는 저장 순서가 유지되며, index(순번)이 적용된다.
        * Object 클래스의 하위 타입 인스턴스를 모두 저장 가능
         */
        list.add("apple");
        list.add(123);
        list.add(45.67);
        list.add(LocalDateTime.now());

        // toString 메서드가 오버라이딩 되어있음
        System.out.println("list: " + list);

        // arrayList의 크기는 size() 확인할 수 잇다.
        // size()는 사실 요소의 갯수를 반환한다.
        System.out.println("list의 size: " + list.size());


    }
}