package com.kh.stringEx;

public class StringBuilderEx {
    /*
    * 기능들
    *
    * append(String str)
    * insert(int index, String str) = 문자열을 현재 문자열 끝에 추가
    * delete(int start, int end) = 지정된 범위의 문자열 삭제
    * deleteCharAt(int index) = 지정한 인덱스의 문자 하나를 삭제
    * replace(int start, int end, String str) = 지정한 범위의 문자열을 다른 문자열로 대체
    * reverse() = 문자열을 뒤집음(거꾸로)
    * length()  = 문자열의 길이를 반환
    * charAt(int index)   = 지정한 위치의 문자를 반환
    * setcharAt(int index, char ch) = 지정위치 문자변경
    * subString(int start, int end)  = 지정위치 문자 반환
    * subString(int start)  = 위치부터 끝까지 반환
    * =내부 버퍼크기를 현재 문자열 길이에 맞춤
    * =현재 내부 버퍼의 크기 (용량) 반환
    * =내부 버퍼의 용량을 최소 지정용량으로 늘리기
    *
    *
    *
    * */
    public static void main(String[] args) {
        StringBuilderEx sb = new StringBuilderEx();
        sb.method1();
    }

    public  void methodStringBuilder(){
        // String 객체를 StringBuilder 넣어줌
        // sb1은 메모리에 sb1 공간은 생성되어있지만 아무런 값도 들어있지 않은 상태
        StringBuilder sb1 = new StringBuilder();

        // sb2 는 메모리에 공간생성후 문자가 들어가있는 상태
        StringBuilder sb2 = new StringBuilder("Hello");
        // sb2 에 문자열추가
        sb2.append("World");
        System.out.println(sb2+ "문자 추가 확인");

        // insert 를 이용해서 6번째 위치에 Java 글자 삽입
        // index 0 부터 시작
        sb2.insert(5,"Java");
        System.out.println("2. java 추가 확인  : "+ sb2);

        // replace 를 이용해서 6-10 범위를 python 으로 대체
        sb2.replace(6,10,"Python");
        System.out.println("3. java -> python : "+sb2);

        // sb2 6-13 범위의 값 삭제 delete
        sb2.delete(6,13);
        System.out.println("4. 6-13 삭제 : "+sb2);
        // reverse 를 이용해서 sb2 문자열 뒤집기
        sb2.reverse();
        System.out.println("5. 문자열 거꾸로 출력 : "+ sb2);

    }
    public void method1() {
        StringBuilder s1 = new StringBuilder();
        s1.append("Hello");
        s1.append("World");
        System.out.println(s1);
    }
}
