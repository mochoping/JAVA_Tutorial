package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public void setsave() {
        Scanner sc = new Scanner(System.in);
        User u = new User();
        System.out.println("사용자를 등록합니다. ");
        System.out.print("이름을 입력하세요. (2자이상, 5자이하 가능) : ");
        // 유효성 검사 필요
        //username 빈칸이거나 6글자 이상시 저장 하지않음 리턴시키기
        //email 빈칸이거나 30자 이상 작성 불가 return 시키기
        String inputName = sc.nextLine();
        if(inputName != null && inputName.length() < 6 && inputName.length() > 1) {
            u.setUsername(inputName);
            System.out.println(u.getUsername()+"저장완료");
        } else {
            System.out.println(" 빈칸 없이 6글자 이하로만 작성 가능합니다.");
            return;// 값이 저장되지 못하게 돌려보내기
        }
        System.out.print("이메일주소를 입력하세요. (공백없는 , 30자이하 가능) : ");
        String inputEmail= sc.nextLine();
        if(inputEmail != null && inputEmail.length() < 30) {
            u.setEmail(inputEmail);
            System.out.println( u.getEmail() + "저장완료");
        } else {
            System.out.println(" 빈칸 없이 30글자 이하로만 작성 가능합니다.");
            return;
        }
        System.out.print("나이를 입력하세요(1세 ~ 99세 작성가능 : )");
        int inputAge= sc.nextInt();
        sc.nextLine();
        try {
            if (inputAge > 0 && inputAge < 100) {
                u.setAge(inputAge);
                System.out.println(u.getAge() + "저장완료");
            } else {
                System.out.println(" 0세부터 100세 사이 숫자만 가능합니다.");
                return;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }




        // String saveName = u.setUsername("홍길동"); 변수명에 저장 불가.
        // set 으로 저장된 값은 변수명에 넣어주는것이 아니라 get으로 정보 반환할 수 있음.
        //u.setUsername("홍길동");
        //u.setAge(10);
        //u.setEmail("hong@hong.com");

        System.out.println("--------------------저장된 사용자 정보 ---------------------");
        // ArrayList 이용해서 정보 저장하고
        ArrayList<User> users = new ArrayList<User>();
        users.add(u);

        for (User u1 : users) {
            System.out.println(u1);
        }
        // toString 을 이용해서 저장된 정보 가져오기





    }

    //void paramNameEmail()
    // scanner 사용
    // 매개변수 생성사 통해서 저장 나이는 필수가 아님
    // 매개변수 생성자 -> 이름 이메일만 필수로 받도록 수정
    // 이메일을 입력하시겠습니까? yes / no 대소문자 구분없이 입력받기

    // yes 했다면 setEmail 을 통해 입력받은 이메일값 저장
    public void paramNameEmail() {
        Scanner sc = new Scanner(System.in);
        User u = new User();
        System.out.print("이름을 입력해주세요 (2자이상 5자이하 가능) : ");
        String inputName = sc.nextLine();
        if(inputName != null && inputName.length() < 6 && inputName.length() > 1) {
            u.setUsername(inputName);
            System.out.println(u.getUsername()+"저장완료");
        } else {
            System.out.println("필수 입력사항으로 빈칸 없이 6글자 이하로만 작성 가능합니다.");
            return;
        }
        System.out.print("이메일을 입력해주세요 : ");
        String inputEmail = sc.nextLine();
        if(inputEmail != null && inputEmail.length() < 30) {
            u.setEmail(inputEmail);
            System.out.println( u.getEmail() + "저장완료");
        } else {
            System.out.println(" 빈칸 없이 30글자 이하로만 작성 가능합니다.");
            return;
        }
        System.out.print("나이를 입력하시겠습니까? y/n ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            System.out.print("나이를 입력해주세요 : ");
            int inputAge = sc.nextInt();
            u.setAge(inputAge);
            System.out.println("입력하신 나이는 : " + inputAge + " 입니다. ");
        } else {
            System.out.println("나이 입력은 선택사항으로 입력하지 않기를 선택하셨습니다.");
        }
        System.out.println("저장된 정보는 다음과 같습니다.");
        ArrayList<User> users = new ArrayList<User>();
        users.add(u);

        for (User u1 : users) {
            System.out.println(u1);
        }



    }

}
