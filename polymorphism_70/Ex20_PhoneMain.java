package polymorphism_70;

//추상클래스
abstract class Phone {
  public abstract String on();

  public abstract String off();

}

//위의 추상클래스를 상속받았지만 완전하게 구현하지 않은 추상클래스
abstract class ComponentPhone extends Phone {
  @Override
  public String on() {
    return "전원이 켜집니다.";
  }
}

//상속받아 완전하게 구현한 클래스 
class SamsungPhone extends ComponentPhone {

  @Override
  public String off() {
    return "전원을 종료합니다.";
  }

  public String call() {
    return "전화를 겁니다";
  }

}

public class Ex20_PhoneMain {
  public static void main(String[] args) {

    SamsungPhone anycall = new SamsungPhone();

    // 완전하게 구현된 추상메소드 호출
    System.out.println(anycall.on());
    System.out.println(anycall.off());

    // SamsungPhone 클래스만의 메소드 호출
    System.out.println(anycall.call());
  }
}
