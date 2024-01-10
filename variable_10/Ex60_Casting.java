package variable_10;

//명시적 형변환 
public class Ex60_Casting {

  public static void main(String[] args) {

    /*
     * 큰 범위의 데이터를 작은 범위의 데이터에 할당하려면 명시적으로 형변환이 필요하다.
     */

    long l = 100L;
    int i = (int) l;
    short s = (short) i;

  }// end of main
}
