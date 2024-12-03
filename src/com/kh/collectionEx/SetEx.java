package com.kh.collectionEx;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    /*
    중복을 허용하지 않는 컬렉션
    순서가 없다는 특징이 있으며, 중복된 데이터를 제거하거나 , 고유한 값만 관리할때 사용함.
    대표적인 클래스  : HashSet(빠른 검색과 삽입), LinkedHashSet(순서유지가 되서 느림), TreeSet


    특징
    중복된값 저장 불가. 동일한 요소값을 두번 추가하려고 해도 한번만 저장
    순서없음 : 저장된 요소들의 순서는 보장되지 않음
    null 허용 (단 하나만)

    메서드
    add (E e) : 요소 (값) 추가 / 이미 존재하는 요소를 추가하려면 false를 반환
    remove(Object o) 특정요소를 제거
    contains(Object o) 특정요소가 존재하는지 확인
    size()
    clear()

    사용법
        set<> 변수이름 = new HashSet<>();
    Hashset<> 변수이름 = new HashSet<>();
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        HashSet<String> s2 = new HashSet<>();
    }

}
