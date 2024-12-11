package com.kh.practiceEx.StringEx;

public class StringBuilderPre {
    /* todo String str = "Welcome;
        1.작성된 객체를 StringBuilder sb로 변환해서 사용하려고 함
        2. to java 이어서 작성
        3. 8번쨰 자리에 the world of 글자 추가
        4. 4~11 come to 변경
        5. 20, 25 삭제
        6. sb 뒤집기


     */
    public static void main(String[] args) {
        String str = "Welcome";
        //1.
        StringBuilder sb = new StringBuilder(str);

        //2.
        sb.append(" to java");
        System.out.println(sb);

        //3.
        sb.insert(8,"the world of");
        System.out.println(sb + "8번째 추가 확인");

        //4.
        sb.replace(4,11,"come to");
        System.out.println(sb+" 4~11 번째 변경 확인");

        //5.
        sb.delete(20,25);
        System.out.println(sb+"20,25 삭제 확인");

        //6.
        sb.reverse();
        System.out.println(sb+ " 거꾸로 출력 확인");

    }

}
