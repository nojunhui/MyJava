package ch01_variable_operator;

public class Q1 {
    static void main() {
        String Name;
        double Kor_score, Eng_score, Avg;

        Name = "홍길동";
        Kor_score = 40.0;
        Eng_score = 43.0;
        Avg = (Kor_score+Eng_score)/2; //괄호 하고 나누기

        System.out.println("이름 : " + Name);
        System.out.println("국어 : " + Kor_score);
        System.out.println("영어 : " + Eng_score);
        System.out.println("평균 : " + Avg);
    }
}
