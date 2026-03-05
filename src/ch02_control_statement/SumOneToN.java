package ch02_control_statement;

public class SumOneToN {
    static void main(String[] args) {
        int total = 0 ;
        int n = 5;
        for (int i = 0; i <= n; i++) {
            total +=i;
        }
        System.out.println("1부터 " + n + "까지의 총합은 " + total + "입니다." );
    }
}
