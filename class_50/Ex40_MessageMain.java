package class_50;

//멤버변수와 멤버함수를 동시에 갖는 클래스
class Message {
  String memo;

  // 출력하는 멤버함수 sayMemo, 리턴값X
  void sayMemo() {
    System.out.println(memo);
    System.out.println(this.memo);
  }

  // memo 변수에 새로운 값을 할당하는 멤버함수 setEng, 리턴값X
  void setEng(String memo) {
    this.memo = memo;
  }

  // memo 변수에 새로운 값을 할당하는 멤버함수 setKor, 리턴값X
  void setKor(String memo) {
    this.memo = memo;
  }

}

public class Ex40_MessageMain {

  public static void main(String[] args) {

    Message msg = new Message();

    msg.memo = "즐거운 자바";
    msg.sayMemo();

    msg.setEng("Hello~!");
    msg.sayMemo();

    msg.setKor("안녕하세요~!");
    msg.sayMemo();
  }
}
