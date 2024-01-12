package array_80;

/*
 * 1) 다음과 같이 1차 배열을 정의하세요.
 * 
 *    int[] arr = { 1, 9, 4, 2, 5 };
 *    
 *    
 * 2) arr과 사이즈가 동일한 copy라는 이름의 배열을 생성하고,
 *    arr의 각 칸에 저장되어 있는 값들 copy 배열에 복사하세요.
 *    (반복문을 사용해야 합니다.)
 *    
 * 
 * 3) 복사된 결과를 확인하기 위하여 copy 배열의 모든 내용을 출력하세요.
 */
public class Ex20_ArrayCopy {
  public static void main(String[] args) {

    int[] arr = { 1, 9, 4, 2, 5 };// 주소값 0x0101

    // arr과 사이즈가 동일한 copy 배열 정의
    int[] copy = new int[arr.length];

    // 얕은복사 - Shallow Copy
    // 지금부터는 두 배열이 같은 주소값을 가지게 된다.
    int[] newCopy = arr;// 주소값 0x0101

    newCopy[0] = 100;
    System.out.println("newCopy[0] = " + newCopy[0]);
    System.out.println("arr[0] = " + arr[0]);

    // 배열의 데이터 복사
    // 깊은복사 - Deep Copy -> 불변 immutability
    for (int i = 0; i < arr.length; i++) {
      copy[i] = arr[i];
    }

    // copy 배열 출력
    for (int num : copy) {
      System.out.println(num);
    }

    System.out.println("------------------");

    // newCopy 배열 출력
    for (int num : newCopy) {
      System.out.println(num);
    }

  }
}
