package condition_30;

import java.util.Scanner;

public class Ex20_If_Simple {

  public static void main(String[] args) {

    /*
     * 키보드로 점수를 입력받아 score 변수에 저장후 만약 70<=score<80 이 범위에 해당하면 "C학점 입니다."를 출력하는 코드를
     * 작성하시오.
     * 
     * 입력받은 값이 위 범위를 벗어나면 "범위를 벗어났습니다." 라고 출력하는 코드를 작성하시오.
     */

    System.out.println("점수를 입력하세요");

    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();

    if (score >= 70 && score < 80) {
      System.out.println("C학점 입니다.");
    }

    if (score < 70 || score >= 80) {
      System.out.println("범위를 벗어났습니다.");
    }

  }
}
