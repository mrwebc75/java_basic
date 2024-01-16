package collection_100;

import java.util.ArrayList;

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
    
    //요소별로 아이템 가져오기
    System.out.println(arrList.get(0));
    System.out.println(arrList.get(1));
    System.out.println(arrList.get(2));
    System.out.println(arrList.get(3));
  }
}










