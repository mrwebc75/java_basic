package basic_API_90;

/*
  Wrapper 클래스
    1. 기본 연산자가 제공하지 않는 기능을 구현한 여러 메소드를 제공하는 클래스
    2. Boolean, Byte, Short, Character, Integer, Float, Long, Double
    3. 만약 필요한 기능이 여기에도 없다면..... 직접 구현한다.
    4. 래퍼클래스의 가장 중요한 기능은 특정 데이터 모양을 하고 있는 문자열을 실제 데이터형으로 변환하는 기능이다.
*/
public class Ex120_WrapperClass {

  public static void main(String[] args) {

    String a = "20";
    String b = "3.14";

    int numA = Integer.parseInt(a);
    float numB = Float.parseFloat(b);

    // AutoBoxing, UnBoxing

    // 오토박싱은 래퍼클래스 변수에 기본타입 값이 할당될때 자동 발생한다.
    Integer age = 24;

    // 언박싱은 기본타입 변수에 래퍼클래스 객체가 할당될때 자동 발생한다.
    int nowAge = age;
  }
}
