package class_50;

class Car {
  // 멤버변수, 속성, Property
  int number, speed;// 값을 지정하지 않을 경우 0으로 초기화
  String color;// null 값으로 초기화

  // 게터
  public String getColor() {
    return this.color;
  }

  // 세터
  public void setColor(String color) {
    this.color = color;
  }

  // 멤버함수, 멤버메소드, 메소드, 함수
  void speedUp() {
    System.out.println("속도를 100만큼 올립니다.");
    speed += 100;
  }

  void speedDown() {
    System.out.println("속도를 50만큼 내립니다.");
    speed -= 50;
  }
}

public class Ex70_CarMain {

  public static void main(String[] args) {

    // 아래 두개의 객체변수는 서로 독립적으로 동작
    Car myCar = new Car();// 객체변수

    myCar.number = 3724;
    myCar.color = "black";
    myCar.speed = 10;

    System.out.println("1. 차번 = " + myCar.number);// 3724
    System.out.println("2. 색상 = " + myCar.color);// black
    System.out.println("3. 현재속도 = " + myCar.speed);// 10

    myCar.speedUp();// 함수호출, 메소드호출
    System.out.println("4. 현재속도 = " + myCar.speed);// 110

    System.out.println("-----------------------------------");

    Car yourCar = new Car();// 참조변수

    yourCar.number = 9329;
    yourCar.color = "Silver";
    yourCar.speed = 30;

    System.out.println("1. 차번 = " + yourCar.number);// 9329
    System.out.println("2. 색상 = " + yourCar.color);// Silver
    System.out.println("3. 현재속도 = " + yourCar.speed);// 30

    yourCar.speedUp();// 함수호출, 메소드호출
    System.out.println("4. 현재속도 = " + yourCar.speed);// 130

    yourCar.speedDown();
    System.out.println("4. 현재속도 = " + yourCar.speed);// 80

  }

}
