package com.kh.practiceEx.oopArrayPre;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GoodsServiceRun {
    public static void main(String[] args) {
        GoodsService gs = new GoodsService();
        Scanner scanner = new Scanner(System.in);

        // false 가 될 때까지 반복
        while (true) {
            System.out.println("\n===== 상품 설정 시스템 =====");
            System.out.println("1. 상품추가하기");
            System.out.println("2. 모든상품보기");
            System.out.println("3. 원하는 상품 보기 (상품번호로 조회)");
            System.out.println("4. 상품 제거하기 (상품번호로 제거)");
            System.out.println("5. 종료하기");
            System.out.print("번호를 선택하세요 : ");

            try {
            // switch case 사용해서 기능 완성
            String choice = scanner.next().trim();
            scanner.nextLine();
                switch (choice) {
                    case "1":
                        System.out.print("추가하실 상품 이름을 작성해주세요. : ");
                        String name = scanner.nextLine();
                        System.out.print("추가하실 상품 아이디를 작성해주세요. : ");
                        int id = scanner.nextInt();
                        System.out.print("추가하실 상품의 가격을 작성해주세요. : ");
                        double price = scanner.nextDouble();
                        System.out.print("추가하실 상품의 수량을 작성해주세요. : ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine();
                        Goods g = new Goods(id, name, price, quantity);
                        gs.addGoods(g);
                        break;
                    case "2":
                        gs.displayAllGoods();
                        break;
                    case "3":
                        System.out.print("상품번호를 입력해주세요 : ");
                        int findNum = scanner.nextInt();
                        scanner.nextLine();
                        gs.getGoodsById(findNum);
                        System.out.println(gs.getGoodsById(findNum).toString()); // 리턴값을 메서드가 받았지만 출력명령어가 없어서 출력안하고 있음. 출력이 필요.
                        break;
                    case "4":
                        //try{
                        System.out.print("상품번호를 입력해주세요 : ");
                        int removeNum = scanner.nextInt();
                        scanner.nextLine();
                        gs.removeGoods(removeNum);
                        //} catch (Exception e) {
                        // System.out.println(e.getMessage()+"상품번호로만 조회 가능합니다.");
                        //}
                        break;
                    case "5":
                        System.out.print("시스템 종료를 선택하셨습니다.");
                        return;
                    default:
                        System.out.println("숫자만 입력 가능합니다.");
                        break;
                }
            } catch (InputMismatchException e){
                System.out.println(e.getMessage() + "숫자형식만 가능합니다.");
                scanner.nextLine(); // 예외발생시 입력 버퍼에 남아있던 잘못된 값을 비웁니다.
            } catch (Exception e) {
                System.out.println(e.getMessage() + "문제가 발생했습니다.");
            } finally { //실행하는 반복문이 우선이기 때문에 동작하지 않음.
                System.out.println("프로그램을 종료합니다.");
            }
        }



    }

}
