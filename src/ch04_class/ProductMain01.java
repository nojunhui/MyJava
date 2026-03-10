package ch04_class;

public class ProductMain01 {
    static void main() {
        // 단계02 : 객체 생성
        // '생성자이름'은 '클래스이름'과 동일해야 합니다.
        // 클래스이름 객체 이름 = new 생성자이름();
        Product01 shin = new Product01(); // 신라면

        Product01 blackbean;
        blackbean = new Product01(); // 짜파게티

        System.out.println("신라면 정보 출력");
        System.out.println("이름 : " + shin.name);

        // 단계03 : 맴버 변수에 값을 할당
        // .을 멤버 참조 연산자라고 부릅니다.
        shin.name = "신라면";
        shin.price = 1000;
        shin.inputdate = "2026/03/01";

        blackbean.name = "짜파게티";
        blackbean.price = 2000;
        blackbean.inputdate = "2026/03/09";

        // 단계04 : 맴버 변수들의 값을 출력
        System.out.println("1번 상품 정보 출력");
        System.out.println("상품명 : " + shin.name);
        System.out.println("단가 : " + shin.price);
        System.out.println("입고 : " + shin.inputdate);

        System.out.println("2번 상품 정보 출력");
        System.out.println("상품명 : " + blackbean.name);
        System.out.println("단가 : " + blackbean.price);
        System.out.println("입고 : " + blackbean.inputdate);

        // 매개변수O / 반환O
        int su = 3;
        shin.plus5(su);
        int result = shin.plus5(su); // 메소드 호출
        System.out.println("결과 : " + result);

        // 매개변수X / 반환O
        String str = shin.showData();
        System.out.println(str);

        //매개변수X / 반환X
        shin.Display();

    }
}