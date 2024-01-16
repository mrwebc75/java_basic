package basic_API_90;

/*
 * Math 클래스는 수학과 관련된 여러가지 메소드를 가지고 있다.
 * 모든 메소드가 static 형태이기 때문에, 객체를 생성할 필요가 없다.
 */
public class Ex90_Math {

  // 특정범위의 정수를 리턴하는 메소드 -> randomNum
  public static int myRandom(int min, int max) {
    return (int) (Math.random() * (max - min + 1)) + min;
  }

  public static void main(String[] args) {

    System.out.println(myRandom(1, 10));// 1~10
    System.out.println(myRandom(11, 20));// 11~20

    // myRandom() 메소드를 활용하여 5자리 인증번호 생성하기(응용예제)
    String certiNum = "";

    for (int i = 0; i < 5; i++) {
      certiNum += myRandom(0, 9);
    }

    System.out.println("인증번호 = " + certiNum);

    // 주어진 두 수중 최대값 구하기
    int max = Math.max(100, 9999);
    System.out.println("max = " + max);

    // 주어진 두 수중 최소값 구하기
    int min = Math.min(100, 9999);
    System.out.println("min = " + min);

    // 절대값
    int abs = Math.abs(-234);
    System.out.println("abs = " + abs);

    // 반올림
    long roundNum = Math.round(3.14159);
    System.out.println("roundNum = " + roundNum);

    // 0에서 1사이의 값을 리턴하는 Math.random()
    System.out.println(Math.random());

    // 0~10 추출
    int result = (int) (Math.random() * 11);

    // 1~10 추출
    result = (int) (Math.random() * 10) + 1;

    System.out.println("result = " + result);
  }
}
