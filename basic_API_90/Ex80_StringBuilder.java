package basic_API_90;

public class Ex80_StringBuilder {

  public static void main(String[] args) {

    // 실험1 - String
    String result = "";

    long startTime = System.nanoTime();// 시작시간

    for (int i = 0; i < 10000; i++) {
      // result += "duly,";
      result = result.concat("duly,");
    }

    long endTime = System.nanoTime();// 끝나는시간

    long duration = endTime - startTime;// 작업시간 = 끝나는시간 - 시작시간

    System.out.println("1. String 연결작업 소요시간 = " + duration);
    System.out.println(result);

    // 실험2 - StringBuilder
    // 동기화를 고려하지 않기 때문에 StringBuffer보다 조금 더 빠르다.
    StringBuilder sb = new StringBuilder();

    startTime = System.nanoTime();

    for (int i = 0; i < 10000; i++) {
      sb.append("duly,");
    }

    endTime = System.nanoTime();
    duration = endTime - startTime;

    result = sb.toString();

    System.out.println("2. StringBuilder 연결작업 소요시간 = " + duration);
    System.out.println(result);
  }
}
