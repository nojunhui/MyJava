package ch02_control_statement;

public class For03 {
    static void main(String[] args) {
        int total = 0;
        // Q1. 1 + 2 + 3 + ... + 50 = 1275
        for (int i = 1; i <51 ; i++) {
            total += i;
        }
        System.out.println("총합01 : " + total);

        // ---------------------------------------------
        // Q2. 2 + 4 + 6 + ... + 100 = 2550
        total = 0;

        for (int i = 2; i < 101; i+=2) {
            total += i;
        }
        System.out.println("총합02 : " + total);

        // ---------------------------------------------
        // Q3. 1 + 3 + 5 + ... + 99 = 2500
        total = 0;

        for (int i = 1; i <100 ; i+=2) {
            total += i;
        }
        System.out.println("총합03 : " + total);

        // ---------------------------------------------
        // Q4. 100 + 95 + 90 + ... + 5 = 1050
        total = 0;

        for (int i = 100; i > 0 ; i-=5) {
            total += i;
        }
        System.out.println("총합04 : " + total);

        // ---------------------------------------------
        // Q5. 2² + 4² + 6² + ... + 20² = 1540
        total = 0;

        for (int i = 2; i <=20 ; i+=2) {
            total += i*i;
        }
        System.out.println("총합05 : " + total);

        // ---------------------------------------------
        // Q6. 5² + 10² + 15² + ... + 100²= 71750
        total = 0;

        for (int i = 5; i <=100 ; i+=5) {
            total += i*i;
        }
        System.out.println("총합06 : " + total);
    }
}