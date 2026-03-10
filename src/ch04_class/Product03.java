package ch04_class;

public class Product03 {
    private String name; // null

    // 상품의 단가가 입력되지 않으면 500원이라고 가정합니다.
    private int price = 500; // 0

    private String inputdate; // null

    // 기본 생성자 : 눈에는 보이지 않음
    // 정의: 객체 생성시 오직 1번만 호출이 되는 특수

    // 생성자 만들기
    // 반환타입 메소드이름(매개변수 리스트){...}

    // 같은 이름인데 매개변수 개수나 타입이 다른 걸 오버로딩이라고 함
    // 같은 기능을 하는 메소드를 하나의 이름으로 묶기 위해 씀
    // 예를 들어 정수형 더하기, 실수형 더하기 같은 더하기 기능 쓸 때

    // 드래그 하고 ctrl + / 하면 드래그 한 거에 다 주석 처리 됨

    public Product03() {
        // 개발자가 생성자를 하나라도 직접 만들면, 자바가 자동으로 만들어주던 기본 생성자는 사라진다.
        System.out.println("하하하");
    }

    public Product03(String name, String inputdate) {
        this.name = name;
        this.inputdate = inputdate;
    }

    public Product03(String name, int price, String inputdate) {
        this.name = name; // 객체 자신(this)이 소유한 name 변수에 매개 변수 name의 값을 할당하시오
        this.price = price;
        this.inputdate = inputdate;
    }

    public void display() {
        System.out.println("상품명 : " + name);
        System.out.println("단가 : " + price);
        System.out.println("입고날짜 : " + inputdate);
        System.out.println();
    }
}
