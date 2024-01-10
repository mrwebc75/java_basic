package variable_10;

//상수의 선언과 할당
public class Ex40_Value {

  public static void main(String[] args) {

    // 일반 변수
    int width = 100;
    width = 200;// 일반변수는 재할당 가능

    // 상수
    final double PI = 3.14d;
    // PI = 2.54d; 상수는 재할당 불가능하므로 에러발생

    System.out.println("1. width = " + width);
    System.out.println("2. PI = " + PI);
  }

}
