package class_50;

//Constructor, this
class Book {

  // public - 객체변수가 .(점)찍고 접근 가능하게 허용하겠다.
  public String subject;
  public String content;

  // Constructor - 객체변수가 생성될때, 자동으로 호출되는 숨겨진 함수
  // public Book() {} - 자동으로 만들어지는 빈 Constructor

  // Constructor는 개발자가 직접 작성할 수도 있다.
  // Constructor는 클래스명과 같은 이름이며, 리턴값이 없다.
  public Book() {
    System.out.println("------Constructor 실행--------");
    subject = "This is JAVA~!";
    this.content = "자바 클래스 사용법";
  }

  // 멤버함수 선언/정의
  public void read() {

    String subject = "과학";

    System.out.println("------read() 메소드 실행--------");
    System.out.println(this.subject);
    System.out.println(this.content);// this는 객체변수 book을 가리킨다.
  }
}

public class Ex60_BookMain {

  public static void main(String[] args) {

    // 객체변수 book 생성시 Constructor Book()을 호출한다.
    Book book = new Book();

    book.read();// 메소드 호출

    // System.out.println(book.subject);
    // System.out.println(book.content);

  }// end of main
}
