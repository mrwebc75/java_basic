package extends_60;

//super 키워드를 이용한 부모의 메소드 호출
class Father {
  public void sayHello() {
    System.out.println("Father의 sayHello()~!");
  }
}

class Son extends Father {

  @Override
  public void sayHello() {
    System.out.println("Son의 sayHello()~!");
  }

  public void test() {
    super.sayHello();
  }

}

public class Ex40_NewSon {

  public static void main(String[] args) {

    Son son = new Son();
    son.sayHello();

    // son.super.sayHello(); 이런코드는 불가능
    son.test();// 메소드를 하나 만든후 그 내부에서 부모의 메소드 호출가능
  }

}
