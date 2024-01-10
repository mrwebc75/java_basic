package operator_20;

//논리연산자
public class Ex70_Operator {

  public static void main(String[] args) {

    int a = 100;
    int b = 200;

    int x = 5;
    int y = 3;

    // 논리연산에 대한 결과는 boolean 이다.
    boolean result1 = a != b || a == b;
    boolean result2 = a < b || x > y;

    System.out.println("1. result1 = " + result1);// true
    System.out.println("2. result2 = " + result2);// true

    boolean r1 = a >= b;// false
    boolean r2 = x >= y;// true

    boolean result3 = r1 && r2;// false
    boolean result4 = r1 || r2;// true

    System.out.println("result3 = " + result3);
    System.out.println("result4 = " + result4);

    boolean success = true;
    boolean fail = !success;// false Not연산자

    System.out.println("fail = " + fail);
  }
}
