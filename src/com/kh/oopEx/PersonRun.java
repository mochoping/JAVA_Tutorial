package com.kh.oopEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonRun {

    public static void main(String[] args) {
        //person 객체 생성 홍길동 40
        Person person = new Person("홍길동",40);
        // 홍길동 정보를 저장할 경로 바탕화면에 person.txt
        String path = System.getProperty("user.home") + "/Desktop/person.txt";

        // 직렬화(seialize)
        try(FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);){
            oos.writeObject(person);
            System.out.println("직렬화 완료: " + person);
            System.out.println("직렬화 완료: " + person);

        }catch (Exception e) {
            throw new RuntimeException(e);
        }


        // 역직렬화(Deserialize)
        try(FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);){


        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
