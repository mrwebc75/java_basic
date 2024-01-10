package class_50;

//클래스내에서 자기 자신의 생성자를 호출할 수 있음을 보여주는 예제
class Man {
  private String name;
  private int age;

  public Man() {
    this("둘리");
    // this를 이용해서 Man(String name) 생성자 호출
    System.out.println("Man() 생성자 완료");
  }

  public Man(String name) {
    this(name, 7);
    System.out.println("Man(String name) 생성자 완료");
  }

  public Man(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("Man(String name, int age) 생성자 완료");
  }

}

public class Ex130_ManMain {
  public static void main(String[] args) {

    Man man = new Man();// 객체생성
  }
}
