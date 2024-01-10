package condition_30;

import java.util.Scanner;

public class Ex70_Switch {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("학점을 입력하세요");
    String hakjum = sc.nextLine();

    switch (hakjum) {

    case "A":
      System.out.println("90~100점 사이 입니다.");
      break;

    case "B":
      System.out.println("80~90점 사이 입니다.");
      break;

    case "C":
      System.out.println("70~80점 사이 입니다.");
      break;

    default:
      System.out.println("70점 이하 입니다.");

    }// switch

  }
}
