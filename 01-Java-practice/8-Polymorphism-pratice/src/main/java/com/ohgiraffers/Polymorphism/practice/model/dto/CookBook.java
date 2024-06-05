package com.ohgiraffers.Polymorphism.practice.model.dto;

public class CookBook extends Book {
    private boolean coupon;

    public CookBook(String title, String author, String publisher, boolean coupon ) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return super.toString() + " 요리학원 쿠폰 유무는 " + this.coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
}
