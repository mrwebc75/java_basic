package operator_20;

public class Ex20_Operator {

  // 여러가지 자료형의 나눗셈 결과
  public static void main(String[] args) {

    // 정수의 나눗셈
    int a = 7;
    int b = 3;

    int result1 = a / b;// 2
    System.out.println("1. 7/3 = " + result1);

    // 실수의 나눗셈
    double c = 7.0d;
    double d = 3.0d;
    double result2 = c / d;
    System.out.println("2. 7.0/3.0 = " + result2);

    // 정수와 실수의 나눗셈
    // int result3 = c / b; 에러발생
    double result3 = c / b;
    System.out.println("3. 7.0/3 = " + result3);

    // 0으로 나누기 -> 에러
    int num = 100;
    int zero = 0;
    int result4 = num / zero;// 연산이 불가능하므로 에러발생~!

    System.out.println("4. 100/0 = " + result4);

  }// end of main
}
