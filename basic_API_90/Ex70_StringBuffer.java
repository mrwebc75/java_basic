package basic_API_90;

public class Ex70_StringBuffer {

  public static void main(String[] args) {
    String str1 = "Hello, ";// 100번지
    String str2 = "World~!";// 200번지

    // String result = str1 + str2;
    str1 = str1.concat(str2);// 300번지
    System.out.println(str1);

    /*
     * .concat() 메소드는 문자열을 연결하는 가장 간단한 방법이다. 그러나 문자열을 대량으로 연결할 때는 더 효율적인 방법으로
     * StringBuilder나 StringBuffer 클래스를 사용하는 것이 좋을 수도 있다.
     * 
     * 이 클래스들은 문자열 연결 작업에 효율적이며, 반복적으로 대량의 문자열을 수정해야 하는 경우 유용하다.
     */

    str1 = "아기공룡";// 400번지
    str2 = "둘리~!";// 500번지

    StringBuffer sb = new StringBuffer();// 600번지
    sb.append(str1);
    sb.append(str2);

    String result = sb.toString();
    System.out.println(result);

  }
}
