package ch06_abstract_interface.cafeinterface;

// 암시적으로 저 임플리먼츠? 에 앱스트럭트가 암시적으로 붙음
// 글고 퍼블릭은 무조건임 뭔 말인진 모르겠는데 gpt한테 물어보자
public class Americano05 extends Beverage05 implements WaterAdjustable {
    private double waterAmount;

    @Override
    public void adjustWater(double amount) {
        this.waterAmount += amount; // 물 양 누적
        System.out.println("물 추가 : " + amount + "ml");
        System.out.println("현재 물의 양 : " + this.waterAmount + "ml");
    }

    public Americano05(String name, double price, double waterAmount) {
        super(name, price);
        this.waterAmount = waterAmount;
    }


    @Override
    public void drink() { // 이 메소드는 추상 메소드를 구체화 한 메소드입니다.
        System.out.println("물의 양이 " + waterAmount + "ml인 " + super.getName() + "를 뜨거운 물과 함께 마십니다.");
    }

    // tos 까지 치면 제네럴 머시기 검색하는 거 하고 하는 거임 아래 한 거
    @Override
    public String toString() {
        return super.toString() + "\nAmericano05{" +
                "waterAmount=" + waterAmount +
                '}';
    }

}