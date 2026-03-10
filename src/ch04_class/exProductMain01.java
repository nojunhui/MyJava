package ch04_class;

// 현민이 오빠 거
public class exProductMain01 {
    static void main() {
        // 객체 생성
        exProduct01 watch = new exProduct01();

        //객체 할당
        watch.setMovement("automatic");
        watch.setPower_reserve(38);
        watch.material = "stainLess";

        //메소드 사용
        watch.Display();
    }
}