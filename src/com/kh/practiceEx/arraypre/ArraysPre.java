package com.kh.practiceEx.arraypre;

import java.util.Arrays;

public class ArraysPre {

    public void int1DArray(){
        int[] arr1 = {10, 300, 20, 50, 7000, 9999};
        int[] arr2 = {10, 300, 20, 50, 7000, 9999};

        //1. Arrays toString 을 이용해서 arr1과 arr2 출력
        System.out.println("arr1 : "+ Arrays.toString(arr1));
        System.out.println("arr2 : "+ Arrays.toString(arr2));
        //2. arr1 오름차순 정렬
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("arr1 : sort "+ Arrays.toString(arr1));
        System.out.println("arr2 : sort "+ Arrays.toString(arr2));

        //3. arr1 안의 모든값을 500으로 변경
        Arrays.fill(arr1, 500);
        System.out.println("arr1 : fill 500 "+ Arrays.toString(arr1));
        //4. arr1과 arr2 의 값이 모두 같은지 비교하고 비교한 결과 출력
        boolean a = Arrays.equals(arr1,arr2);
        System.out.println("arr1 과 arr2가 같은지 비교 : "+ a);
    }


    public static void main(String[] args) {
        ArraysPre    a = new ArraysPre();
        a.int1DArray();
    }
}
