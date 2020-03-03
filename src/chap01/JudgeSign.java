package chap01;

import java.util.Scanner;
// 입력한 정숫값이 양수인지 음수인지 0인지 판단합니다.

class JudgeSign {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요.");
        int n = stdIn.nextInt();

//        if (n > 0)
//            System.out.println("이 수는 양수입니다.");
//        else if (n < 0)
//            System.out.println("이 수는 음수입니다.");
//        else
//            System.out.println("이 수는 0입니다.");

          if (n == 1)
              System.out.println("이 수는 1입니다.");
          else if (n == 2)
              System.out.println("이 수는 2입니다.");
          else if (n == 3)
              System.out.println("이 수는 3입니다.");
          else
              ; // 공백문(실제로 아무것도 하지 않는 문장)

          // 4를 입력하면 공백문, else if (n == 3)에서 (n == 3)을 삭제하면 3이 출력
          // 이유는 if, else if, else 문이 되기 때문
    }
}
