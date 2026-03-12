package ch05_inheritance.mybeverage;

public class Americano04 extends Beverage04 {
    private double waterAmount; // 투입하는 물의 양. 기본값 : 0.0

    public Americano04(String name, double price, double waterAmount) {
        super(name,price);
        this.waterAmount = waterAmount;
    }

    @Override
    public String toString() {
        String imsi = ", 물의 양 : " + waterAmount;
        return super.toString() + imsi; // super.toString()을 없애면 상품명, 단가 출력안 됨. 메소드 은닉화 현상이 이런 거.
    }

    // sip : 홀짝 홀짝 마시다
    public void sipAmericano(){
        String message = super.getName() + "를 홀짝 홀짝 마십니다.";
        System.out.println(message);
    }
}
