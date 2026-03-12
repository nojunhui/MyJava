package ch05_inheritance.mybeverage;

public class Beverage04 {
    private String name; // 음료 이름
    private double price; // 단가

    @Override
    public String toString() {
        String imsi = "상품명 : " + name + ", 단가 : " + price;
        // return super.toString() + "\n" + imsi;
        return imsi;
    }

    public String getName() {
        return name;
    }

    public Beverage04() {
    }

    public Beverage04(String name, double price) {
        this.name = name;
        this.price = price;
    }

    protected void showInfo() {
        System.out.println("음료 이름 : " + name);
        System.out.println("단가 : " + price + "원");
    }
}
