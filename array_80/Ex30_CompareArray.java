package array_80;

public class Ex30_CompareArray {

  public static String title = "두 배열에서 일치하는 값 찾기";

  public static int compareArray(int[] arr1, int[] arr2) {

    int count = 0;

    // 방법1
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr2.length; j++) {
        if (arr1[i] == arr2[j]) {
          count++;
        }
      }
    }

    // 방법2
    for (int item1 : arr1) {
      for (int item2 : arr2) {
        if (item1 == item2)
          count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {

    System.out.println(title);

    int[] arr1 = { 1, 9, 4, 2, 5 };
    int[] arr2 = { 5, 8, 6, 3, 1 };

    int result = compareArray(arr1, arr2);
    System.out.println("일치하는 데이터의 개수 : " + result);
  }
}
