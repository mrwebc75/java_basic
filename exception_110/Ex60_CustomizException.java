package exception_110;

public class Ex60_CustomizException {

  public static void main(String[] args) {

    BasicOP op = new BasicOP();
    int result = 0;

    try {
      result = op.add(5000, -6000);
      System.out.println("add = " + result);

    } catch (MinusException e) {
      System.out.println("원인 : " + e.getMessage());
    }

    System.out.println("★★★★★ 프로그램 종료 ★★★★★");
  }
}
