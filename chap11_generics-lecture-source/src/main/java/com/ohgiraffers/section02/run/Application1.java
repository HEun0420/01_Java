package com.ohgiraffers.section02.run;

import com.ohgiraffers.section02.Bunny;
import com.ohgiraffers.section02.DrunkenBunny;
import com.ohgiraffers.section02.Rabbit;
import com.ohgiraffers.section02.RabbitFarm;

public class Application1 {
    // estends : 특정 파일만 사용하도록 제네릭 범위를 제한할 수 있다.
    public static void main(String[] args) {
        
        /*
        * extends 키워드를 이용하여 특정 타입만 사용하도록 범위 지정
        * -> 지정한 특정 타입과 함께, 특정 타입의 자식타입들도 대입 가능
         */

        // Animal 타입은 Rabbit의 후손이 아니기 때문에
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<>();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

        farm4.setAnimal(new Rabbit());
        farm4.getAnimal().cry(); // animal의 타입? ==> Rabbit
        farm4.setAnimal(new Bunny());
        farm5.getAnimal().cry(); // animal의 타입? ==> Bunny
        farm4.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry(); //animal의 타입? ==> Drunkenbunny
    }
    
}
