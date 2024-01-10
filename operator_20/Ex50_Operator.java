package operator_20;

//증감연산자를 포함한 연산
public class Ex50_Operator {

  public static void main(String[] args) {

    int a = 100;
    int b = 1;

    // 후위증감연산자가 어떤 연산의 재료로 사용되면
    // 가지고 있던 값을 먼저 연산에 사용후 값을 변화시킨다.
    int result = a + b++;// 101

    System.out.println("result = " + result);// 101
    System.out.println("b = " + b);// 2

    int x = 100;
    int y = 1;

    // 전위증감연산자가 어떤 연산의 재료로 사용되면
    // 먼저 값을 증감시킨후 그 결과를 연산에 반영하여 계산한다.
    result = x + ++y;
    System.out.println("result = " + result);// 102
    System.out.println("y = " + y);// 2
  }
}
