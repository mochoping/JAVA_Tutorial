package com.kh.collectionEx;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

    /*
    순차적으로 요소들을 저장하는 자료구조
    리스트는 인터페이스로 정의
    초기에는 Vector를 사용했지만 메모리 사용과 시간소모가 많아 아래 클래스를 출시
    ArrayList, LinkedList, TreeList

    특징
    순서 존재 : 저장된 요소 (값)들은 인덱스를 통해 0번부터 저장되고, 순차적으로 접근 가능
    중복 허용: 동일한 요소(값)을 여러번 저장할 수 있음
    동적 크기 : 배열과 달리, 리스트는 크기가 (유)동적으로 변경될 수 있음
    null 허용 : null 값을 요소(값)으로 저장할 수 있음.

    주요 메서드(기능)
    add (E e) : 리스트 끝에 요소(element=값)dmf cnrk
    get (int index) : 주어진 인덱스의 요소값을 반환
    remove(int index) : 인덱스 요소값을 삭제
    remove(E e) : 주어진 요소(값)을 삭제
    size()  : 리스트의 크기(요소= 값 의 개수)를 반환
    clear() : 리스트의 모든 요소(값) 삭제

    사용법
    List 계열인 ArrayList 나 LinkedList 사용가능.

    List<> 변수이름 = new ArrayList<>();
    ArrayList<> 변수이름 = new ArrayList<>();

    String 자료형만 저장 가능한 변수이름
    ArrayList<String> 변수이름 = new ArrayList<String>();

    기본자료형을 사용하고 싶을시 int -> Integer 같은 변환후 사용.


     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        // 두 표현의 메모리 사용량이나 실행시간에는 큰 차이가 없음.
        // 메모리 차이가 발생하는 부분은 ArrayList 객체를 선언하는 부분이 아니라 그객체를 이용해서
        // 삽입/ 삭제/ 연산할때 차이가 남.


    }
}
