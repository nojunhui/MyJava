package ch02_control_statement;

public class study {
    public static void main(String[] args) {

        int i = 0;
        String star = "*";

        for (int t = 0; t < 2; t++) {
            for (i = 0; i < 4; i++) {

                int s = 1 + 2 * i; // 별 개수

                // 공백 출력
                for (int k = 0; k < 3 - i; k++) {
                    System.out.print(" ");
                }

                // 별 출력
                for (int j = 0; j < s; j++) {
                    System.out.print(star);
                }

                System.out.println(); // 줄바꿈
            }
        }
            System.out.println("  ㅣㅣ  ");
            System.out.println("   ㅡ  ");

    }
}