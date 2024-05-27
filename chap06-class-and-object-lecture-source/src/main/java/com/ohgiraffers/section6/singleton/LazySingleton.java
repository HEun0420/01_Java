package com.ohgiraffers.section6.singleton;

public class LazySingleton {
    private static LazySingleton lazy;

    // 생성자 호출을 통한 인스턴스 생성 제한
    private LazySingleton(){}

        public static LazySingleton getInstance() {

            /*
             * 인스턴스를 생성한 적이 없는 경우 인스턴스를 생성해서 반환하고
             * 생성한 인스턴스가 있는 경우 만둘어둔 인스턴스를 반환한다.
             * */
            if(lazy == null) {
                lazy = new LazySingleton();
            }

            return lazy;
    }

}
