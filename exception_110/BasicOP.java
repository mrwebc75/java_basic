package exception_110;

public class BasicOP {

  // 결과값이 음수가 되면 안되는 상황으로 가정
  public int add(int x, int y) throws MinusException {
    int result = x + y;

    if (result < 0) {
      throw new MinusException();
    }

    return result;
  }

  public int sub(int x, int y) {
    int result = x - y;
    return result;
  }

  public int multi(int x, int y) {
    int result = x * y;
    return result;
  }

  public int div(int x, int y) {
    int result = x / y;
    return result;
  }

}
