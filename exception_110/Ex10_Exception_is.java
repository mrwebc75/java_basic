package exception_110;

/*
   Exception 이란? 실행할 때 발생하는 예기치 않은 사건
   
   오류의 종류
   
     1. 문법(Compile) 오류 - 해결난이도 가장 낮다.
     
     2. 논리오류 - 해결난이도 가장 높음
     
     3. 실행(Runtime) 오류 - 실행조건에 따라 발생할 수 있는 오작동 -> 예외오류
         예) HDD고장, 메모리고장, 메모리부족, 인터넷끊김, 정전시 오작동
         
         논리적으로는 문제가 없는 코드이기는 하지만 ....
         
         
         해결방법           
           만약 내가 작성하는 코드가 오류가 발생할 여지가 있는 코드라면
           try~catch~finally 구문을 작성한다. 
*/

public class Ex10_Exception_is {

  public static void main(String[] args) {

    // 실험-1
    String year = "1980";
    int myAge = 2024 - Integer.parseInt(year);// 숫자변환 정상작동
    System.out.println("myAge = " + myAge);

    // 실험-2
    String count = "이십";

    // 숫자로 변환할 수 없으면 NumberFormatException 예외오류가 발생한다.
    // 만약 예외오류가 발생하면 그 아래의 코드는 실행되지 않고 프로그램이 멈춘다.
    int totCount = 100 + Integer.parseInt(count);

    System.out.println("totCount = " + totCount);

    System.out.println("-----프로그램을 종료합니다.-----");
  }
}
