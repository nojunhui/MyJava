package ch03_array;

import java.util.Scanner; //입력함수 불러옴

public class EvenOdd {
    static void main() {
        Scanner scan = new Scanner(System.in); //입력함수 불러오기

        System.out.print("배열 요소 개수 입력 : ");
        int size = scan.nextInt();

        int[] jumsu = new int[size];

        int odd = 0, even = 0; // 합산 변수들은 반복하기 전에 정의

        for (int i = 0; i < jumsu.length; i++) { //jumsu.length대신 size입력해도 됨
            System.out.print(i + "번째 정수 입력 : ");
            jumsu[i] = scan.nextInt();

            if (jumsu[i]%2==1){ //요소의 값이 홀수이면
                odd += jumsu[i];
            }else{
                even += jumsu[i];
            }

        }

        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);

    }
}