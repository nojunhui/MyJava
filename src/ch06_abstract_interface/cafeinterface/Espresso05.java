package ch06_abstract_interface.cafeinterface;

public class Espresso05 extends Beverage05 implements ShotAddable{
    private int shotCount;


    @Override
    public void addShot(int count) {
        this.shotCount += count;
        System.out.println("샷 추가 : " + count + "개 추가되었습니다.");
    }

    // 상속부터 하자 준희야 제발 까먹지 말고
    public Espresso05(String name, double price, int shotCount) {
        super(name, price);
        this.shotCount = shotCount;
    }


    @Override
    public void drink() {
        System.out.println("샷 개수가 " + shotCount + "인 " + super.getName() + "을 찐하게 한 모금 마십니다.");
    }

    @Override
    public String toString() {
        return super.toString()+ "Espresso05{" +
                "shotCount=" + shotCount +
                '}';
    }

}