package com.kh.stringEx;

public class StringBufferEx {
    public void method1(){
        StringBuffer sb = new StringBuffer();
        sb.append("HelloWorld");// sb에 HelloWorld 가 적혀지고
        sb.append("!");//sb 에 이어서 작성
        System.out.println(sb);
    }
}
