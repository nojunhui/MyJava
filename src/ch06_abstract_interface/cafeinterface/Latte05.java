package ch06_abstract_interface.cafeinterface;

public class Latte05 extends Beverage05 implements MilkAddable {
    private String milkType;

    @Override
    public void drink() {
        System.out.println(milkType + "을 넣은 " + super.getName() + "을 마십니다.");
    }

    @Override
    public void changeMilk(String milkType) {
        System.out.println("우유의 타입이 " + this.milkType + "에서 " + milkType + "으로 변경되었습니다.");
        this.milkType = milkType; // 아메리카노나 에스프레소랑 다르게 우유 양을 누적하는 게 아니고 우유 종류 바꾼 거니까 그냥 =만 씀 +=이 아니라
    }

    public Latte05(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    @Override
    public String toString() {
        return super.toString() + "Latte05{" +
                "milkType='" + milkType + '\'' +
                '}';
    }
}
