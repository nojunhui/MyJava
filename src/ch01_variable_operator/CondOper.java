package ch01_variable_operator;

public class CondOper {
    static void main() {
        // 3개의 정수 중에서 가장 큰 숫자를 구해보기

        //최대 값 변수 이름 : max
        int x = 3, y = 8, z = 4;
        int max = x > y ? x : y; //큰 수 구하기 예시
        max = max > z ? max : z;

        System.out.println("출력 결과 : " + x + ", " + y + ", " + z + " 중 최대 수는 " + max + "입니다.");
    }
}
