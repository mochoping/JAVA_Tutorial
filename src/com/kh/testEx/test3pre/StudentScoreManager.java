package com.kh.testEx.test3pre;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentScoreManager {
    //private int score;
   // private String studentName;
    public static void main(String[] args) {
        //학생 이름과 점수를 저장할 map 생성
        Map<String, Integer> ssm = new HashMap<String, Integer>();
        StudentScoreManager sm = new StudentScoreManager();
        //데이터 입력
        ssm.put("김철수", 85);
        ssm.put("이영희", 92);
        ssm.put("박민수", 77);
        ssm.put("최수진", 88);

        //System.out.println(ssm.entrySet());


        System.out.println("Iterator 이용한 출력");
        Iterator<String> it = ssm.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = ssm.get(key);
            System.out.println(key + ":" + value);
        }
        System.out.println("for문 출력");
        for(String key : ssm.keySet()) {
            int value = (int) ssm.get(key);
            System.out.println(key + ":" + value);
        }

        //합 불 판단
        sm.gradeScore(ssm);

        String updateName ="박민수";
        if(ssm.containsKey(updateName)){
            ssm.put(updateName, 82);
            System.out.println("점수수정");
        } else {
            System.out.println("존재하지 않는 학생입니다.");

        }
        System.out.println("점수 수정후 합격 / 불합격 판단.");
        sm.gradeScore(ssm);

    }

    /**
     * 학생점수로 합격 불합격 판단여부 출력하는 메서드
     * gradeScore(Map<String, Integer> studentScores)
     * @param studentScores = 특정 학생들의 이름과 점수가 넘어오면, 학생들에 대한 점수를 판단 후 출력
     */
    public void gradeScore(Map<String, Integer> studentScores) {
        System.out.println("점수 수정후 합격 / 불합격 판단.");
        for(Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            String status = (entry.getValue()>=80) ? "합격 ": "불합격";
            System.out.println(entry.getKey() + ":" + status +":" + entry.getValue());

    }
    }
}
