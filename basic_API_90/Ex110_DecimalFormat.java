package basic_API_90;

import java.text.DecimalFormat;

/*
  숫자를 원하는 형식의 문자열로 변환
  
    포매팅 문자규칙
    
    1. "#, 0" 을 이용하여 자리수를 표현
    2. #은 데이터의 길이가 짧을 경우 자리수 보존이 안됨
    3. 0은 데이터의 길이가 짧을 경우 자리수 보존이 잘됨   

*/
public class Ex110_DecimalFormat {
  public static void main(String[] args) {

    DecimalFormat df = new DecimalFormat("####.##");

    double num = 135.5678;

    // 예시1 - #
    String strNum = df.format(num);// 135.57 - 표현해야 할 자리수가 모자를 경우 자동 반올림 처리
    System.out.println("strNum = " + strNum);// 135.57

    // 예시2 - 0
    df = new DecimalFormat("0000.0000000");
    strNum = df.format(num);
    System.out.println("strNum = " + strNum);// 0135.5678000 - 자리수가 남을경우 0으로 채워서 출력
  }
}
