package class_50;

class Cal {

  public void plus(int i, int j) {
    System.out.println(i + j);
  }

  public void plus(float f, float g) {
    System.out.println(f + g);
  }

  public void plus(double d, double e) {
    System.out.println(d + e);
  }

  /*
   * 오버로딩의 조건
   * 
   * 1. 함수명이 같아야 한다. 2. 매개변수의 개수 or 매개변수의 타입 or 매개변수의 순서가 달라야 한다. 3. 리턴타입은 아무
   * 관계없다.
   * 
   */

  // 아래의 plus() 메소드 호출이 잘 작동하도록 오버로딩 하시오.

}

public class Ex100_CalculatorMain {

  public static void main(String[] args) {

    Cal cal = new Cal();

    cal.plus(3, 5);
    cal.plus(0.1f, 0.2f);
    cal.plus(0.5d, 0.7d);

  }
}
