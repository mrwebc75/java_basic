package class_50_test;

/**
 * 다음의 프로그램이 동작할 수 있도록 Book 클래스를 작성하시오.
 *
 *
 * [실행결과 예시] -------------------------------------------
 * 
 * 제목: 하이~자바 가격: 25000 저자: 홍길동 출판사: 이젠 출간일: 2023-12-22
 * 
 * 힌트 1. 필요한 멤버변수를 파악 2. Constructor가 필요한지 파악 3. getter, setter 설정
 */
class Book {

  private String title;
  private int price;
  private String author;
  private String publisher;
  private String pubDate;

  public Book(String title, int price, String author, String publisher, String pubDate) {
    this.title = title;
    this.price = price;
    this.author = author;
    this.publisher = publisher;
    this.pubDate = pubDate;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getPubDate() {
    return pubDate;
  }

  public void setPubDate(String pubDate) {
    this.pubDate = pubDate;
  }

}

public class Quiz_Book_10 {

  public static void main(String[] args) {

    // 생성자 파라미터 --> 제목, 가격, 저자, 출판사, 출간일
    Book book = new Book("하이~자바", 25000, "홍길동", "이젠", "2023-12-22");

    /*
     * // 제목 설정하기 book.setTitle("웹표준정석"); // 가격 설정하기 book.setPrice(20000); // 저자
     * 설정하기 book.setAuthor("이순신"); // 출판사 설정하기 book.setPublisher("두드림"); // 출간일 설정하기
     * book.setPubDate("2024-01-09");
     */

    System.out.println("제목: " + book.getTitle());
    System.out.println("가격: " + book.getPrice());
    System.out.println("저자: " + book.getAuthor());
    System.out.println("출판사: " + book.getPublisher());
    System.out.println("출간일: " + book.getPubDate());
  }
}
