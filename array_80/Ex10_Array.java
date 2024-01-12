package array_80;

public class Ex10_Array {

  public static void main(String[] args) {

    // js에서는 const num = [1,2,3];

    // 자바배열의 특징
    // 1. 단순히 양적인 저장공간
    // 2. 배열의 크기를 변경할 수 없다. (자바스크립트는 가능)
    // 3. 배열 선언시 크기를 지정해야 함 (자바스크립트는 하지 않는다)
    // 4. 배열의 길이는 "배열명.length" 로 확인
    int[] num = new int[3];

    num[0] = 75;
    num[1] = 82;
    num[2] = 91;

    // ArrayIndexOutOfBoundsException 예외오류 발생
    // num[3] = 33;

    // 전통적인 for문을 사용하여 배열의 아이템 출력
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }

    System.out.println("------------------------");

    // 배열 생성시 일괄 값할당
    int[] score = new int[] { 100, 80, 90 };

    // 어드밴스드한 for문을 사용하여 배열의 아이템 출력
    for (int value : score) {
      System.out.println(value);
    }

  }// main
}
