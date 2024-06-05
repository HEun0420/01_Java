package com.ohgiraffers.Polymorphism.practice.model.dto;

public class AniBook extends Book{
    private int accessAge; // 제한 나이

    public AniBook(String title, String author, String publisher , int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        return super.toString() + "제한 나이 = "+ this.accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }
}
