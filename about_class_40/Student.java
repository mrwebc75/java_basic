package about_class_40;

//사용자정의 데이터타입 Student
//부품으로 쓰일 클래스
public class Student {

  // 멤버변수의 선언과 할당을 동시에
  String name = "둘리";
  int age = 7;

  // 멤버함수
  public void hello() {
    System.out.println("내 이름은" + name);
    System.out.println("내 나이는" + age);
  }

}
