package ch05_inheritance.general;

public class Americano03 extends Beverage03 {
    private double waterAmount; // 투입하는 물의 양. 기본값 : 0.0

    public Americano03(String name, double price, double waterAmount) {
        // 서브 클래스의 생성자의 첫 줄에는 super(); 라는 단어가 숨어 있음
        // 상속을 받는 서브 클래스랑 오브젝트 클래스에만 있는 거임 super(); 이거 모든 클래스에 있는 거 아님
        // 사용자가 super(매개변수); 형식으로 다시 작성하면, super();는 사라짐
        super(name, price); // 생성자를 통하여 데이터를 수퍼 클래스에 넘겨 줌.
        this.waterAmount = waterAmount;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("투입된 물의 양 : " + waterAmount + "ml");
    }
}
