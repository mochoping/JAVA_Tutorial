package com.kh.testEx.test1pre;

import com.kh.practiceEx.oopArrayPre.User;

import java.util.Scanner;

public class MemberRun {
    public static void main(String[] args) {
        Member mr = new Member("user1","강길자","pass1");
        Scanner sc = new Scanner(System.in);
/*
        mr.setId("user1");
        mr.setName("강길자");
        mr.setPassword("pass1");
*/
        System.out.println("========== 로그인 ==========");
        System.out.print("아이디를 입력해주세요. : ");
        String inputId = sc.nextLine();
        System.out.print("비밀번호를 입력해주세요. : ");
        String inputPassword = sc.nextLine();
        sc.close();
        mr.login(inputId, inputPassword);
/*
* if(mr.login("user1","pass1")){
*   System.out.println("로그인 성공! "+m.getName(); +" 님 환영니다.");
* } else {
*   System.out.println("로그인 실패! 아이디나 비밀번호가 일치하지 않습니다.");
* }
*
*
* */
    }
}
