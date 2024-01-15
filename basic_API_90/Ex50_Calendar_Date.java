package basic_API_90;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
   Calendar 클래스에서 꼭 알아둬야 할 메소드
   
     1) .getTime()  ->  Date 객체를 리턴
     
     2) .setTime()  ->  Date 객체를 이용해서 특정시점의 Calender 날짜정보로 설정
*/
public class Ex50_Calendar_Date {

  public static void main(String[] args) {

    // 1. Calender를 이용한 Date 날짜객체 생성
    Calendar cal = new GregorianCalendar();
    Date date = cal.getTime();

    // 2. Date 객체를 이용해서 특정시점의 Calender 날짜정보로 설정
    Date oneDay = new Date(1324565551235L);// Thu Dec 22 23:52:31 KST 2011
    System.out.println("oneDay = " + oneDay);

    Calendar oneDayCal = new GregorianCalendar();
    oneDayCal.setTime(oneDay);

    System.out.println("oneDayCal = " + oneDayCal);
  }
}
