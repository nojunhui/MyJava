package ch01_variable_operator;

public class Condition02 {
    static void main(String[] args) {
        int x = 10, y = 20;

        // 2개의 숫자 중에서 큰 수 고르기

        // ① 타입 result = 조건식 ? 참일 때 처리 : 거짓일 때 처리 ;
        // ② x >= y ? true : false 이 한 묶음이 조건 연산자임(3항 연산자 라고도 함)
        // ③ result와 x, y는 타입이 같아야 함.
        int result_1 = x >= y ? x : y;
        System.out.println("result : " + result_1);
        // ----------------------------------------------------------------------

        // x가 짝수인지 홀수인지 판단해 보세요.
        System.out.println();
        System.out.println("Q1. x는 짝수인가요?");
        System.out.println("x 값 : " + x);

        boolean bool = x % 2 == 0? true : false;
        System.out.println("(boolean 타입) 결과 : " + bool);

        String str = x % 2 == 0? "짝수" : "홀수";
        System.out.println("(String 타입) 결과 : " + str);
        System.out.println();
        // -----------------------------------------------------------------------

        // x가 3의 배수이면 제곱을, 아니면 더하기 5의 결과 출력하기
        System.out.println("Q2. x가 3의 배수이면 제곱, 아니라면 5를 더하세요. ");
        x = 6;
        System.out.println("x 값 : " + x);

        int result_2 = x % 3 == 0? x*x : x+5;
        System.out.println("결과 : " + result_2);
        System.out.println();
        // ---------------------------------------------------------------------

        //month가 봄인지 판단하기
        int month = 3;
        String season = month>=3 && month<=5? "봄 " : "다른 계절 ";

        System.out.println("Q3. month가 봄인가요?");
        System.out.println("month : " + month + "월");
        System.out.println("결과 : " + season + "입니다.");


    }
}