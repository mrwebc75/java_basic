package exception_110;

//배열의 예외발생에 대해 설명하는 예제
public class Ex20_Array_Exception {

  public static void main(String[] args) {

    int[] arrNum = new int[3];

    for (int i = 0; i < 5; i++) {

      // 예외오류 발생 회피용 if구문
      if (i < arrNum.length) {
        // i값이 3이 되는 순간 ArrayIndexOutOfBoundsException 예외오류 발생
        arrNum[i] = i;
        System.out.printf("\narrNum[%d] = %d", i, arrNum[i]);
      }

    }

  }
}
