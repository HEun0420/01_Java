package com.ohgiraffers.section2.problem4;

public class Monster {

    private String kinds;
    int hp;

    public void setKinds(String kinds){
        this.kinds = kinds;
    }

    public void  setHp(int hp){
        if(hp>0){
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }
    public String getInfo() {
        return " 몬스턴의 종류는 " + kinds + "이고, hp는 " + hp +"이다.";
    }
}
