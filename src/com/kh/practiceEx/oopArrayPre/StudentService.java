package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;

public class StudentService {

    public static void main(String[] args) {


        /*
         * student2 와 student3
         *
         * student2 = if문을 이용해 프론트엔드에서 전달받은 값을 한 번더 검증하고
         * DB에 전달된 값을 저장
         *
         * student3 = 프론트엔드에서 검증된 값을 저장하고 추가적으로 검증하고자 하는 값은
         * 검증을 진행한 후 DB에 값을 저장

         */
        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student("홍길동", 10);

        //기본 생성자를 이용해서 추가
        Student s2 = new Student();
        String inputName = "김철수";
        if(inputName != null && inputName.length() <=6) {
            s2.setName(inputName);
            System.out.println("이름이 성공적으로 저장되었습니다.");
        } else {
            System.out.println("이름은 글자 이하, 빈공간일 수 없습니다. " + inputName + " 저장 불가");

        }

        int inputAge = 18;

        // 매개변수 생성자를 이용해서 학생 3번은 이름 나이를 필수로 입력받되, idcard는 set 을 이용해서 추가


        Student s3 = new Student("강말숙", 15);
        System.out.println("버스카드 발급은 선택사항입니다. (선택시 10,000 원의 추가비용 발생)");
        String plusIdcard = "버스카드";
        if (plusIdcard != null && plusIdcard.length() <=10) {
            s3.setIdCard(plusIdcard);
        } else {
            System.out.println("버스카드 기능없이 학생층을 발급하겠습니다.");
        }


        // 어레이 리스트를 이용해서 목록관리


        // ArrayList 를 이용해서 학생 0 1 2 3 의 목록 관리
        ArrayList<Student> studentsList = new ArrayList<Student>();
        studentsList.add(students[0]); //객체 배열로 저장된 학생 0 추가
        studentsList.add(students[1]); //객체 배열로 저장된 학생 1 추가
        studentsList.add(s2);    // 오직 set 으로 저장된 학생 2 추가
        studentsList.add(s3);    // 매개변수와 set 으로 작성된 학생 3 추가

        // for문을 이용해서 저장된 학생 출력 1. 일반for문 2. 향상된 for문 출력

        System.out.println("학생증 발급이 완료되었습니다.");
        System.out.println("=== 학생증 발급 목록 ===");
        for(int i = 0; i < studentsList.size(); i++) {
            System.out.println(studentsList.get(i).toString());


        }
    }
}
