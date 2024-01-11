package polymorphism_70;

//업캐스팅시 호출할 수 있는 메소드와 없는 메소드 구분하는 예제
class Fruit {
  public void color() {
    System.out.println("다양한 과일색");
  }
}

class Apple extends Fruit {
  public void taste() {
    System.out.println("1. 상쾌한 맛");
  }

  public void size() {
    System.out.println("2. 큰 부사");
  }

  @Override
  public void color() {
    System.out.println("3. 빨간색 사과");
  }
}

class FineApple extends Apple {
}

public class Ex50_FruitMain {

  public static void main(String[] args) {

    Apple apple = new Apple();
    apple.color();
    apple.taste();
    apple.size();

    System.out.println("----------------");

    Fruit f = new Apple();
    f.color();// Apple의 메소드 호출

    // Fruit 클래스는 size(), taste() 메소드가 없으므로 호출 불가
    // f.taste();
    // f.size();

  }
}
