package operator_20;

//삼항연산자
public class Ex80_Operator {
  public static void main(String[] args) {

    // (조건식) ? 조건식이 참일때의 값 : 조건식이 거짓일때의 값;

    int a = 200;
    int b = 100;

    // 만약 a>b 이면 msg 변수에 "오늘은 금요일", 아니면 "내일도 수업합니다."를 저장
    String msg = (a > b) ? "오늘은 금요일" : "내일도 수업합니다.";

    System.out.println("msg = " + msg);

  }
}
