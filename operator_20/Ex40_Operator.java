package operator_20;

//증감연산자
public class Ex40_Operator {

  public static void main(String[] args) {

    int a = 1;
    a = a + 1;// 2
    a += 1;// 3

    // 단독으로 사용할경우 전위와 후위증감연산자의 결과는 같다.
    a++;// 4 증가증연자
    ++a;

    System.out.println("1. a = " + a);

    int b = 5;

    b = b - 1;// 4
    b -= 1;// 3

    b--;// 2 감소연산자
    System.out.println("2. b = " + b);
  }
}
