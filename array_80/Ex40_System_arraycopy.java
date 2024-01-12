package array_80;

public class Ex40_System_arraycopy {

  public static void main(String[] args) {

    // 배열의 부분복사
    // System.arraycopy(원본배열, 원본에서읽어올시작index, 복사할배열, 삽입할index, 읽어올개수);

    int[] origin = { 5, 6, 4, 3, 9, 8 };
    int[] target = { 100, 200, 300, 400, 500, 600, 700 };// 100, 200, 300, 4, 3, 9, 8

    System.arraycopy(origin, 2, target, 3, 4);

    for (int item : target) {
      System.out.println(item);
    }
  }
}
