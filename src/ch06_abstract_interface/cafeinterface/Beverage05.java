package ch06_abstract_interface.cafeinterface;

// 추상 메소드를 왜 만드는 걸까? 에 대한 고민... 흠.. 알아 보자
// 강제성이 있다고 함. 강제성? 이거 해야 돼 하고 밀어붙이기
// 강제적인 표준 규범. 어떤 사람은 막 drink하고 누군 drinking하고 지들 맘대로 메소드 만들고 하니까?
public abstract class Beverage05 {

    // 카페 이름은 객체 생성하지 않아도 접근이 가능하도록 하는 것이 좋겠습니다.
    // final이 붙어 있으면 편집 불가능한 상수(constant)입니다.
    // 예를 들어 원주율 이런 거에 final 붙여둠
    public static final String STORE_NAME = "G-Cafe";


    private static int beverageCount = 0; // 주문한 커피 잔 수

    public static int getBeverageCount(){
        return beverageCount;
    }

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    // abstract = 추상적
    // 모든 음료는 마십니다.
    // 할 동작은 없고 그러라고 말만 하는? 뭐시기 그래서 중괄호 빼고 걍 세미콜론하기
    // 추상 메소드가 들어있는 클래스는 반드시 추상 클래스여야 함
    // 추상 메소드는 바디 -> {...}를 가질 수 없음
    public abstract void drink();// 추상 메소드

    @Override
    public String toString() {
        return "Beverage05{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // Alt + Insert 단축키 애용하기~~
    // 이건 왜 잇지? 흠.. 기본 생성자 같은데..  저 아래 것만 쓰는 거 같음 사실 필요는 없다고 함
    // 근데 나중에 이게 없으면.. 이름은 미정으로 하고 싶을 때 저 아래 생성자에 값을 넣을 수 없으니까 곤란해져서 필요
    // 생성자 뭐시기를 초기화 하는 역할
    public Beverage05() {

    }

    public Beverage05(String name, double price) {
        this.name = name;
        this.price = price;

        beverageCount++; // 커피 잔수 +1
    }
}