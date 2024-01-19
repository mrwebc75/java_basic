package basic_API_90;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex130_StringMethod {

  public static void main(String[] args) {

    String str1 = "자바 Programming";
    String str2 = new String("java");
    System.out.println("str1 = " + str1);
    System.out.println("str2 = " + str2);
    System.out.println("------------------------------");

    // 1. 문자열의 길이를 조회 -> js는 str.length
    int str1_len = str1.length();
    int str2_len = str2.length();
    System.out.println("str1_len = " + str1_len);
    System.out.println("str2_len = " + str2_len);
    System.out.println("------------------------------");

    // 2. 특정문자열이 처음으로 나타나는 위치를 조회
    int str1_pos = str1.indexOf(" ");// 2
    int str2_pos = str2.indexOf("a");// 1
    System.out.println("str1_pos = " + str1_pos);
    System.out.println("str2_pos = " + str2_pos);
    System.out.println("------------------------------");

    // 3. 특정문자열이 마지막으로 나타나는 위치를 조회
    int str1_lst_pos = str1.lastIndexOf("m"); // 10
    int str2_lst_pos = str2.lastIndexOf("a");// 3

    System.out.println("str1_lst_pos = " + str1_lst_pos);
    System.out.println("str2_lst_pos = " + str2_lst_pos);
    System.out.println("------------------------------");

    // 4. A를 B로 바꾸다(변경) - .replace(old, new) 함수는 원본데이터를 훼손하지 않음
    String new_str1 = str1.replace(" ", "-");
    String new_str2 = str2.replace("a", "A");

    System.out.println("str1 = " + str1);// 원본은 그대로 출력됨
    System.out.println("new_str1 = " + new_str1);
    System.out.println("new_str2 = " + new_str2);
    System.out.println("------------------------------");

    // 5. 문자열의 앞뒤 공백제거한 결과를 리턴(불변)
    String input = "     enjoy  java  programming    ";
    String output = input.trim();

    System.out.println("input = " + input);
    System.out.println("output = " + output);

    // 앞뒤뿐만 아니라 중간의 공백도 다 제거하고 싶다면...
    String output2 = input.replace(" ", "");
    System.out.println("output2 = " + output2);
    System.out.println("------------------------------");

    // 6. 대소문자 변경
    String upper = new_str2.toUpperCase();// 대문자로 ....
    String lower = new_str2.toLowerCase();// 소문자로 ....
    System.out.println("upper = " + upper);
    System.out.println("lower = " + lower);
    System.out.println("------------------------------");

    // 7. 문자열 비교하기 -> .equals() 내용을 비교해서 같으면 true, 다르면 false
    boolean isSame = str1.equals(str2);// false
    if (isSame) {
      System.out.println("같다~!");
    } else {
      System.out.println("다르다~!");
    }

    // 문자열이 특정값을 시작하는지, 끝나는지 확인 -> true/false
    if (str1.startsWith("자바")) {
      System.out.println("str1은 \"자바\"로 시작합니다.");
    }

    if (str1.endsWith("Programming")) {
      System.out.println("str1은 \"Programming\"으로 끝납니다.");
    }

    // str1.compareTo(str2) - 두 문자열을 비교해서 같으면 0을 리턴한다.
    if (str1.compareTo(str2) == 0) {
      System.out.println("str1과 str2는 같은 문자열입니다.");
    } else {
      System.out.println("str1과 str2는 다른 문자열입니다.");
    }

    // str2.compareToIgnoreCase(new_str2) - 대소문자를 무시하고 문자열을 비교해서 같으면 0을 리턴한다.
    if (str2.compareToIgnoreCase(new_str2) == 0) {
      System.out.println("str1과 str2의 대소문자를 무시하고 내용을 비교하면 0을 리턴합니다.");
    }

    System.out.println("------------------------------");

    // JS에서는 substring(), substr(), slice()
    // 8. 자바에서 문자열 자르기(떼어오기)는 .substring(시작idx, 끝idx)으로 한다.
    String sub_str1 = str1.substring(0, 2);
    String sub_str2 = str1.substring(3);// 인덱스3부터 끝까지 다

    System.out.println("sub_str1 = " + sub_str1);// 자바
    System.out.println("sub_str2 = " + sub_str2);// Programming
    System.out.println("------------------------------");

    // 9. 문자열을 특정 "구분자"를 기준으로 잘라내서 배열로 반환하는 .split()
    String subject = "웹표준/JavaScript/Git/Java/Database/JSP";
    String[] arrSubject = subject.split("/");

    Stream<String> subjectStream = Arrays.stream(arrSubject);
    subjectStream.forEach(s -> System.out.println(s));
    System.out.println("------------------------------");

    /*
       여러가지 문자열 포맷(출력서식)
        
       %d - 정수(digital) 
       %2d - 2자리로 맞춰서 출력, 자릿수가 남으면 공백으로 출력됨 
       %02d - 남는 자릿수를 0으로 채워서
       출력됨
        
        
       %s - 문자열(string) 
        
       %f - 실수형(float)
       %.1f - 소수점 1자까지 출력

     */

    int year = 2024;
    int month = 1;
    int date = 19;

    String name = "duly";
    float height = 150.5f;

    System.out.printf("%d년 %02d월 %02d일 %s의 키는 %.1f이다.", year, month, date, name, height);
    System.out.println("\n------------------------------");
    
    // 10. 출력할 데이터를 특정 형식에 맟춘 새로운 문자열을 리턴해주는 String.format()
    // sdf.format()과 매우 유사하다.(Ex60번 참고)
    String result = String.format("%d년 %02d월 %02d일 %s의 키는 %.1f이다.", year, month, date, name, height);
    System.out.println("result = " + result);
  }
}












