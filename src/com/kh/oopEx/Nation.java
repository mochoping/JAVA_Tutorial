package com.kh.oopEx;
// 클래스 : 객체가 가져야할 속성(값), 기능(메서드)를 글(코딩)로 작성해둔 문서
public class Nation {

    /*속성(필드=값) 전역변수 앞에는 접근 제한자 붙일 수 있음. 멤버변수*/

    //접근제한자 (Static은 없음) 자료형 변수이름
    //private                    String name;
    private String name;
    private int age;
    private String gender;

    /*기능(메서드) 안에는 매개변수(파라미터) 지역변수 앞에는 접근제한자 사용 불가*/
    // 기능(메서드) 종류 : 기본생성자 배개변수 생성자 void 메서드 return 메서드 main 메서드 toString메서드
    // 단축키 alt + insert

    // 기본생성자 아무것도 존재하지 않음 super() 생략되어있음
    public Nation() {
    }

    // 매개변수 생성자 (필수로 필드에 있는 모든 변수명을 매개변수명으로 전달인자를 전달 받음)
    public Nation(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // void 메서드(=setter) return 메서드(=getter)
    // 값을 부분적으로 수정하거나 특정 값만 전달 받을 때 setter 로 값을 저장해서 전달.

    // getter 매개변수생성자나 set변수명으로 저장되어있는 값을 front나 다른 코드로 저장된 값을
    // 전달할 때 사용하기 떄문에 대부분 필수로 사용
    // 값에 전달한


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // toString 메서드 저장되어있는 값이 무었인지 확인하는 메서드, return 자료형 = String
    @Override
    public String toString() {
        return
                "name='" + name +
                ", age=" + age +
                ", gender='" + gender;
    }


}
