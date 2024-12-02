package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionIfRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConditionIfEx cix = new ConditionIfEx();


       // System.out.println("나이를 숫자로 입력해주세요 :  ");
        //int age = sc.nextInt();
       // sc.nextLine();
//
//
//        cix.method1(age);
//        cix.method2(age);
//        cix.method3(age);
        ConditionPre cp = new ConditionPre();
        System.out.println("계절을 숫자로 입력하세요 : ");
        int month = sc.nextInt();
        sc.nextLine();
        cp.method1(month);

    }
}
