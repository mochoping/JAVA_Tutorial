package com.kh.practiceEx.arraypre;

import java.util.Arrays;

public class CarArrayPreService {

    public void carmethod1() {
        // Car 객체 배열 생성  자동차 종류들을 담는 배열 생성
        CarArrayPre[] cars = {
                new CarArrayPre("현대", "소나타", 2020),
                new CarArrayPre("기아", "쏘렌토", 2019),
                new CarArrayPre("아우디", "A6", 2022),


        };

        //todo: 1. Arrays.toString 을 이용해 car 배열 출력
        System.out.println(cars);
        System.out.println(Arrays.toString(cars));
        //todo: 2. cars 배열의 브랜드 이름을 기준으로 오름차순 정렬
        //db에서 order by asc를 이용하면 됨!
        /*
        SELECT *
        FROM CAR
        ORDER BY BRAND = ASC;
         */
        /*
        버블 정렬 알고리즘
        배열의 인접한 두 값을 비교해 조건에 따라 위치를 바꿈
        반복 후 가장 킁 값이 배열의 끝으로 이동
        반복 횟수를 줄이면서 정렬 완료

        compareTo 메서드 배열내에 존재하는 문자열 비교
        car[j].brand   car[j+1].brand  브랜드 이름을 비교했을 때
        가나다순으로 봤을 떄 결과가 0 보다 크면 값 위치를 교체
         */
        for (int i = 0; i < cars.length-1; i++) {
            for (int j = 0; j < cars.length-1; j++) {
                if (cars[j].brand.compareTo(cars[j + 1].brand) > 0) {
                    // 두 값을 교체
                    CarArrayPre temp = cars[j]; // 현재 찾아낸 cars[j] 의 값을 temp 임시변수명에 저장
                    cars[j] = cars[j + 1]; // 비교했을 때 가나다 순으로 앞에 있어야하는 단어 위치를 앞으로 변경
                    cars[j + 1] = temp; // 뒤에 있어야 하는데 앞에 있는 단어를 뒤로 변경
                    /*
                    바지 / 가방

                    바지.compareto(가방)
                    바지와 가방을 교체.


                     */
                }
            }
        }
        //todo: 3. cars 배열의 모든 요소를 동일한 값으로 변경
        Arrays.fill(cars, new CarArrayPre("BMW", "X5", 2018));
        System.out.println("모든 자동차를 bmw로 변경했는지 확인 : " + Arrays.toString(cars));

        //todo: 4. 다른 배열 값과 같은지 비교, 비교결과 같은지 확인
        CarArrayPre[] carsEquals = {
                new CarArrayPre("현대", "소나타", 2020),
                new CarArrayPre("기아", "쏘렌토", 2019),
                new CarArrayPre("아우디", "A6", 2022),
        };
        boolean areEquals = Arrays.equals(carsEquals, cars);
        System.out.println("같은지 비교 확인 : " +areEquals);



    }

    public static void main(String[] args) {
        CarArrayPreService carArrayPreService = new CarArrayPreService();
        carArrayPreService.carmethod1();
    }

}
