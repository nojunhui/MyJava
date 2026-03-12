package ch06_abstract_interface;

// 동일한 패키지가 아니면 import 구문을 사용해야 합니다.
// 반드시 public이어야 합니다.
// 클래스 내의 변수/메소드 또한 public이 아니면 접근이 불가능합니다.
import ch04_class.Product01;

public class MyProduct {
    static void main(String[] args) {
        Product01 apple = new Product01();
        apple.name = "사과";
        System.out.println("품목 이름 : " + apple.name);


    }
}
