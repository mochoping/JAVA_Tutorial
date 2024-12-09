package com.kh.practiceEx.oopArrayPre;

import java.util.Scanner;

public class PersonService {

    public static void main(String[] args) {

        //person 배열 생성
        Person [] p = new Person[4];

        //persson 배열의 각 값을 객체로 초기화
        /*
        p[0] = new Person("홍길동",20);
        p[1] = new Person("박길자",30);
        p[2] = new Person("오성순",40);
        p[3] = new Person("강하석",50);
        */
        // 배열값 출력

        //1 for
        /*
        for(int i = 0;i<p.length;i++ ){
            System.out.println(p[i]);
        }
       */
        // for each
        /*
        for(Person m : p ){
            System.out.println(m);
        }

         */
        Scanner sc = new Scanner(System.in);

            for (int i = 0; i < p.length; i++) {
                int th = i + 1;
                System.out.println("Enter the " + th + " name of the person");
                String name = sc.nextLine();
                System.out.println("Enter the " + th + " age of the person");
                int age = sc.nextInt();
                sc.nextLine();
                p[i] = new Person(name, age);
            }
        System.out.println("정보 입력 완료. 입력하신 정보는 다음과 같습니다.");

        for (Person p1 : p) {
            System.out.println(p1);
        }




    }
}
