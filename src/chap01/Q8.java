package chap01;
import java.util.Scanner;
// 1, 2, …, n의 합을 구합니다  (식1 + 2 + … + n = 999라고 출력함)

public class Q8 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값：");
        int n = stdIn.nextInt();

        int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
