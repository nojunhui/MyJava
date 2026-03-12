package ch05_inheritance.mybeverage;

public class Espresso04 extends Beverage04 {
    private int shotCount; // 샷 추가 갯수

    public Espresso04(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }

    public void drinkEspresso(){
        String message = "투입할 샷의 개수는 " + shotCount + "개입니다.";
        System.out.println(message);
    }
}
