package com.kh.stringEx;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilderEx sb = new StringBuilderEx();
        sb.method1();
    }
    private void method1() {
        StringBuilder s1 = new StringBuilder();
        s1.append("Hello");
        s1.append("World");
        System.out.println(s1);
    }
}
