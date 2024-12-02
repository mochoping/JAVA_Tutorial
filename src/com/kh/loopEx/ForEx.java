package com.kh.loopEx;

public class ForEx {
    /*
    for (초기값 ; 조건문; 증감식 ) {
        조건이 true 일 때 실행할 기능
    }

    for (초기값 ; true ; 증감식 ) {
        계속 true이기 때문에 무한루프
    }
    for (    ;    ;       ){

    }
    for ( int a = 1 ;     ;  a++){

    }
     */
    public void method1(){
        for(int i =0 ; i<5 ; i++){
            System.out.println(i);

        }

    }
    /*
    for 문 또한 조건이 true 일때 실행할 기능이 1가지라면, {} 생략가능

    for(초기문 ; 조건문 ; 증감문) 조건이 true 일때 실행할 기능;
     */

    public void method2(){
        for(int i =0 ; i<5 ; i++) System.out.println(i);

    }
}
