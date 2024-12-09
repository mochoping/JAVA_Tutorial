package com.kh.practiceEx.oopArrayPre;

public class Person {
    private String name;
    private int age;

    // 메서드로 기본생성자 파라미터 생성자 게터 세터 toString


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return
                "name='" + name +
                "age=" + age ;

    }
}
