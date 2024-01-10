package class_50;

//게터와 세터형식의 클래스
class Person {
  private String name = "둘리";
  private int age = 7;

  // 게터함수
  public String getName() {
    return name;
  }

  // 세터함수
  public void setName(String name) {
    this.name = name;
  }

  // 게터함수
  public int getAge() {
    return age;
  }

  // 세터함수
  public void setAge(int age) {
    this.age = age;
  }

  void say() {
    String name = "하니";
    System.out.println("이름 : " + this.name);
    System.out.println("나이 : " + this.getAge());
  }

}

public class Ex50_GetterSetter {

  public static void main(String[] args) {

    Person duly = new Person();

    System.out.println(duly.getName());
    System.out.println(duly.getAge());

    duly.say();

  }
}
