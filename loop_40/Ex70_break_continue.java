package loop_40;

public class Ex70_break_continue {

  public static void main(String[] args) {

    /*
     * 1. break - 종료조건과 상관없이 반복문을 탈출해야 할 때 사용
     * 
     * 2. continue - 반복과정을 한차례 건너띄게 할때 사용
     * 
     * 문제 - for문을 사용하여 1~10 출력중 5이면 건너뛰고, 8이 되는 순간 반복문을 탈출시키시오
     */

    for (int i = 1; i <= 10; i++) {

      // 5이면 건너뛰고
      if (i == 5)
        continue;

      // 8이면 탈출
      if (i == 8)
        break;

      System.out.println("i = " + i);
    }
  }
}
