package extends_60;

//상속을 통한 기능확장을 설명하는 예제
//부모, 상위클래스
class ParentCal {

  public ParentCal() {
    super();// Object 클래스의 생성자함수를 호출
    System.out.println("ParentCal 생성자함수 실행됨");
  }

  public int plus(int x, int y) {
    return x + y;
  }

  public int minus(int x, int y) {
    return x - y;
  }
}

//자식, 하위클래스
class ChildCal extends ParentCal {

  // 상속을 받았을 경우 아래의 기본생성자가 자동 추가된다.
  public ChildCal() {
    super();// 생략가능
    System.out.println("ChildCal 생성자함수 실행됨");
  }

  public int mul(int x, int y) {
    return x * y;
  }

  public int div(int x, int y) {
    if (y != 0) {
      return x / y;
    }

    return 0;
  }
}

public class Ex20_Calculator {

  public static void main(String[] args) {

    // 부모객체
    ParentCal parent = new ParentCal();
    System.out.println(parent.plus(100, 50));
    System.out.println(parent.minus(100, 50));

    // 자식객체
    ChildCal child = new ChildCal();
    System.out.println(child.plus(200, 100));
    System.out.println(child.minus(200, 100));
    System.out.println(child.mul(200, 100));
    System.out.println(child.div(200, 100));
  }
}
