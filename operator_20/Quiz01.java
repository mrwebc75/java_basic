package operator_20;

import java.util.Scanner;

/**
 * ------------------------------------------------- 1) int형 변수 year를 선언하고 자신이
 * 태어난 년도를 대입합니다. 2) age 변수를 선언하고, year 변수를 사용하여 자신의 나이를 계산하여 대입하세요.
 * 
 * [출력결과 예시] -------------------------------------------------- 25세 입니다.
 */

public class Quiz01 {

  public static void main(String[] args) {

    System.out.println("태어난 년도를 입력하세요");

    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();

    int age = 2023 - year + 1;

    System.out.println(age + "세 입니다.");
  }
}
