package ch01_variable_operator;

//산술 연산자
public class Arithmetic01 {
    static void main() {
        int x = 14, y = 5;

        System.out.println("더하기 : " + (x + y));
        System.out.println("빼기 : " + (x - y));
        System.out.println("곱하기 : " + (x * y));
        System.out.println("나누기 : " + (x / y)); // 정수 나누기 정수는 정수
        System.out.println("나눗셈 : " + (x % y));

    }
}