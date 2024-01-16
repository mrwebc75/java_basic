package collection_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex10_ArrayList {

  public static void main(String[] args) {

    // String 데이터만 입력가능한 ArrayList
    ArrayList<String> arrList = new ArrayList<String>();

    // 컬렉션은 객체만을 저장의 대상으로 한다.
    // 기본타입 값을 입력할 경우 AutoBoxing 처리된다.
    // arrList.add(100);// new Integer(100) - 오토박싱
    arrList.add("둘리");// new String("둘리") - 오토박싱
    // arrList.add(true);// new Boolean(true) - 오토박싱

    arrList.add("또치");
    arrList.add("도우너");
    arrList.add("마이콜");

    System.out.println("arrList = " + arrList);

    // 요소별로 아이템 가져오기
    System.out.println(arrList.get(0));
    System.out.println(arrList.get(1));
    System.out.println(arrList.get(2));
    System.out.println(arrList.get(3));

    // 인덱스 1에 해당하는 요소 삭제
    arrList.remove(1);

    System.out.println("--------------------");

    for (String name : arrList) {
      System.out.println(name);
    }

    System.out.println("--------------------");

    // arrList 객체의 데이터를 꺼내서 배열로 만드는 작업
    // 1. 같은 크기(길이)의 배열변수 선언
    // 2. toArray() 메소드를 이용하여 데이터 삽입
    String[] arrName = new String[arrList.size()];
    arrList.toArray(arrName);

    for (int i = 0; i < arrName.length; i++) {
      System.out.println(arrName[i]);
    }

    System.out.println("--------------------");

    System.out.println("arrList를 stream으로 출력");
    Stream<String> arrStream = arrList.stream();

    arrStream.forEach((name) -> {
      System.out.println(name);
    });

    System.out.println("--------------------");
    // 문제) arrName 배열의 원소값을 stream 문법을 이용하여 출력하시오.
    Stream<String> nameArrStream = Arrays.stream(arrName);
    // 람다식을 사용하여 출력
    nameArrStream.forEach((name) -> {
      System.out.println(name);
    });

    System.out.println("--------------------");
    // 문제) arrName 원소의 글자수를 stream을 이용하여 출력
    Stream<String> nameStream = Arrays.stream(arrName);

    // 방법2 - 중간처리 메소드 map()을 이용
    nameStream.map((name) -> {
      return name.length();
    }).forEach((cnt) -> {
      System.out.println(cnt + "글자");
    });

    // 방법1
    // nameStream.forEach(name->{
    // System.out.printf("%s는 %d글자\n", name, name.length());
    // });
  }
}
