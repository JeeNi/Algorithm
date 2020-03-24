package chap01;
import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {
       Scanner stnIn = new Scanner(System.in);

        System.out.println("a의 값： ");
        int a = stnIn.nextInt();

        int b = 0;
        while (true) {
            System.out.println("b의 값: ");
            b = stnIn.nextInt();

            if (b > a)
                break;
            System.out.println("a보다 큰 값을 입력하세요!");
        }

        System.out.println("b - a는 " + (b - a) + "입니다.");
    }

}
