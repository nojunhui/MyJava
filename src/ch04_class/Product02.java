package ch04_class;

public class Product02 {
    // static은 모든 객체들이 공유할 목적으로 사용되는 변수입니다.
    // 클래스 이름으로 접근이 가능하여 '클래스 변수'라고 부릅니다.
    static String brand ; // 브랜드 (스태틱 변수 = 클래스 변수)

    // 맴버 변수는 타입별로 기본 값이 있습니다.
    // 문자열(null), 정수(0), 실수(0.0), 논리(false) // 클래스(ex - String)는 기본값이 null임
    private String name ; // 상품명
    private int price ; // 단가
    String inputdate ; // 입고 일자

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setName(String name){
        // 매개 변수는 지역 변수의 부분 집합입니다.
        this.name = name;
    }

    public String getName(){
        return name;
    }



}