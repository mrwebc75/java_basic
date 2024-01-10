package variable_10;

//연산결과에 따른 형변환
public class Ex70_Casting {

  public static void main(String[] args) {

    double a = 10.5d;// 8바이트 실수, d 생략 가능
    float b = 20.5f;// 4바이트 실수

    /*
     * 큰 범위의 변수와 작은 범위의 변수가 연산을 수행하면, 작은 범위의 변수가 큰 범위의 데이터형으로 암묵적 형변환을 수행한다. 그러므로
     * 아래의 a+b는 double 형의 변수가 되므로 float 형의 값에 대입하는 것은 에러이다.
     */

    float result = (float) (a + b);

    System.out.println("result = " + result);

    // 게시판만들때 페이지네이션(페이징) 계산

    int page = 10;// 요청페이지번호
    int sizePerPage = 10;// 페이지당 게시물의 노출개수
    int displayPagiNum = 10;// 페이지네이션의 개수
    int totCount = 1165;// 게시물의 총개수 1161~1170 -> 117

    // 요청받은 페이지번호를 displayPagiNum로 나눈후 올림처리한다.
    // 나눈 결과에 displayPagiNum을 곱한다.
    int endPage = (int) (Math.ceil(page / (double) displayPagiNum) * displayPagiNum);// 페이지네이션 끝번호
    int startPage = endPage - displayPagiNum + 1;// 페이지네이션 시작번호

    // totCount/sizePerPage 계산후 Math.ceil()로 무조건올림처리한다.
    // 결과가 실수이므로 int로 다운캐스팅 처리
    int realEndPage = (int) (Math.ceil(totCount / (double) sizePerPage));

    // 페이지네이션 끝번호 재계산
    if (realEndPage < endPage) {
      endPage = realEndPage;
    }

    // 이전버튼 활성화 여부 prev, next
    boolean prev = (startPage > 1) ? true : false; // true/false
    boolean next = (endPage < realEndPage) ? true : false;// true/false

    System.out.println("startPage = " + startPage);
    System.out.println("endPage = " + endPage);
    System.out.println("realEndPage = " + realEndPage);
    System.out.println("prev 버튼 활성화 = " + prev);
    System.out.println("next 버튼 활성화 = " + next);
  }
}
