package com.kh.testEx.test1pre;

import com.kh.practiceEx.oopArrayPre.User;

public class Member {
    private String id;
    private String name;
    private String password;




    public Member() {
    }

    public Member(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void login(String inputId, String inputPassword) {
        if (inputId.equals(id) && inputPassword.equals(password)) {
            System.out.println("로그인 성공! "+name +" 님 환영니다.");
        } else {
            System.out.println("로그인 실패! 아이디나 비밀번호가 일치하지 않습니다.");
        }


    }

}
