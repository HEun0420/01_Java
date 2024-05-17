package com.ohgiraffers.section.conditional;

public class Application1 {
    // 실행용 클래스
    public static void main(String[] args) {

        A_If aIf = new A_If();
//        aIf.testSimpleIfStatement(); //단일 if문
//        aIf.testNestedIfStatment(); // 만일 아직 만들지 않는 메서드를 데려오려면 프로그램 이름을 정하고=>
//                                    그 위에 마우스를 올려놓고 alt + enter하면 A_if에 명령문 틀이 만들어진다.

        B_IfElse bIfElse = new B_IfElse();
//        bIfElse.testSimpleIfElesStatement();

        C_IfElse cIfElse =  new C_IfElse();
//        cIfElse.tetsSimpleIfElseStatement();
//        cIfElse.testNestedIfElseIfStatement2();

        D_Swich dSwitch= new D_Swich();
//        dSwitch.testSwitchVendingMachine();
//        dSwitch.testSimpleSwitchStatement();
        dSwitch.testSwitchstory();


    }
}
