package class_50;

//this에 대한 이해를 넓히는 예제
class SoloThis {
  private int i = 0;

  public SoloThis getThis() {
    // this 자체를 리턴, this의 타입은 당연히 SoloThis
    return this;// class_50.SoloThis@4d591d15
  }

  public void print() {
    i++;
    System.out.println("i = " + i);
  }
}

public class Ex120_SoloThisMain {

  public static void main(String[] args) {

    SoloThis st1 = new SoloThis();// 객체생성

    System.out.println("SoloThis st1 = " + st1);// class_50.SoloThis@4d591d15
    st1.print();
    st1.print();

    // SoloThis st2 = new SoloThis();// st1과 다른 주소값을 가진 객체생성
    SoloThis st2 = st1.getThis();// 같은 주소값을 가진 객체

    System.out.println("SoloThis st2 = " + st2);// class_50.SoloThis@4d591d15
    st2.print();
    st2.print();
  }
}
