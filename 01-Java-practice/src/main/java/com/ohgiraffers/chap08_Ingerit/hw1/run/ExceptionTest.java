package com.ohgiraffers.chap08_Ingerit.hw1.run;

import com.ohgiraffers.chap08_Ingerit.hw1.model.Exception.ageNegativeException;
import com.ohgiraffers.chap08_Ingerit.hw1.model.Exception.heightNegativeException;
import com.ohgiraffers.chap08_Ingerit.hw1.model.Exception.weightNegativeException;

public class ExceptionTest {

    public void checkInt(int age, int weight, int height) throws Exception, weightNegativeException, heightNegativeException, ageNegativeException {
        if (age<0){
            throw new ageNegativeException("나이는 음수일 수 없습니다.");
        }

        if (weight <0){
        throw new weightNegativeException("몸무게는 음수일 수 없습니다.");
    }
        if (height <0){
            throw new heightNegativeException("키는 음수일 수 없습니다.");
        }


    }
}
