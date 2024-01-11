package polymorphism_70;

//인터페이스도 클래스의 한 종류이다.
//인터페이스는 추상메소드만 가능하다.
interface Color {

  // final 키워드를 변수에 붙이면 값을 변경할수 없다. -> 상수 -> js의 const
  public static final int RED = 1;
  int BLUE = 2; // public static final 가 변수타입 앞에 생략됨
  int GREEN = 3;
  int YELLOW = 4;
  int ORANGE = 5;

  void info(int color);// public abstract 을 리턴앞에 생략가능(관례)
}

//인터페이스를 상속받아 구현한 클래스
class Ball implements Color {

  // 싱글톤작업
  private Ball() {
  }

  private static Ball instance = new Ball();

  public static Ball getInstance() {
    return instance;
  }

  @Override
  public void info(int color) {

    // 숫자나 참조값을 비교할 때는 == 사용
    if (color == Color.RED) {
      System.out.println("빨간색 공");
    } else if (color == Color.BLUE) {
      System.out.println("파란색 공");
    } else if (color == Color.GREEN) {
      System.out.println("초록색 공");
    } else if (color == Color.YELLOW) {
      System.out.println("노란색 공");
    } else if (color == Color.ORANGE) {
      System.out.println("오렌지색 공");
    } else {
      System.out.println("미등록 공");
    }

  }

  public void change() {
    System.out.println("공 색상을 변경하겠습니다.");
  }
}

public class Ex30_BallMain {

  static int num = 10;

  public static void main(String[] args) {

    Ball myBall = Ball.getInstance();

    // 정수로 직접 입력
    myBall.info(1);
    myBall.info(2);
    myBall.info(3);
    myBall.info(4);
    myBall.info(5);

    System.out.println("-------------");

    // final 상수값을 이용하여 info() 메소드 호출
    myBall.info(Color.RED);
    myBall.info(Color.BLUE);
    myBall.info(Color.GREEN);
    myBall.info(Color.YELLOW);
    myBall.info(Color.ORANGE);

    // 스태틱 메소드 main 에서는 멤버변수 num을 static 처리해야 사용할 수 있다.
    System.out.println(num);

    // final 변수는 값을 재할당 할수 없다.
    // Color.RED = 100;

    System.out.println(Color.RED);
  }
}
