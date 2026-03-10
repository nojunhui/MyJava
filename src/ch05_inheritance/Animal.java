package ch05_inheritance;

// Animal 클래스는 수퍼 클래스이자 서브클래스임. 암시적으로 오브젝트 클래스?에게 상속받고 있음
// 오브젝트 클래스에서 제일 빈번하게 많이 쓰이는 게 toString() 메소드임. 객체를 문자열로 만들어서 출력해줌
public class Animal {
    // 공통변수는 위로 올리고 그렇지 않은 건 내리는데 이런 걸 일반화라고 함
    String name;
    int age;
    String feed; // 먹이

    @Override
    public String toString() {
        // 메소드 은닉화 : 오버라이딩시 본의 아니게 부모 메소드 접근이 막히는 현상 -> 이게 뭐임?
        String imsi = "이름 : "+ name + ", 나이 : " + age + ", 먹이 : " + feed ;
        return imsi;
    }

    // eat(), bark() 짖는다 라는 뜻
    public void eat(){
        System.out.println(name + "이(가) " + feed + "를 먹습니다.");
    }

    public void bark(){
        System.out.println(name + "이(가) 짖습니다.");
    }
    // 반환타입 이름(매개변수){...}
    public void display(){
        System.out.println();
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}