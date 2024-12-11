package com.kh.practiceEx.filePre;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapPractices {
    public static void main(String[] args) {
        //map 쉽지않음. 두 값이 이어붙여져있다고는 하지만 아직 직관적으로 다루지 못함.
        Map<String, Integer> map = new HashMap<>(); // K,V 값으로 이루어진 map선언, 출력순서는 랜덤. 값을 저장하고 얽힌 값을 불러오기 좋음.
        MapPractices m = new MapPractices();
        map.put("a", 1);
        map.put("b", -2);
        map.put("c", 3);
        map.put("d", 4); // 생성한 맵에 데이터 넣기

        //넣은 데이터를 보려면,

        System.out.println(map.entrySet()); // 한줄로 이어서 출력

        System.out.println("Iterator를 이용한 출력");
        Iterator<String> it = map.keySet().iterator();// 키값 회전
        while (it.hasNext()) { //다음 키값이 존재할때까지 반복
            String key = it.next();
            Integer value = map.get(key); // value 값을 불러내기 위한 선언
            System.out.println(key + ":" + value); //k,v 출력
        }

        System.out.println("for문을 이용한 출력");//향상된 for문 이용시 회전가능
        for(String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key)); // value = map.get(key) 생략
        }
        // 조건문 true , false 판단. 삼항연산자 사용필요.
        m.configure(map);

    }

    /**
     * 조건에 따라 가, 불을 확인하는 메서드
     * configure(Map<String, Integer> map)
     * @param map1 저장된 맵 형식의 데이터타입. 숫자는 구분을 위해 임의로 붙임
     */
    public void configure(Map<String, Integer> map1) { // Map 형태, map의 이름
        System.out.println("조건에 따른 ture / false 판단 ");
        for (Map.Entry<String, Integer> entry1 : map1.entrySet()) {
            String key1 = (entry1.getValue()>=0)? "true" : "false"; //entry.getValue()>=0 <-조건
            System.out.println(entry1.getKey() + ":" + key1 + ":" + entry1.getValue());
        }
    }
}
