package condition_30;

import java.util.Scanner;

public class Ex50_If_Multi {

  public static void main(String[] args) {

    System.out.println("국어 점수를 입력하세요(0~100)");

    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();

    if (score > 90 && score <= 100) {
      System.out.println("A학점");
    } else if (score >= 80 && score < 90) {
      System.out.println("B학점");
    } else if (score >= 70 && score < 80) {
      System.out.println("C학점");
    } else {
      System.out.println("F학점");
    }

  }
}
