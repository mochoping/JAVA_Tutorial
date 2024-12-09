package com.kh.practiceEx.oopArrayPre;

public class Student {
    // 멤버변수 전역변수 인스턴스변수 필드 속성
    private String name;
    private int age;
    private String idCard;

        //db 에 값을 저장할 때 선택항 수 있음
    // 파라미터 생성자 메서드를 이용해서 한번에 저장하는 방법
    // 주로 회원가입에서 필수로 작성해야하는 값등 처리

    //setter  메서드를 이용해서 DB에 하나씩 값을 체크하고 저장하는 방법
    // 주 사용처, 로그인, 회원가입에서 선택사항이나 비밀번호 암호화해서 저장할 때
    //getter  DB에 저장된 값을 프론트에 전달 반환


    public Student() {
    }

    public Student(String name, int age /*, String idCard*/) {
        this.name = name;
        this.age = age;
        /*
        this.idCard = idCard;
        선택적 사항.
         */
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
