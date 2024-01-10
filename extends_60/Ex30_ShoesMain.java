package extends_60;

//메소드 오버라이딩
class Shoe {
  public void info() {
    System.out.println("1. Shoe 클래스의 info() 실행");
  }
}

class Hill extends Shoe {

  @Override
  public void info() {
    System.out.println("2. Hill 클래스의 info() 실행");
  }
}

class HiHill extends Hill {

  @Override
  public void info() {
    System.out.println("3. HiHill 클래스의 info() 실행");
  }
}

public class Ex30_ShoesMain {

  public static void main(String[] args) {

    Shoe shoe = new Shoe();
    shoe.info();

    Hill hill = new Hill();
    hill.info();

    HiHill hiHill = new HiHill();
    hiHill.info();
  }

}
