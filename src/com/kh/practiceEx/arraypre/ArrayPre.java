package com.kh.practiceEx.arraypre;

import java.util.Arrays;

public class ArrayPre {
    //1 주어진 정수 배열에서 가장 큰 숫자를 찾아서 출력하기
    public void maxValue(){
        // 수가 들어있는 배열
        int[] numbers ={12,45,3,22,78,10};

        // 배열에서 최대값을 찾아 출력
        int max = numbers[0];// 찾은 최대값을 가져올 변수명 설정
        /*
        배열의 0ㅂ번자리에는 최대값을 넣기로 지정했기 떄문에 i=1부터 시작.
         */
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }// for문은 결과를 찾기위한 과정이기 때문에 for 문이 종료된 후에 결과를 출력
        System.out.println(max);

    }

    //2 문자열 배열에서 특정 문자열 찾기. cherry 라는 단어가 어디에 위치했는지 찾아보기
    public void findString(){
        String[] words = {"apple","banana","cherry", "date", "melon"};
        String target ="cherry";
        // TODO : 특정 문자의 위치를 찾고 출력하는 for문 완성
        /**/

        int result=0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(target)){
                result = i;
            }
        }
        System.out.println("찾는 문자는 : " + result + " 번째에 위치해 있습니다.");

    }

    //3 배열에서 특정 숫자 교체하기
    public void findArray(){
        // 입력 배열
        int[] numbers ={10,20,30,20,40,20,320};
        int target = 20; // 교체할 숫자
        int replacnumber = 99; //20 대신 넣을 숫자
        String total= "";
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]==target){
                numbers[i]=replacnumber;

            }
        }
        for(int num : numbers){
        System.out.print(num+" ");
        }
        System.out.println();
    }

    //4 배열에서 특정 문자 교체하기
    public void replaceArrayString(){
        String[] words = {"apple","banana","cherry","date","melon"};
        String target ="banana";
        String replaceword = "mango";

        for(int i = 0; i < words.length; i++){
            if(words[i].equals(target)){
                words[i]=replaceword;
            }
        }
        System.out.println("교체 결과");
        for(String total : words){
            System.out.print(total+" ");
        }
        System.out.println();
    }
    //5. 이중 배열 출력하기
    public void print2DArray(){
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        for(int j=0;j<numbers.length;j++){
            for(int i=0;i<numbers[j].length;i++){
                System.out.print(numbers[j][i]+" ");
            }
        }System.out.println();

    }
    // 문제1 : 타겟 위치 찾기
    public void find2DArray(){
        int[][] numbers = {{10,20,30},{40,50,60},{70,80,90}};
        int target = 50;
        int x = 0;
        int y = 0;
        for(int j=0;j<numbers.length;j++){
            for(int i=0;i<numbers[j].length;i++){
                if(numbers[j][i]==target){
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println("숫자 target 은 [ " + x  + " ], [ " + y + " ] 위치에 존재합니다.");
    }
    // 문제2 : 특정 문자열 위치 찾기
    public void findStringIn2DArray(){
        String[][] words = {{"cat", "dog", "fish"},
                {"parrot", "hamster", "rabbit"},
                {"turtle", "snake", "lizard"}};

        String target = "rabbit";
        int x = 0;
        int y = 0;
        for(int j=0;j<words.length;j++){
            for(int i=0;i<words[j].length;i++){
                if(words[j][i].equals(target)){
                    y=i;
                    x=j;
                }
            }
        }
        System.out.println(" target 은 배열의 [ " + x  + " ], [ " + y + " ] 위치에 존재합니다.");
    }
    // 문제3 : 특정 문자열 교체하기
    public void replaceStringIn2DArray(){
        String[][] words = {{"red", "blue", "green"},
                {"yellow", "blue", "purple"},
                {"pink", "blue", "orange"}};
        String target = "blue";
        String replaceword = "cyan";
        for(int j=0;j<words.length;j++){
            for(int i=0;i<words[j].length;i++){
                if(words[j][i].equals(target)){
                    words[j][i] = replaceword;
                }
            }
        }
        System.out.println("변경점 확인을 위한 배열 출력 : ");
        /*for(String[] wx : words){
            for(String wy : wx){
                System.out.print(wy+" ");
            }
            System.out.println();
        }*/
        /*for(int j=0;j<words.length;j++) {
            for (int i = 0; i < words[j].length; i++) {
                System.out.print(words[j][i] + " ");
            }
        }
        System.out.println();*/
        System.out.println(Arrays.deepToString(words));
        /*
        2차원 배열
        [] [][] 배열이라는 객체를 만들어 개발자들에게 유용한 기능 제공
        Arrays.toString(출력하고자하는변수명)
        1차원 배열의 요소들을 문자열로 변환하여 출력
        2차원 이상의 배열 요소들은 값 대신 주소를 출력하게 됨
        Arrays.deepToString(출력하고자하는변수명)
         */

    }

    public void lunchMenuArray(){

        String[] lunchMenu = {"김치찌개", "된장찌개", "삼겹살", "초밥", "치킨", "햄버거"};
        System.out.println(Arrays.toString(lunchMenu));



    }


    public static void main(String[] args) {
        ArrayPre arrayPre = new ArrayPre();// 내부에 있는 기능 사용
        //arrayPre.find2DArray();
        //arrayPre.findStringIn2DArray();
        //arrayPre.replaceStringIn2DArray();
        arrayPre.lunchMenuArray();

    }
}
