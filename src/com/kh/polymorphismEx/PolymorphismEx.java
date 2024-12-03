package com.kh.polymorphismEx;
/*
다형성 : 다양한 형태를 지니는 성질

1. 상속관계의 자식객채의 모습이 여러 모습으로 보임
자식객체, 부모객체, object객체 등으로 변하는 것처럼 보임

2. 오버로딩
같은 클래스에서 같은 이름의 메서드를 여러번 작성하는 기술
조건: 메서드명 동일하나, 매배변수 갯수나 타입등이 달라야함.
목적: 전달받은 매개변수에 따른 상황별 처리 방법 구현
sum(a,b) -> 두 수 더하기
sum(a,b,c) -> 세 수 더하기
sum(arry) -> 배열내 요소 전부 더하기



 */
public class PolymorphismEx {
//
//    public void sum(int a, int b) {}
//    public void sum(int a, int b,int c) {}
//    public void sum(double a, int b) {}
//    public void sum(String a, String b) {}
//      아래 기준 메소드를 먼저 써놓고
//      1번부터 7번까지의 메소드를 차례로 써나간다고 할 때
//      오버로딩이 적용되는 것은 무엇일까?
//      기준    public void method1(int i){}
//=========================
    public void method1(String str){}
    public void method1(int i, String str){}
// 3    public void method1(int num){} 1번과 변수 타입, 갯수동일해서 적용되지 않음.
// 4    public char method1(int point){} 3번과 변수 타입, 갯수동일해서 적용되지 않음.
    // 반환형과 매개변수명은 오버로딩 조건과 상관이 없음.
   public void method1(int i, int k){}
// 6    public void method1(int num, String string){} 2번과 변수 타입, 갯수가 동일해서 적용되지 않음.
   public void method1(String str, int i){}
    //자료형이 작성된 순서가 다르면 오버로딩 가능함.


}
