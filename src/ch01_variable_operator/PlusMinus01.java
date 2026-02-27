package ch01_variable_operator;

public class PlusMinus01 {
    static void main() {
        int a = 10, b = 20, c;

        // '전위' 연산자는 모든 연산자보다 먼저 실행
        // '후위' 연산자는 모든 연산자보다 나중에 실행
        c = ++a + b++;

        System.out.println("a : " + a); // 11
        System.out.println("b : " + b); // 21
        System.out.println("c : " + c); // 31

        c= a++ + --b;

        System.out.println("a : " + a); // 12
        System.out.println("b : " + b); // 20
        System.out.println("c : " + c); // 31

        a = 150;
        b = 12;

        c= --a + --b;

        System.out.println("a : " + a); // 14
        System.out.println("b : " + b); // 11
        System.out.println("c : " + c); // 25
        System.out.println("-------------");

        a = 10;
        b = 20;
        ++a; // 11
        b--; // 19
        System.out.println("a : " + a); // 11
        System.out.println("b : " + b); // 19

        c = ++ a + b--; // 11에 1을 증가한 12(a)에다가 19(b) 더한 걸 c에 대입(31) 이거 끝나고 나서 b는 18 됨

        System.out.println("a : " + a); // 12
        System.out.println("b : " + b); // 18
        System.out.println("c : " + c); // 31

        int d;
        System.out.println("d : " + (c + ++a + --a + --a)); // 31
        // 31 + 13 + 12 + 11 = 67
    }
}
