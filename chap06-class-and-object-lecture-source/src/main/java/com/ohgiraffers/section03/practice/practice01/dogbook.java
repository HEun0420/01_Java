package com.ohgiraffers.section03.practice.practice01;

public class dogbook {
    //**문제 설명:**
//이름이 Max이고 5살이며 골든 리트리버 종인 강아지를 표현하는 클래스를 만들고, 객체를 생성하여 값을 출력하세요.
// 강아지/ 이름. 나이
    private String name;
    private int age;
    private String kinds;

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println(" 잘못된 숫자의 입력입니다.");
        }
    }
        public void setName (String name){
            this.name = name;
        }

        public String getInfo1 () {
            return "이름이 " + name + "인 " + kinds + "는 나이가 " + age + "살이다.";
        }


        //Joshua Bloch가 쓴 "Effective Java" 책을 만들고, 416페이지이며 하드커버인 책 객체를 생성하여 값을 출력하세요.
        // 책 / jb씀, 416p, 하드커버
        //
        private String bookName;
        private String author;
        private int page;
        private String cover;

        public void setBookName (String bookName){
            this.bookName = bookName;
        }

        public void setAuthor (String author){
            this.author = author;
        }

        public void setPage ( int page){
            this.page = page;
        }
        public void setCover (String cover){
            this.cover = cover;
        }

        public String getInfo2 () {
            return this.author + "가 책 " + this.bookName + "을 만들고, " + this.page + "페이지이며" + this.cover + "로 구성되었다.";
        }

        //Tesla Model S를 만들고 2022년식이며 전기차인 자동차 객체를 생성하여 값을 출력하세요.

        private String model;
        private int year;
        private String mode;

        public void setModel (String model){
            this.model = model;
        }
        public void setYear ( int year){
            this.year = year;
        }
        public void setMode (String mode){
            this.mode = mode;
        }

        public String getInfo3 () {
            return "이 자동차는 " + this.year + "년식이며 " + this.mode + "인 " + this.model;
        }

    }