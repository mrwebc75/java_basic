package basic_API_90;

import extends_60.components.Army;

/*
 * Object 클래스의 특징
 * 
 * 1. import 없이 사용 가능
 * 2. extends 없이도 자동 상속되어 있음
 * 3. 자바에 존재하는 모든 클래스들은 Object의 하위클래스 
 * 4. 모든 클래스들은 Object에 속한 메소드를 사용할 수 있다.
 */

public class Ex10_ObjectClass extends Object {

  public static void main(String[] args) {

    // 같은 메모리를 사용하는 같은 타입의 객체인지 확인
    Object obj1 = new Object();
    Object obj2 = new Object();

    // obj1 출력결과와 obj1.toString() 결과는 같다.
    // 즉, 객체이름만 작성하면 toStirng()이 자동 호출된다.

    System.out.println(obj1);// 패키지명.클래스명@16진수HexCode
    System.out.println(obj1.toString());// 패키지명.클래스명@16진수HexCode

    Army army = new Army("육군");
    System.out.println(army);
    System.out.println(army.toString());

    // 패키지명.클래스명 출력
    System.out.println(army.getClass().getName());// extends_60.components.Army

    // == 연산자를 이용한 참조(주소)값 비교 -> false
    if (obj1 == obj2) {
      System.out.println("obj1 == obj2 is True");
    } else {
      System.out.println("obj1 === obj2 is False");
    }

    /*
     * Object 클래스의 equals()는 '=='로 비교한것과 같은 결과이다. 즉, 기본적으로 주소값이 동등한지 비교한다. 하지만
     * 하위클래스에서 얼마든지 Override 할 수 있다. 대표적으로 String 클래스는 문자열 값을 비교할 수 있도록 toString()
     * 메소드를 오버라이딩 했다.
     */

    // .equals() 메소드를 이용한 참조(주소)값 비교 -> false
    if (obj1.equals(obj2)) {
      System.out.println("obj1.equals(obj2) is True");
    } else {
      System.out.println("obj1.equals(obj2) is False");
    }
  }
}
