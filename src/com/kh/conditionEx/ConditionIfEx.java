package com.kh.conditionEx;

public class ConditionIfEx {
    /*
    * 조건에 맞는 구문이 1가지일 경우 {} 생략 가능.
    * ;하나로 조건문이 종료시 사용가능.
    *
    * */

    /*
   if(조건) {
   조건이 참일때 실행


    */
    public void method0(int age) {
        System.out.println();
        if (age >= 19)       System.out.println("You are older than 19");
        else if (age >= 14 && age <=18)  System.out.println("청소년입니다.");
        else                             System.out.println("You are not older than 14");
    }

    public void method1(int age){
        if(age >=19 ){
            System.out.println("성인입니다.");
        }
    }
     /*
    if(조건) {
    조건이 참일때 실행
    }else {
    조건이 false일때 실행
    }
     */
     public void method2(int age){
         if(age >=19 ){
             System.out.println("성인입니다.");
         } else {
             System.out.println("성인이 아닙니다.");
         }
     }
     /*
    if(조건1) {
    조건1이 참일 때 실행
    }else if(조건2){
    조건1이 false일 때 실행
    조건2가 true일 때 실행
    } else {
    조건1과 2 모두 false일때 실행
    }
     */
     public void method3(int age){
         if(age >=19 ){
             System.out.println("성인입니다.");
         } else if(age <= 18 && age >=14 ){
             System.out.println("청소년입니다.");
         } else {
             System.out.println("어린이입니다.");
         }
     }
}
