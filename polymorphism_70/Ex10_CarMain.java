package polymorphism_70;

//작업지시서 역할의 추상클래스 - 추상메소드를 1개 이상 가지고 있는 클래스
abstract class HCar {

  // 추상메소드 - 미구현된 메소드
  public abstract void door();

  public abstract void drive();
}

class Sonata extends HCar {

  @Override
  public void door() {
    System.out.println("문짝 4개 있는 승용차");
  }

  @Override
  public void drive() {
    System.out.println("최대시속 150km로 주행가능");
  }

  public void sound() {
    System.out.println("쏘나타만의 부드러운 경적소리");
  }
}

public class Ex10_CarMain {

  public static void main(String[] args) {

    // 미완성의 추상클래스는 new 키워드를 사용하여 객체를 만들수 없다.
    // HCar hcar = new HCar();

    Sonata sonata = new Sonata();

    // 완전하게 구현된 추상메소드를 호출
    sonata.door();
    sonata.drive();
    sonata.sound();

  }
}
