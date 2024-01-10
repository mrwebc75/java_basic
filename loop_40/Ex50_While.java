package loop_40;

public class Ex50_While {

  public static void main(String[] args) {

    /* for문으로 1~100 합
    int sum = 0;

    for (int i = 1; i <= 100; i++) {
      sum += i;
    } // end of for
    
    
    while 반복문
    
    int i = 1;//반복문에서 사용할 변수
    
    while(조건식){
      명령문, 실행문;
      변수를 증감
    }
    
    */
    int sum = 0;
    
    int i = 1;
    
    while(i <= 100) {
      sum += i;
      i++;
    }
    
    

    System.out.println("sum = " + sum);

  }
}
