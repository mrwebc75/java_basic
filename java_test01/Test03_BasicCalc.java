package java_test01;

abstract class Calc {
  public int add(int a, int b) {// 더하기
    return a + b;
  }

  // 1. add를 오버로딩하여 인자 세개를 더하는 메소드를 작성하시오. (20점)
  public int add(int a, int b, int c) {
    return a + b + c;
  }

  public abstract int sub(int a, int b);// 빼기
}

public class Test03_BasicCalc extends Calc {

  // 2. sub 추상메소드를 구현하시오. (20점)
  @Override
  public int sub(int a, int b) {
    return a - b;
  }

}
