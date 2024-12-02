package com.kh.conditionEx;

public class ConditionSwitchPre {


    public void choiceDay(int choice) {
        String result;
        switch (choice) {
            case 1:
                result = "월요일";
                break;
            case 2:
                result = "화요일";
                break;
            case 3:
                result = "수요일";
                break;
            case 4:
                result = "목요일";
                break;
            case 5:
                result = "금요일";
                break;
            case 6:
                result = "토요일";
                break;
            case 7:
                result = "일요일";
                break;
                default:
            result ="잘못입력한";
            break;
        }
        System.out.println(choice + " 일자는 "+ result + " 요일 입니다.");

    }
}
