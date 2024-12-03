package com.kh.methodEx;

public class MethodEx {
    //특정 행동이나 기능을 작성하는 공간

    /*
    접근 제한자 static 전달유무, 기능명칭(매개변수명){
        특정 기능이나 반환 값 작성
        }

        대표메서드 종류
        생성자(기본/ 매개변수) getter/ setter toString main() void return

        전달(반환)할 것이 없을 때 = void
        public void 메서드명(매개변수명){
        System.out.println(기능이 실행되었습니다.)
        if(rlsmddp answpdlTdmfruddn){
        System.out.println(기능에 문제가 생겼습니다. 종료합니다.)
        return;// 특정 기능을 종료시킬떄 사용
        }
        }

        전달(반환) 할것이 있을 떄 return
        public자료형 메서드명 (매개변수){
        // return 필수



     */
    private String name;

    public MethodEx() {
    }

    public MethodEx(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //필드 정보 반환시 사용하는 메서드
    @Override
    public String toString() {
        return "MethodEx{" +
                "name='" + name + '\'' +
                '}';
    }
    // 최종적으로 기능 실행시 필요한 메서드
    public static void main(String[] args) {
        MethodEx methodEx = new MethodEx();
        System.out.println(methodEx);

    }
}
