package class_50_test;

/**
 * ------------------------------------------- 다음의 프로그램이 동작할 수 있도록 Square 클래스를
 * 작성하시오. - Square에는 가로를 의미하는 width, 세로를 의미하는 height를 멤버변수로 정의합니다. (getter,
 * setter는 추가하지 않아도 됩니다.) - 사각형의 넓이는 `가로x세로` 입니다. - 사각형의 둘레 길이는 `가로x2 + 세로x2`
 * 입니다.
 *
 *
 * [실행결과 예시] ------------------------------------------- 1. 사각형의 넓이 -> 6제곱cm 2.
 * 사각형의 둘레 -> 10cm
 */
class Square {
  private int width;
  private int height;

  public Square(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getArea() {
    return width * height;
  }

  public int getRound() {
    return (width + height) * 2;
  }
}

public class Quiz_Square_20 {

  public static void main(String[] args) {
    Square s = new Square(3, 2);
    System.out.println("1. 사각형의 넓이 -> " + s.getArea() + "제곱cm");
    System.out.println("2. 사각형의 둘레-> " + s.getRound() + "cm");
  }
}
