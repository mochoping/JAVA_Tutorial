package com.kh.operatorEx;

public class OperatorPre {

    public static void main(String[] args) {

        System.out.println("----- 전위 연산자 -----");
        int a = 5;
        System.out.println("a의 값 : "+a);
        int result1 = ++a;
        System.out.println("a의 값 : "+a);
        System.out.println("result1의 값 : "+result1);
        // ++a == a+1 = a(+1이 완성된 a)
        // 5+1 로 6이된 a를 result1에 넣어줌

        System.out.println("----- 후위 연산자 -----");
        int b = 5;
        System.out.println("b의 값 : "+b);
        int result2 = b++;
        System.out.println("b의 값 : "+b);
        System.out.println("result2의 값 : "+result2);
        //연산이 나중에 수행. 현재값을 먼저 사용하고, 이후에 변수의 값이 증가.



    }
}
