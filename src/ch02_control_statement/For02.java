package ch02_control_statement;

public class For02 {
    public static void main(String[] args) {

        int even = 0;  // 짝수 합
        int odd = 0;  // 홀수 합

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                even += i;  // 짝수
            } else {
                odd += i;  // 홀수
            }
        }

        System.out.println("짝수의 합: " + even);
        System.out.println("홀수의 합: " + odd);
    }
}