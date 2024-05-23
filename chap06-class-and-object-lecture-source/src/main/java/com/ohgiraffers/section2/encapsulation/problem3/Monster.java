package com.ohgiraffers.section2.encapsulation.problem3;

public class Monster {

    String name;
    int hp;
    String kinds;

    public void setInfo(String info) {
        this.name = info;
    }

    public void setHp(int hp) {
        if (hp > 100) {
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }
    // 몬스터의 이름과 체력을 String 값으로 return 해주는 기능
    public String getInfo() {

        String text = "몬스터의 이름은 " + this.name + "이고, 체력은 " +this.hp+ "이다.";
        return text;
    }


}
