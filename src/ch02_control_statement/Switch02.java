package ch02_control_statement;

public class Switch02 {
    static void main() {
        int month = 12;

        // 이렇게 할 수도 있다고 함
        switch (month) {
            case 12, 1, 2 -> System.out.println("겨울");
            case 3, 4, 5 -> System.out.println("봄");
            case 6, 7, 8 -> System.out.println("여름");
            case 9, 10, 11 -> System.out.println("가을");
            default -> System.out.println("잘못된 월입니다.");
        }
        /*
        switch (month){
            case 1: case 2: case 12:
                System.out.println("겨울");
                break;
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
        }

         */
    }
}
