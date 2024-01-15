package basic_API_90;

import java.util.Date;
/*
  날짜를 처리하기 위한 Date 클래스
  
    1. Date 클래스가 필요한 이유
      1) 과거 프로젝트의 유지보수
      2) 다른 클래스를 사용할때 날짜정보를 Date 객체로 전달
      
    2. 꼭 알아둬야 할 메소드
      1) .getTime() -> Long 타입의 밀리세컨즈값 추출
      2) .setTime(Long 타입의 밀리세컨즈값) -> 특정 시점의 날짜정보로 설정

*/

public class Ex30_Date {

  public static void main(String[] args) {

    // js에서는 const now = new Date();

    // 1. 현시점의 날짜정보를 갖는 객체 생성
    Date now = new Date();

    System.out.println("1." + System.currentTimeMillis());
    System.out.println("2." + now.getTime());// Long 타입의 밀리세컨즈값

    // 2. 특정시점의 날짜정보를 갖는 객체 생성
    Date oneDay = new Date(1234567890123L);

    // 한국과 미국의 GMT 시차를 9시간으로 계산하여 아래와 같이 09시로 출력됨
    oneDay.setTime(0L);// Thu Jan 01 09:00:00 KST 1970

    System.out.println("3." + oneDay);

  }
}
