package com.kh.MemoryEx;

public class GarbageCollectionEx {
    /*
    가비지 컬렉션
    메모리 관리 자동화를 위한 기능
    프로그램 실행 중 더 이상 사용되지 않는 객체를
    자동으로 찾아 제거함으로써 메모리 누수를 방지
    개발자가 메모리르 명시적으로 헤제할 필요가 없도록 도와줌
    **명시적 : 분명히 들어나는것

    자바가 특정 기능과 기준을 통해 메모리를 정리. 직접적으로 언제 진행해달라 설정할 수 있음

    System.g;
     */
    public static void main(String[] args) {
        String 주소 = "https://";
        System.out.println(("주소 : "+주소));

        주소 += "www.naver.com";
        System.out.println(("주소 : "+주소));
    }
    // String의 경우 불변성으로 인해 적합한 예제는 아니지만 직관적으로 확인가능하여 예제.
    // Garbage 1950~60 년대 프로그래밍 언어가 발전하던 시기에 불필요한 데이터나 사용되지 않는 메모리를 의미하는 은유적인 표현.
    //  사용되지 않은 메모리 영역을 Garbage 로 사용
    // 자바는 이 전통을 이어받아서 메모리 관리 시스템의 이름을 가비지 컬렉션으로 지음.


}
