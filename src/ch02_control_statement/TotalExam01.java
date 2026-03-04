package ch02_control_statement;

public class TotalExam01 {
    static void main(String[] args) {
        String name = "김철수";
        int kor = 85, eng = 70, math = 90 ;
        String grade ; // 학점 변수
        String message = "" ;

        double average = (double)(kor+eng+math)/3;

        if (average >= 90) {
            grade = "A";
            System.out.printf("%s 학점", grade);
        } else if (80 <= average && average < 90) {
            grade = "B";
            System.out.printf("%s 학점", grade);
        } else if (average >= 70) {
            grade = "C";
            System.out.printf("%s 학점", grade);
        } else if (average >= 60) {
            grade = "D";
            System.out.printf("%s 학점", grade);
        } else {
            grade = "F";
            System.out.printf("%s 학점", grade);
        }
        System.out.println("\n--------------------");

        System.out.printf("이름 : %s 님\n",name);
        System.out.printf("국어 : %d점, 영어 : %d점, 수학 : %d점\n",kor, eng, math);
        System.out.printf("총점 : %d점, 평균 %.5f\n",kor+eng+math, average);
        System.out.printf("학점 : %s\n",grade);
        switch (grade){
            case "A": case "B":
                message = "참 잘 하셨습니다.";
                System.out.println("메시지 : " + message);
                break;
            case "C": case "D":
                message = "조금만 더 노력하세요.";
                System.out.println("메시지 : " + message);
                break;
            case "F":
                message = "다음 학기에 재수강하세요.";
                System.out.println("메시지 : " + message);
                break;
            default:
                message = "잘못된 입력입니다.";
                System.out.println("메시지 : " + message);

        }
    }
}
/*
(다중택일로 풀기)
이름과 국어, 영어, 수학 점수를 이용하여 학점을 매기세요.
학점은 세 과목의 평균을 이용하여 매기세요.

String name = "김철수";
int kor = 85, eng = 70, math = 90 ;

String grade ; // 학점 변수

String message = "" ;

(switch로 풀기)
학점이 "A" 또는 "B"이면 "참 잘 하셨습니다."를 message 변수에 저장한다.
학점이 "C" 또는 "D"이면 "조금만 더 노력하세요."를 message 변수에 저장한다.
학점이 "F"이면 "다음 학기에 재수강하세요."를 message 변수에 저장한다.
그 외의 값이 입력되면 "잘못된 입력입니다."를 message 변수에 저장한다.

출력 예시
이름 : 김철수님
국어 : 85점, 영어 : 70점, 수학 : 90점
총점 : 245점, 평균 : 81.66666
학점 : B
메시지 : 참 잘 하셨습니다.
*/