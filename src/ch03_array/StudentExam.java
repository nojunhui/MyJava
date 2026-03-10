package ch03_array;

/*
학생의 이름과 국어, 영어, 수학 점수를 입력 받고 학새에 대한 총점과 평균을 출력해 주는 프로그램을 작성해 보세요.
국어, 영어, 수학 점수는 반드시 정수형 배열을 이용하여야 합니다.
*/

/*
출력 결과

이름 입력 : 김철수
    점수 입력 : 60
    점수 입력 : 40
    점수 입력 : 70

학생의 정보
이름 : 김철수, 총점 : 170.00, 평균 : 56.67
*/


import java.util.Scanner;

public class StudentExam {
    static void main() {
        Scanner scan = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        String name = scan.nextLine();

        //int[] score = new int[3];
        String[] subject = {"국어", "영어", "수학"};

        double total = 0.0;
        double average = 0.0;

        for(int i = 0; i<subject.length; i++){
            System.out.print(subject[i] + " 점수 입력 : ");
            int input = scan.nextInt();

            total += input;
        }

        average = total/subject.length;
        System.out.println();
        System.out.println("학생의 정보");
        System.out.printf("이름 : %s, 총점 : %.2f, 평균 : %.2f", name, total, average);
    }
}