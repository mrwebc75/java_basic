package loop_40;

public class Ex30_ForIf {
  /*
   * for 반복문을 이용하여 1부터 100까지 짝수의 합과 홀수의 합을 구하여 출력하시오.
   * 
   * 짝수의 합 = evenSum -> 2550 홀수의 합 = oddSum -> 2500
   */
  public static void main(String[] args) {

    int oddSum = 0;
    int evenSum = 0;

    // 홀수의 합
    for (int i = 1; i <= 100; i += 2) {
      oddSum += i;
    }

    // 짝수의 합
    for (int i = 2; i <= 100; i += 2) {
      evenSum += i;
    }

    oddSum = 0;
    evenSum = 0;

    // 짝수 홀수의 합을 한번에
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 1) {// 홀수
        oddSum += i;
      } else {// 짝수
        evenSum += i;
      }
    }

    System.out.println("oddSum = " + oddSum);
    System.out.println("evenSum = " + evenSum);

  }
}
