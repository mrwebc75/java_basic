package class_50;

//생성자함수를 오버로딩하여 멤버변수의 값을 초기화
class Magic {
  private int num;// 0
  private String color;// null

  // 기본 생성자 함수
  // 보이지 않는 가상 매개변수 this를 컴파일러가 첫번째 매개변수로 넣어준다.
  public Magic() {
  }

  // Constructor OverLoading
  // 보이지 않는 가상 매개변수 this를 컴파일러가 첫번째 매개변수로 넣어준다.
  public Magic(int num, String color) {
    this.num = num;
    this.color = color;
  }

  void show(Magic this) {
    System.out.println("this = " + this);
    System.out.println("num = " + this.num);
    System.out.println("color = " + this.color);
  }

}

public class Ex80_MagicMain {
  public static void main(String[] args) {

    // int age;// 초기화가 안된 지역변수의 값을 출력시도 해서 에러발생
    // System.out.println("age = " + age);

    Magic magic_1 = new Magic();

    // 멤버변수에 직접접근 X
    // magic_1.setNum(100);
    // magic_1.color = "Red";

    magic_1.show();

    // 생성자함수를 이용한 멤버변수 초기화
    Magic magic_2 = new Magic(7, "블루");
    magic_2.show();

  }// main
}
