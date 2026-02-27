package ch01_variable_operator;

public class Add2 {
    static void main() {
        //항상 코드 짤 때 변수를 몇 개 만들어야 하는지 생각

        int a, b, c, result ; // 한 번에 여러 개 변수 만들 수 있음

        a = 3 ;
        b = 4 ;
        c = 5 ;

        result = 2 * a + 3 * b - c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("result = " + result);

        for(int i=0; i<10; i++) {
            for(int j=5; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
