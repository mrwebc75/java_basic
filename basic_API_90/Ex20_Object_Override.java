package basic_API_90;

//Object 클래스의 toString(), equals()를 오버라이드 하는 예제
class MyObject {
  private String msg;

  public MyObject(String msg) {
    this.msg = msg;
  }

  @Override // Object 클래스의 toString() 메소드를 오버라이드 함
  public String toString() {
    return msg;
  }

  // 규칙변경 -> 타입이 같고, 전달받은 문자열이 같으면 true
  @Override
  public boolean equals(Object obj) {
    // if (this.getClass() == obj.getClass()) {//타입비교
    if (obj instanceof MyObject) {// obj가 MyObject 클래스의 객체인지 확인 -> true/false

      return msg.equals(((MyObject) obj).msg);

    } else {
      return false;
    }
  }

}

public class Ex20_Object_Override {

  public static void main(String[] args) {

    MyObject obj1 = new MyObject("굿모닝");
    System.out.println("obj1.toString() -> " + obj1.toString());

    MyObject obj2 = new MyObject("Good Morning");
    MyObject obj3 = new MyObject("Good Morning");

    if (obj2.equals(obj3)) {
      System.out.println("obj2.equals(obj3) is True");
    } else {
      System.out.println("obj2.equals(obj3) is False");
    }

  }
}
