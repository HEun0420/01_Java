package com.ohgiraffers.section02.uses;

public class MemberRegister {
    // 서비스라는 클래스에서 정보를 받아오고, Register라는 클래스에서 받은 정보를 처리하겠다.
    public void regist(Member[] members) {

        System.out.println("회원을 등록합니다.");

        // 실제로 저장되지는 않았고, repository의 메서드를 통해
        // repository에 저장할 예정.
        for(Member m : members) {
            System.out.println(m.getName() + "님을 회원 등록을 하겠습니다.");
        }
        // members 배열에 있는 모든 index를 조회를 해서 하니씩 Member 객체를 받아와서 반복을 돌리는거

//        for(int i = 0; i < members.length; i++) {
//            System.out.println(members[i].getName() + "님을 회원 등록을 하겠습니다.");
//        }   ==> 배열에서만 저렇게 표현 가능/ 위와 동일하다. / i를 m으로 하고 mdms mebers[i]라는 뜻. 배열쪽에서 확인 가능함.

        if(MemberRepository.store(members)) {
            System.out.println("총" + members.length + "명의 회원 등록에 성공했습니다.");
        }
    }
}
