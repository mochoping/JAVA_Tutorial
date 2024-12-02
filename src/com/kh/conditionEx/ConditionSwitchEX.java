package com.kh.conditionEx;

public class ConditionSwitchEX {
    /*
    자료형 변수명 = 특정값;

    Switch(변수명) {
        case 조건 1 :
        조건1에 부합하는 기능 실행
        break; // break 를 걸어주지 않으면 조건에 부합한 기능 실행후 나머지 케이스들 순차실행 진행.
        case 조건2 :
        조건1이 변수명에 일치하지 않아 조건1을 건너 뛰고
        조건2에 부합하는 기능 실행
        break;
        default :
        조건 1과 2에 모두 부합하지않아 건너뜀


         Switch(변수명) {
        case 조건 1 : case 조건 3 : case 조건 5
        조건1,3,5에 부합하는 기능 실행
        break; // break 를 걸어주지 않으면 조건에 부합한 기능 실행후 나머지 케이스들 순차실행 진행.
        case 조건2 :
        조건1,3,5이 변수명에 일치하지 않아 조건1,3,5을 건너 뛰고
        조건2에 부합하는 기능 실행
        break;
        default :
        조건 1,2,3,5에 모두 부합하지않아 건너뜀

         Switch(변수명) {
        case 조건 1 ,3, 5:
        조건1 ,3, 5에 부합하는 기능 실행
        break; // break 를 걸어주지 않으면 조건에 부합한 기능 실행후 나머지 케이스들 순차실행 진행.
        case 조건2 :
        조건1 ,3, 5이 변수명에 일치하지 않아 조건1 ,3, 5을 건너 뛰고
        조건2에 부합하는 기능 실행
        break;
        default :
        조건 1,2,3,5에 모두 부합하지않아 건너뜀




     */

    public void method1(){
        int a = 10;

        switch(a){
            case 1:
                System.out.println("나이가 "+a+" 입니다.");
                break;
            case 2:
                System.out.println("나이가 "+a+" 입니다.");
                break;
            case 10:
                System.out.println("나이가 "+a+" 입니다.");
                break;
                default:
                    System.out.println("일치하는 나이가 없습니다. ");
                    break;

        }
    }

    public void method2(){
        int month = 10;
        String result;
        switch(month){
            case 1: case 12 : case 2:
                result = "겨울";
                break;
            case 3: case 4 : case 5:
                result = "봄";
                break;
            case 6: case 7 : case 8:
                result = "여름";
                break;
            case 9: case 10: case 11:
                result = "가을";
                break;
            default:
                result = "잘못된";
                break;
        }


    }



}
