package com.kh.arrayEx;
// Arrays 클래스는 자바에서 배열을 다룰 때 유용한 다양한 기능 제공.
// 클래스 생성시 겹치지 않도록 주의

import java.util.Arrays;

/*
기능들
toString 1차원 배열은 값 출력, 초과는 주소값만 출력
deeptoString 2차원 이상만 사용가능
sort() 오름차순 정렬
fill(배열변수명, 값) 모든 요소값 동일
copyOf(길이를 변경할 변수명, 숫자) 배열을 복사하고 , 지정된 길이에 맞춰 크기를 늘리거나 줄임.
equals() 두 배열이 동일한지 비교
deepEquals(2차원 이상의 배열1, 2차원 이상의 배열2)
 */
public class ArraysEx2 {
    public void arr1Dmethod(){
        int[] arr1 = {5,2,8,3,1};
        int[] arr2 = {5,2,8,3,1};

        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1); // arr1 정렬시키기
        System.out.println("모든값 오름차순 정렬 : " + Arrays.toString(arr1));// 정렬확인
        // arr1 모든값 7
        Arrays.fill(arr1,7);
        System.out.println("모든값 7로 변경 : " + Arrays.toString(arr1));// rkqt ghkrdls

        boolean a = Arrays.equals(arr1,arr2);
        System.out.println("arr1 값이 같은지 비교 : " +a);

        //데이터베이스에서 더 빠르고 간편하게 오름차순과 내림차순 설정 가능.


    }
}
