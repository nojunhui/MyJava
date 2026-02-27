package ch01_variable_operator;

public class Add {
    static void main() {
        // 3 더하기 5는 8입니다.
        //변수 정의(선언)
        int x; // 정수형 데이터를 위하여 x를 준비하세요.
        int y;
        int result;

        // 변수에 값을 할당(대입)
        // 쓰기 3번 읽기 2번. x에 3 쓰고(할당), y에 5 쓰고, x, y 읽고, result에 더한 값 쓰고
        x = 3; // 쓰기
        y = 5;
        result = x + y; // + 기호는 덧셈

        System.out.println("x = " + x); // + 기호는 문자열 결합
        System.out.println("y = " + y); // 이 한 줄 복사하는 단축키 ctrl + d
        System.out.println("result = " + result);

        // 3 더하기 5는 8입니다.
        System.out.println(x + " 더하기 " + y + "는 " + result + "입니다." );

        x = 4; //overwrite
        y = 8;
        result = x * y;
        
        System.out.println(x + " 곱하기 " + y + "는 " + result + "입니다.");

    }
}
