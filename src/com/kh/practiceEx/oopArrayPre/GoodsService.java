package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;

public class GoodsService {

    // 상품들을 담을 목록 리스트
    private ArrayList<Goods> goodsList = new ArrayList<>();

    // 상품 추가 기능

    /**void addGoods(Goods goods) 상품 추가 기능 (Goods 에 존재하는 번호 이름 수량 가격 추가)
     *
     * @param goods
     */
    public void addGoods(Goods goods) {
        goodsList.add(goods);
        System.out.println(goods.getName()+"상품이 추가되었습니다.");
    }
    // 상품 번호로 원하는 상품 가져오기 기능

    /**Goods getGoodsById(   int id    ) 상품전달 상품번호로 상품가져오기기능 (상품번호)
     *
     * @param id 상품번호
     * @return   상품번호에 해당하는 Goods 상품을 사용자에게 전달.
     * Goods = 번호, 이름 ,수량, 가격 포함
     *
     */
    public Goods getGoodsById(   int id    ) {
        for (Goods goods : goodsList) {
            if (goods.getId() == id) {
                return goods;
            }
        }
        System.out.println("상품" + id + " 에 해당하는 상품을 찾을 수 없습니다.");
        return null; // 상품 번호로 해당하는 상품이 없을 경우 빈 값 전달하기
    }

    /** todo getGoodsByName(String name)
     *
     * @param name
     * @return
     * Goods = 번호, 이름 ,수량, 가격 포함
     */

    public Goods getGoodsByName(String name){
        for (Goods goods : goodsList) {
            if (goods.getName().equalsIgnoreCase(name)) {
                return goods;
            }
        }
        System.out.println("상품" + name + " 에 해당하는 상품을 찾을 수 없습니다.");
        return null;
    }
    // 모든 상품 보기 기능
    // 매개변수 없슴
    //상품 조회시 리스트가 존재하지 않으면 상품 없을 출력
    //상품 존재 유무는 isEmpty() 활용

    public void displayAllGoods() {
        // 만약에 상품 리스트가 존재하지 않는 다면, 존재한다면
        if (goodsList.isEmpty()) {
            System.out.println("상품 목록을 찾을 수 없습니다.");
        } else {
            System.out.println("===== 상품 리스트 =====");
        for (Goods goods : goodsList) {
            System.out.println(goods.getName());
            }
        }
    }

    // 상품 삭제하기 기능
    public void removeGoods(int id) {
        // 만약에 제거할 상품 번호가 존재하지 않는다면,
        Goods toGoods = null;
        // Goods 안에가 텅 비어서 null 값이라면?
        for (int i = 0; i < goodsList.size(); i++) {
            if (goodsList.get(i).getId() == id) {
                goodsList.remove(i);
                break;
            }
        }
        // 만약에 to goods가 null이 아닐 때 null 일때 System 출력문 작성
        if(toGoods == null) {
            System.out.println("상품" + id + " 에 해당하는 상품이 존재하지 않아 삭제할 수 없습니다.");
        } else {
            System.out.println("상품" + id + " 에 해당하는 상품을 삭제했습니다.");

        }
    }

}
