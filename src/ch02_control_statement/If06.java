package ch02_control_statement;

public class If06 {

    static void main() {

        int month = 3;

        if (3 <= month && month <= 5) {
            System.out.println("봄");
        } else if (6 <= month && month <= 8) {
            System.out.println("여름");
        } else if (9 <= month && month <= 11) {
            System.out.println("가을");
        } else if (month == 12 || (1 <= month && month <= 2)) {
            System.out.println("겨울");
        }

    }

}