package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 입출력 스트림
        * 프로그래밍을 할 때 많은 종류의 데이터를 다루어야 한다.
        * 하지만 데이터는 프로그램 내부에 있을 수도 있지만,
        * 프로그램 외부의 데이터를 가져와서 사용해야 할 수도 있다.
        *
        * 외부 데이터란 프로그램 외부에 존재하는 모든 데이터를 의미한다.
        * 외부 데이터는 하드디스크 상의 파일이 될 수도 있고, 네크원크 상에 존재하는 자원이 될 수도 있다.
        * 외부 데이터를 대상으로 작업할 때 연결된 길을 스트림(Stream)이라고 한다.
        * 스트림은 단방향이기 때문에 데이터를 읽어올 때는 입력스트림, 데이터를 출력할 때는 출력스트림 이라고 한다.
        *
        * 입력 & 출력 스트림
        * InputStream, Reader --> 데이터를 읽어오는 스트림
        * OutputStream, Writer --> 데이터를 내보내는 스트림
        * Reader, Writer (2바이트 혹은 3바이트) 단위로 작업
         */

        FileInputStream fin = null;

        try {

            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");

//            //1. 1 Byte 씩 반복해서 읽기
//            int value;
//
//            // abcde
//            // reae() : 파일에 기록된 값을 순차적으로 읽어오고 더이상 읽어올게 없으면, -1을 반환
//            // 1byte씩 반복해서 읽어오는 작업
//            while((value= fin.read())!= -1){
//
//                // 값을 정수로 읽어온다.
//                System.out.println(value);
//
//                // 문자로 출력하고싶은 경우 형변환을 통해 가능
//                System.out.println((char)value);
//            }

            // 2. Byte 배열로 파일 한번에 읽기
            System.out.println("파일의 길이 : " + new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt") );

            int size = (int) new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length();
            byte[] bar = new byte[size];

            // read() 메소드의 인자로 생성한 byte배열을 넣으면
            // 파일을 읽어서 byte 배열로 반환해준다.
            fin.read(bar);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
