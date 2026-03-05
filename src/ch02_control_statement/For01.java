package ch02_control_statement;

public class For01 {
    static void main(String[] args) {
        /*
        // 1부터 10까지의 총합
        int total = 0;

        for (int i = 1; i < 11; i++) {
            total += i;
        }
        
        System.out.println("총합01 : " + total);
        */

        int total = 0;

        for (int i = 1; i <= 100; i += 3) {
            total += i;
        }
        System.out.println("총합01 : " + total);

        total = 0;

        for (int i = 1; i < 101; i += 3) {
            total += i;
        }
        System.out.println("총합02 : " + total);

        total = 0;

        for (int i = 97; i > 0; i -= 5) {
            total += i;
        }
        System.out.println("총합03 : " + total);

        total = 0;

        for (int i = 1; i <= 96; i += 5) {
            total = total + i * i;
        }
        System.out.println("총합04 : " + total);
    }
}
