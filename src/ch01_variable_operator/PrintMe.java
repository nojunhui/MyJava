package ch01_variable_operator;

public class PrintMe {
    static void main() {
        // 이름 나이 키 몸무게 혈액형 문자 진위
        // 변수 정의
        String name;
        int age;
        double height, weight;
        String blood;
        char type;
        boolean bool;

        name = "홍길동";
        age = 30;
        height = 175.2;
        weight =  65.7;
        blood = "B";
        type = 'B';
        bool = true;

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("혈액형 : " + blood);
        System.out.println("타입 : " + type);
        System.out.println("진위 : " + bool);

    }
}
