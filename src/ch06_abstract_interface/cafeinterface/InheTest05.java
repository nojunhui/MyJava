package ch06_abstract_interface.cafeinterface;

public class InheTest05 {
    static void main(String[] args) {
        // Beverage05.STORE_NAME = "허허";
        // 원래 위에처럼 여기서 다시 다른 거 할당하면 바뀌는데, 배버리지 가서 저 변수에 final 넣으면 위에 있는 거 빨간 줄 뜸
        // final은 변수명 요런 거 못 바꾸게 해둘 수 있음
        System.out.println("어서 오세용 " + Beverage05.STORE_NAME + "입니다.");

        // 부모 타입을 사용한 배열 생성
        Beverage05[] orderList = {
                new Americano05("아메리카노", 4000.0, 200),
                new Espresso05("에스프레소", 3000.0, 1),
                new Latte05("카페라떼", 4500.0, "바나나 우유"),
                new Cappuccino05("카푸치노", 5000.0, "우유", 50),
                new Specialcoffee05("스페셜커피", 6000.0, 150, 2, "우유")
                // 컨트롤키 누르고 객체명에 커서 올리면 타입들 볼 수 있음
        };

        System.out.println("주문 잔수 : " + Beverage05.getBeverageCount());

        System.out.println("향상 for를 사용한 출력");
        for (Beverage05 item : orderList) {
            System.out.println("----------------------------------------------");
            System.out.println(item); // 암시적으로 toString() 호출돼서 암호같은 거 그거 나옴


            if (item instanceof Americano05) {
                ((Americano05) item).adjustWater(20);
            } else if (item instanceof Espresso05) {
                ((Espresso05) item).addShot(1);
            } else if (item instanceof Latte05) {
                ((Latte05) item).changeMilk("초코우유");
            } else if (item instanceof Specialcoffee05) {
                ((Specialcoffee05) item).addShot(1);
                ((Specialcoffee05) item).adjustWater(50);
                ((Specialcoffee05) item).changeMilk("아몬드 우유");
            }else if (item instanceof Cappuccino05){
                ((Cappuccino05) item).changeMilk("딸기 우유");
                ((Cappuccino05)item).addfoam(50);
            }

            item.drink();
            System.out.println();
        }
    }
}