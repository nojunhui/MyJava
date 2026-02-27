package ch01_variable_operator;

/*
    작성자 : 홍길동
    작성일 : 2026/02/26
    내용 : 처음 만들어 보는 자바 프로그램
 */
// 주석(comment) : 프로그램 실행에 영향을 주지 않는 보조 설명 문구
public class YourPrint {
    //main 메소드는 프로그램 starting point
    static void main(String[] args) { // 중괄호 기호는 세미콜론 붙이는 거 예외
        // 모든 문장의 끝에 세미콜론을 붙여 줍니다.
        System.out.println("world");

        // 나의 이름을 출력합니다.
        System.out.println("홍 길동");

        // 문자는 외따옴표, 문자열은 쌍따옴표
        // sout는 System.out.println()를 타이핑하기 위한 hot key

        // System.out.println()는 문자열을 출력하고, 엔터키를 눌러 줍니다.

        System.out.println("박"); // 성씨 출력
        System.out.println();
        System.out.println("철");
        System.out.println("수");
    }
}
