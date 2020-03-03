package chap01;

import java.util.Scanner;

class Q2 {
    static int min3(int a, int b, int c) {

        int min = a;

        if(b < min)
            min = b;
        if(c < min)
            min = c;

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("네 정수의 최솟값을 구합니다.");
        System.out.println("a의 값 : ");
        a = sc.nextInt();
        System.out.println("b의 값 : ");
        b = sc.nextInt();
        System.out.println("c의 값 : ");
        c = sc.nextInt();

        int min = min3(a, b, c);

        System.out.println("최댓값은" + min + "입니다.");
    }
}

