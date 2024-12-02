package com.kh.loopEx;

public class WhileEx {
    /*
    while조건이 true일 때 실행
    {}

    멈추는 방법 1
    특정 조건에서 return

    멈추는 방법 2
    변수명에 논리값을 담고 멈추고자 하는 특정 조건에서 논리값을 false로 변경
    boolean is = true;
        while(is){
            is = false;
            }

    멈추는 방법 3
    조건을 false로 변경
     */
    public void method1(){
        int sum = 0;
        int input = 0;

        while(input != -1){
            System.out.println("반복시작");

            if(input != -1) sum += input;

        }
        System.out.println("합계 : " + sum);



    }

}
