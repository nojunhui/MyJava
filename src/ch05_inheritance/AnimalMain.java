package ch05_inheritance;

public class AnimalMain {
    static void main() {
        // 클래스이름 객체이름 = new 생성자이름();
        Dog retiver = new Dog();
        retiver.name = "김리트리버";
        retiver.age = 2;
        retiver.feed = "건식 사료";
        retiver.guide = false;
        retiver.display();
        retiver.eat();
        retiver.bark();

        System.out.println("객체 정보");
        System.out.println(retiver.toString()); // 결과 ch05_inheritance.Dog@7adf9f5f -> 5장 패키지에 있는 강아지로 만든 거 옆에 암호같은 건 해시코드를 16진수로 한 거?

        Dog maltese = new Dog();
        maltese.name = "이말티즈";
        maltese.age = 7;
        retiver.feed = "습식 사료";
        maltese.guide = true;
        maltese.display();
        maltese.eat();
        maltese.bark();

        // 고양이 : 페르시안(persian), 샴(siamese)
        Cat persian = new Cat();
        persian.name = "박페르시안";
        persian.age = 6;
        persian.indoor = false;
        persian.display();
        persian.bark();

        Cat siamese = new Cat();
        siamese.name = "최샴";
        siamese.age = 7;
        siamese.indoor = true;
        siamese.display();
        siamese.bark();

        Cat jjunie = new Cat();
        jjunie.name="냥냥쭈니";
        jjunie.age=24;
        jjunie.indoor=true;
        jjunie.display();
        jjunie.bark();
    }
}
