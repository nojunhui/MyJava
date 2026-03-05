package ch02_control_statement;

public class While02 {
    static void main(String[] args) {
        int odd = 0;
        int even = 0;

        int i = 0;

        // 첨에 브레이크 하는 거 까먹고 풀었음 조심
        while (i<11){
            switch (i % 2){
                case 0:
                    even +=i;
                    break;
                case 1:
                    odd +=i;
                    break;
            }
            i++;
        }

        System.out.println("짝수의 합 : " + even);
        System.out.println("홀수의 합 : " + odd);
    }
}
