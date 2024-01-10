package condition_30;

import java.util.Scanner;

public class Ex60_NestedIf {

  public static void main(String[] args) {

    System.out.println("점수를 입력하세요");

    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();

    if (score >= 90 && score < 100) {

      if (score > 97) {
        System.out.println("A 플러스 학점 입니다.");
      } else if (score < 94) {
        System.out.println("A 마이너스 학점 입니다.");
      } else {
        System.out.println("A 제로 학점입니다.");
      }

    } // end of if
  }// main
}
