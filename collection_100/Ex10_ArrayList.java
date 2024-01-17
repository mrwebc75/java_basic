package collection_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

//ArrayList는 데이터의 중복을 허용한다.
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
    arrList.add("또치");

    arrList.set(0, "hani");// 수정

    // 인덱스값 알아보기
    System.out.println("또치의 index = " + arrList.indexOf("또치"));// 맨처음 발견된 아이템의 index 1
    System.out.println("또치의 마지막 index = " + arrList.lastIndexOf("또치"));// 맨마지막 발견된 아이템의 index 4

    // 특정 데이터값의 포함여부
    if (arrList.contains("마이콜")) {
      System.out.println("arrList의 원소중 \"마이콜\"이 있습니다.");
    }

    // arrList.clear();// 초기화

    // 비어있는지 확인
    if (arrList.isEmpty()) {
      System.out.println("arrList는 비어 있습니다.");
    }

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
    // map()은 모든 아이템에 공통적인 작업을 하여 그 결과를 새로운 스트림으로 리턴
    nameStream.map((name) -> {
      return name.length();
    }).forEach((cnt) -> {
      System.out.println(cnt + "글자");
    });

    // 방법1
    // nameStream.forEach(name->{
    // System.out.printf("%s는 %d글자\n", name, name.length());
    // });

    System.out.println("----------이름 글자수가 3 이상이면 출력----------");
    // 문제) 이름 글자수가 3 이상이면 출력

    // 한번 사용한 스트림은 재사용 할 수 없다는 규칙
    Stream<String> letterStream = Arrays.stream(arrName);

    // 방법2
    // filter()는 모든 아이템에 공통조건을 적용하여 true인 아이템만을 모아 새로운 스트림으로 리턴
    letterStream.filter(letter -> {
      return letter.length() >= 3;
    }).forEach(name -> System.out.println(name));

    // 방법1
//    letterStream.forEach(name -> {
//      if (name.length() >= 3) {
//        System.out.println(name);
//      }
//    });

  }
}
