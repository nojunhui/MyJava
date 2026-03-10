package ch05_inheritance;

public class Cat extends Animal {
    boolean indoor; // 애완묘, 길고양이

    @Override
    public void display() {
        super.display();

        if (indoor) {
            System.out.println("애완묘");
        } else {
            System.out.println("길고양이");
        }
    }
    @Override
    public void bark(){
        System.out.println(super.name + "이(가) 야옹하고 짖습니다.");
    }
}