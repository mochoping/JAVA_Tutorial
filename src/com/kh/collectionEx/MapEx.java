package com.kh.collectionEx;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    /*
    키-값 쌍으로 데이터를 저장하는 구조
    키는 중복을 허용하지 않지만 값은 중복을 허용
    키 = key 값 = ㅍ미ㅕㄷ
    대표적인 클래스 : HashMap, LinkedHashMap, TreeMap

    특징
    키는 중복 허용하지 않음 : 동일한 키로 여러번 데이터를 저장하면, 기본의 값이 새로운 값으로 덮어씌워짐

    값은 중복을 허용 : 동일한 값은 다른 키에 여러번 저장될 수 있음.
    순서   HashMap, 순서보장하지 않음
     LinkedHashMap, 입력 순서 유지
           TreeMap, 키의 자연 순서나 지정된 순서로 정렬

    매서드
    put(k key, V value) : 지정한 키에 해당하는 값을 저장
    get(Object key) : 지정한 키에 해당하는 값을 반환
    remove(Object key) : 키와 쌍을 이루는 값 제거
    containsKey(Object key) : 지정한 키가 존재하는 지 확인
    containsValue(Object value) : 값이 존재하는지 확인
    size()
    clear()
    keySet()  저장된 모든키를 set으로 반환
    values()  저장된 모든 값을 collection 으로 반환
    entrySet() entry(키 값쌍)을 set으로 반환

    사용법






     */
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        //    사과 1000 바나나 2000 포도 3000추가
        map.put("사과", 1000);
        map.put("바나나", 2000);
        map.put("포도", 3000);

        System.out.println(map.get("사과"));

        map.put("사과", 1500);

        System.out.println(map.containsKey("바나나"));

        System.out.println(map.containsValue(3000));

        map.remove("바나나");
        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.keySet());

        System.out.println(map.values());

        System.out.println(map.entrySet());
    }

}
