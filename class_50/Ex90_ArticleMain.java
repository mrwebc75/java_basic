package class_50;

//생성자함수에 값을 전달하여 멤버변수 초기화하는 문제
class Article {
  private int no;
  private String title;
  private String writer;

  // 세개의 멤버변수에 값을 할당하는 Constructor를 작성하시오.
  public Article(int no, String title, String writer) {
    this.no = no;
    this.title = title;
    this.writer = writer;
  }

  // 멤버변수에 할당된 값을 출력하는 print 멤버함수를 작성하고 호출하시오.
  public void print() {
    System.out.println("번호 = " + this.no);
    System.out.println("제목 = " + this.title);
    System.out.println("작성자 = " + this.writer);
  }

}

public class Ex90_ArticleMain {

  public static void main(String[] args) {

    Article article_1 = new Article(1, "JAVA-객체지향언어", "홍길동");
    article_1.print();

    // private 처리한 변수는 "객체변수명.프로퍼티" 형식으로 접근할 수 없다.
    // article_1.title;

  }// main
}
