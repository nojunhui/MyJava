package ch02_control_statement;

import java.util.Scanner;

public class While04 {
    static void main(String[] args) {
        int total = 0; // 총점
        double average = 0.0; // 평균
        int counter = 0 ; // 카운터 변수
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("점수를 입력해 주세요.");
            int jumsu = scan.nextInt();

            if(jumsu < 0){
                System.out.println("음수이므로 종료합니다.");
                break;
            }

            counter++;
            total += jumsu;
        }

        System.out.println("총합 : " + total);
        System.out.println("평균 : " + ((double)total/counter));
    }
}