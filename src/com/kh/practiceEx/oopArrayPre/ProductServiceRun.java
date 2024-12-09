package com.kh.practiceEx.oopArrayPre;

import java.util.Scanner;

public class ProductServiceRun {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);
        Product p = new Product();
        //String inputDescription = null;
       // String inputCategory = null;

        System.out.print("Enter product name: ");
        String inputName = scanner.nextLine();
        p.setName(inputName);
        System.out.print("Enter product price: ");
        int inputPrice = scanner.nextInt();
        p.setPrice(inputPrice);
        scanner.nextLine();

        System.out.print("Enter product description: ");
        String inputQ = scanner.nextLine();
        if(inputQ.equalsIgnoreCase("yes")){
            System.out.print("제품설명을 작성해주세요.");
            String inputDescription = scanner.nextLine();
            p.setDescription(inputDescription);
            System.out.print("카테고리를 작성해주세요.");
            String inputCategory = scanner.nextLine();
            p.setCategory(inputCategory);

        } else if (inputQ.equalsIgnoreCase("no")){
            System.out.println("추후에 수정 가능합니다.");
        } else {
            System.out.println("잘못된 입력입니다. 다시 작성해주세요.");
        }

        /*
        //p1 제품 추가
        Product p1 = new Product("서마터폰", 1000000);
        p1.setDescription("최신 스마트폰입니다. 12/24 출고예정");
        p1.setCategory("전자기기");

        Product p2 = new Product("노트북",1800000);
        //p2 에서 제품설명이 null일 경우 없음으로 저장.
        if (p2.getDescription() == null){
            p2.setDescription("없음");
        }
        if (p2.getCategory() == null){
            p2.setCategory("없음");
        }
*/
       // productService.addProduct(p1);
       // productService.addProduct(p2);
        productService.viewProducts();
        //제품명으로 제품 검색
        // 해당 기능이 VOID 가 아닌 return 값이 product 이기 때문에 해당 자료형으로 변수명 설정
        productService.searchProduct("노트북");
        if(productService.searchProduct("노트북") != null){
            System.out.println("검색된 제품 : ");

        } else {
            System.out.println("해당이름의 제품을 찾을 수 없습니다. ");

        }
    }
}
