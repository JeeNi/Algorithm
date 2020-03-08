package chap01;

import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0;            // 합
        int i = 1;

        while (i <= n) {        // i가 n 이하이면 반복합니다.
            sum += i;           // sum에 i를 더합니다.
            i++;                // i 값을 1만큼 증가시킵니다.
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

        System.out.println("변수 i 최종값은 i+1인 " + i + "입니다.");     // i값이 n을 초과할 때 종료 되므로
    }
}