package exception_110;

//배열의 공간이 모자라 발생하는 예외오류를 처리하는 예제
public class Ex40_ArrayExceptionHandling {

  public static void main(String[] args) {

    int[] arrNum = new int[3];

    try {

      for (int i = 0; i < 5; i++) {

        // i값이 3이 되는 순간 ArrayIndexOutOfBoundsException 예외오류 발생
        arrNum[i] = i;
        System.out.printf("\narrNum[%d] = %d", i, arrNum[i]);
      }

    } catch (ArrayIndexOutOfBoundsException e) {

      System.out.println("배열의 저장공간이 모자라서 예외오류가 발생했습니다.");
      System.out.println("원인 : " + e.getMessage());
      System.out.println("예외의 종류 : " + e.toString());
      System.out.println("예외오류 원인추척");
      e.printStackTrace();
    }

    System.out.println("프로그램을 종료합니다.");

  }
}
