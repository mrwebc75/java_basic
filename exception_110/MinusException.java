package exception_110;

//사용자정의 예외처리클래스 작성
public class MinusException extends RuntimeException {

  @Override
  public String getMessage() {
    return "입력값의 합이 음수가 되는 오류가 발생했습니다.";
  }

}
