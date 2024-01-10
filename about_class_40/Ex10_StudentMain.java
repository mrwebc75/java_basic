package about_class_40;

public class Ex10_StudentMain {

  public static void main(String[] args) {

    // 데이터타입 변수명 = 값;
    // 선언과 할당을 분리해서 작성 가능
    Student duly;
    duly = new Student();// duly 객체의 생성

    System.out.println(duly.name);
    System.out.println(duly.age);

    duly.hello();
  }

}
