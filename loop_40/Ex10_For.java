package loop_40;

//for 반복문 : 1~100 까지의 합 -> 5050
public class Ex10_For {

  public static void main(String[] args) {

    /*
     * 1~10까지의 합
     * 
     * -> 1+2+3+4+5+6+7+8+9+10
     * 
     * -> 0+1 -> (0+1)+2 -> ((0+1)+2)+3 -> (((0+1)+2)+3)+4
     */

    int sum = 0;

    // i값이 1부터 100까지 증가하는 동안, i값을 sum에 누적시킨다.
    for (int i = 1; i <= 100; i++) {
      sum = sum + i;
    }

//    sum = sum + 1;// 0+1
//    sum = sum + 2;// 0+1+2
//    sum = sum + 3;// 0+1+2+3
//    sum = sum + 4;// 0+1+2+3+4
//    sum = sum + 5;// 0+1+2+3+4+5
//    sum = sum + 6;// 0+1+2+3+4+5+6
//    sum = sum + 7;// 0+1+2+3+4+5+6+7
//    sum = sum + 8;// 0+1+2+3+4+5+6+7+8
//    sum = sum + 9;// 0+1+2+3+4+5+6+7+8+9
//    sum = sum + 10;// 0+1+2+3+4+5+6+7+8+9+10

    System.out.println("sum = " + sum);// 5050

  }
}
