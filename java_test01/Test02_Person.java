package java_test01;

public class Test02_Person {

  private String firstName;
  private String lastName;
  private int age;
  private double height;

  public Test02_Person(String firstName, String lastName) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // 문제 - 나이를 설정하는 setAge() 메소드를 정의하시오. (10점)
  public void setAge(int age) {
    this.age = age;
  }

  // 문제 - 나이를 반환하는 getAge() 메소드를 정의하시오. (10점)
  public int getAge() {
    return age;
  }

  // 문제 - 키를 설정하는 setHeight() 메소드를 정의하시오. (10점)
  public void setHeight(double height) {
    this.height = height;
  }
}
