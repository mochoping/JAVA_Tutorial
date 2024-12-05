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

      //  boolean hasbanana = map.containsKey("바나나");
//       String hasbanana = (map.containsKey("바나나"))? "yes" : "no" ;
//        System.out.println(hasbanana);
//
//        System.out.println(map.containsValue(3000));
//
//        map.remove("바나나");
//        System.out.println(map);
//
//        System.out.println(map.size());
//
//        System.out.println(map.keySet());
//
//        System.out.println(map.values());
//
//        System.out.println(map.entrySet());

        // HashMap 생성
        Map<String, Integer> map1 = new HashMap<String, Integer>();

        //1. 사과 1000   바나나 2000   포도 3000 추가
        map1.put("사과"  , 1000);
        map1.put("바나나", 2000);
        map1.put("포도"  , 3000);

        //2. 사과가 얼마인지 System 출력문 이용해서 확인
        System.out.println("사과의 가격 : " + map1.get("사과") + "원");

        //3. 물가가 올랐습니다. 사과를 1500으로 변경
        map1.put("사과",1500);
        System.out.println("사과 가격이 올랐습니다. :" + map1.get("사과") + "원");

        //4. 바나나 판매합니까? System 출력문 이용해서 확인 Yes or No
        //                                                true   false
        String hasBanana = (map1.containsKey("바나나")) ? "YES" : "NO";
        System.out.println("바나나 판매중 인가요? : " + hasBanana);

        //5. 3000원 짜리 과일이 존재합니까? System 출력문 이용해서 확인  Yes or No
        String has3000Value = map1.containsValue(3000) ? "YES" : "NO";
        System.out.println("3000원 짜리 과일이 존재합니까? : " + has3000Value);

        //6. 바나나 품절됐습니다. 바나나 데이터 삭제
        map1.remove("바나나");
        System.out.println("바나나가 품절되었습니다.");
        //7. 과일의 개수는 ?  System 출력문 이용해서 확인
        System.out.println("현재 과일의 개수 : " + map1.size() + "개");

        //8. 모든 키 출력
        System.out.println("모든 키 확인 : " + map1.keySet());

        //9. 모든 값 출력
        System.out.println("모든 값 확인 : " + map1.values());

        //10. 모든 키와 값 출력
        System.out.println("모든 키와 값 확인 : " + map1.entrySet());
    }

}
