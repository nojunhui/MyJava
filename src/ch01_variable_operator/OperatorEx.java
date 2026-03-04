package ch01_variable_operator;

public class OperatorEx {
    static void main() {
        int a = 3 - -2, b= 3; // a = 5, b = 3
        int x = (a >= b) ? 5 : (a+2); // 5 >= 3 ? 5 : (a+2) -> 참이니까 x = 5

        x += ++a; // x = x + ++a -> 5 + 6 = 11 -> x 최종값 = 11
        int y = ++a; // y = 7
        y += a + --b; // y = y + a + --b -> 7 + 7 + 2 = 16 -> y 최종값 = 16

        char ch3 = 'D';
        int z = 'A' <= ch3 && ch3 <= 'Z' ? --y : x + 2; // z 최종값 = 15

        // 정리하면 x = 11, y = 15, z = 15
        int result = 0;
        result = x > y ? z - y : x + z; // 11 > 15 ? -1 : 26 -> false니까 result = 26

        System.out.println("result : " + result); // 26
    }
}
