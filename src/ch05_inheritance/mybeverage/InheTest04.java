package ch05_inheritance.mybeverage;

import java.sql.SQLOutput;

public class InheTest04 {
    static void main(String[] args) {

        // 클래스명    객체명    = new   생성자명();
        // Americano04 beverage01 = new Americano04("아메리카노", 4000.0, 200);

        // 승급(업캐스팅) : 낮은 등급의 클래스가 높은 등급의 클래스 타입으로 한시적 형태가 바뀌는 동작
        // 전제 조건 : 반드시 상속 관계이어야 한다.
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 200);

        // 수퍼 클래스 내 들어 있는 메소드는 상속의 개념에 의하여 접근이 가능합니다.
        beverage01.showInfo();

        //아메리카노 변수에 커피를 넣기?
        Americano04 coffee01 = (Americano04) beverage01; // 강등
        coffee01.sipAmericano();
        System.out.println();

        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0, 2);
        beverage02.showInfo();

        Espresso04 coffee02 = (Espresso04) beverage02;
        coffee02.drinkEspresso();
        System.out.println();


        Beverage04 beverage03 = new Latte04("라떼", 6000.0, "딸기 우유");
        beverage03.showInfo();

        Latte04 coffee03 = (Latte04) beverage03;
        coffee03.enjoyLatte();
        System.out.println();

        // 승급 개념과 배열의 사용
        Beverage04[] beverage = {
                beverage01,
                new Espresso04("마이뿌레소", 2000.0, 1),
                new Latte04("바나나 라떼", 7000.0, "바나나 우유")
        };

        for (int i = 0; i < beverage.length; i++) {
            System.out.println("-------------------------------------------------------------");
            beverage[i].showInfo();

            // instanceof : 승급된 객체 변수가 수많은 서브 클래스 중에서 어떤 클래스로 생성이 되었는지를 판단하고자 할 때 사용함
            if (beverage[i] instanceof Americano04) { // 아메리카노
                Americano04 ameri = (Americano04) beverage[i]; // 강등
            } else if (beverage[i] instanceof Espresso04) { // 에스프레소
                Espresso04 espress = (Espresso04) beverage[i];
                espress.drinkEspresso();
            } else if (beverage[i] instanceof Latte04) { // 라떼
                Latte04 latte = (Latte04) beverage[i];
                latte.enjoyLatte();
            } else { // 차후에...

            }
            // 객체를 프린트하면 암시적으로 toString() 메소드가 호출이 됨
            System.out.println(beverage[i]);
        }
    }
}