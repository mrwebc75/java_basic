package loop_40;

public class Ex60_DoWhile {

  public static void main(String[] args) {

    int num = 100;

    // do~while문
    // 조건식을 만족하지 않더라도 무조건 1번은 실행됨
    do {
      System.out.println("do~while문 실행됨");
    } while (num > 100);

    // while문
    while (num > 100) {
      System.out.println("while문 실행됨");
    }

  }
}
