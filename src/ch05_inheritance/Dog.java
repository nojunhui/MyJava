package ch05_inheritance;

// 상속을 해주는 Animal 클래스를 Dog 클래스가 상속을 받습니다.
// class 서브크래스 extends 수퍼클래스
// 수퍼클래스 = 부모 클래스
// 서브클래스 = 자식 클래스

// 오버로딩은 한 클래스 내부에서, 오버라이딩은 상속 관련해서
public class Dog extends Animal{
    boolean guide; // 안내견 여부

    // 오버라이딩이 뭔지, 왜 하는지를 공부하기
    // 내 입맛대로 다시 만들라고 하라는 것 같음 짖는 소리도 다 다르고 하니까
    // 도형이라는 수퍼 클래스가 자식 클래스인 삼각형, 사각형 클래스에게 면적 구해라~ 하면 각자 입맛대로 오버라이딩 메소드에서 만들고 하는 거
    @Override // 이 메소드는 오버라이딩 되었습니다.
    public void display() {
        // super는 나의 수퍼 클래스 Animal을 의미합니다.
        super.display();

        if (guide){
            System.out.println("안내견 여부 : 적합");
        }else{
            System.out.println("안내견 여부 : 부적합");
        }
    }

    @Override
    public void bark() {
        // super.bark(); 이거 필요 없으면 지워도 됨
        System.out.println(super.name + "이(가) 멍멍하고 짖습니다.");
    }
}