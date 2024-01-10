package class_50;

class Calc {

  // 싱글톤 객체 생성 단계

  // 1단계 - 기본생성자를 private로 은닉하게 되면 new를 통한 객체생성이 금지된다.
  private Calc() {
  }

  // 2단계 - 외부에 제공할 private 처리한 스태틱 객체 생성
  private static Calc current = new Calc();

  // 3단계 - 외부에서 객체를 받을 수 있는 스태틱함수 생성
  // 리턴할 값이 static 변수이기 때문에 이 메소드도 static 이어야 한다.
  public static Calc getInstance() {
    return current;
  }

}

public class Ex110_SingleTon {

  public static void main(String[] args) {

    Calc cal_1 = Calc.getInstance();// Calc@4d591d15
    Calc cal_2 = Calc.getInstance();// Calc@4d591d15

    System.out.println("cal_1 = " + cal_1);
    System.out.println("cal_2 = " + cal_2);

  }

}
