package basic_API_90;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

//날짜에서 세부정보를 제공하는 Calendar 사용법

public class Ex40_Calendar {

  public static void main(String[] args) {

    Calendar cal = new GregorianCalendar();// 다른시간대의 날짜와 시간을 출력할 수 있다.
    // Calendar cal = Calendar.getInstance();// 현재시간 정보를 가진 객체 생성

    // 날짜와 시간을 아래와 같이 설정
    cal.set(2002, 3, 5, 10, 30, 25);// 월은 0~11 이기 때문에 1 작은수를 입력해야 함

    System.out.println("1." + cal);

    // 년월일 - .get(상수) 메소드를 사용하면 int 타입으로 리턴
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH);// 0~11
    int date = cal.get(Calendar.DAY_OF_MONTH);// 월마다 일수가 다르기 때문

    System.out.printf("2. %d년 %d월 %d일\n", year, month + 1, date);

    // 시분초
    int hour = cal.get(Calendar.HOUR_OF_DAY);// 24시간제
    int minute = cal.get(Calendar.MINUTE);
    int second = cal.get(Calendar.SECOND);

    System.out.printf("3. %d시 %d분 %d초\n", hour, minute, second);

    int day = cal.get(Calendar.DAY_OF_WEEK);// 1~7 (일~토)

    String[] dayName = { "", "일", "월", "화", "수", "목", "금", "토" };
    System.out.printf("4. 오늘은 %d요일\n", day);
    System.out.printf("4. 오늘은 %s요일\n", dayName[day]);

    // 국가별 월, 요일정보 -> .getDisplayName(보여줄항목,문자열길이타입,지역정보);
    // LONG, SHORT 선택에 따라 -> 1 또는 1월, 월 or 월요일 중 하나가 출력됨
    String krMonth = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.KOREA);// 1월
    String krDay = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.KOREA);// 월요일

    System.out.printf("5. 한국 : %s, %s", krMonth, krDay);

  }
}
