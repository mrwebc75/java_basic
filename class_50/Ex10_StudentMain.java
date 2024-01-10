package class_50;

//멤버변수로만 이루어진 클래스->사용자정의 데이터타입
class Student {
  // 멤버변수, 필드

  String name = "홍길동";
  int age = 16;
}

public class Ex10_StudentMain {

  public static void main(String[] args) {

    // 객체의 선언과 할당 분리
    Student hong;
    hong = new Student();

    // 객체(변수) 생성
    // Student hong = new Student();

    System.out.println("1. 이름 : " + hong.name);
    System.out.println("2. 나이 : " + hong.age);
  }

}
