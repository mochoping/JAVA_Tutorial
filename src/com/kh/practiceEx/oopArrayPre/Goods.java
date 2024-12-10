package com.kh.practiceEx.oopArrayPre;

public class Goods {
    //상품 번호 이름 가격 수량
    //필드 전역변수 멤버변수 인스턴스변수 속성
    private int id;
    private String name;
    private double price;
    private int quantity;
    // 기본 필수 생성자, 게터 세터 투스트링


    public Goods() {
    }

    public Goods(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return
                "상품번호=" + id +
                "\n상품이름=" + name +
                "\n상품가격=" + price +
                "\n상품수량=" + quantity ;
    }
}
