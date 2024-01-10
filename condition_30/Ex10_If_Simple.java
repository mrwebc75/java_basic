package condition_30;

import java.util.Scanner;

//단순 if문
public class Ex10_If_Simple {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("나이를 입력하세요");
    int myage = sc.nextInt();

    if (myage == 19) {
      System.out.println("19살 입니다.");
    }

    if (myage != 20) {
      System.out.println("20살이 아닙니다.");
    }

    if (myage > 19) {
      System.out.println("성인입니다.");
    }

    if (myage <= 19) {
      System.out.println("학생입니다.");
    }

  }
}
