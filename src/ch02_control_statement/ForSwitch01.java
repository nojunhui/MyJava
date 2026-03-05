package ch02_control_statement;

public class ForSwitch01 {
    static void main(String[] args) {
        // 이 문제 헷갈렸음 나중에 공부
        int even = 0;
        int odd = 0;

        for (int i = 1; i <= 10; i++) {
            switch (i % 2) {
                case 0:
                    even += i;  // 짝수
                    break;
                case 1:
                    odd += i;   // 홀수
                    break;
            }
        }
        System.out.println("짝수의 합 : " + even);
        System.out.println("홀수의 합 : " + odd);
    }
}
