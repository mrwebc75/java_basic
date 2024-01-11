package extends_60;

//다형성을 설명하는 예제
interface Fight {
  void attact();// public abstract

  void shield();
}

interface Move {
  void walk();

  void run();

  void jump();
}

interface Item {
  void weapon();
}

class Hero implements Fight, Move, Item {
  private String name;

  public Hero(String name) {
    this.name = name;
  }

  @Override
  public void weapon() {
    System.out.println(this.name + " >> 무기추가");
  }

  @Override
  public void walk() {
    System.out.println(this.name + " >> 걷고");
  }

  @Override
  public void run() {
    System.out.println(this.name + " >> 뛰고");
  }

  @Override
  public void jump() {
    System.out.println(this.name + " >> 점프");
  }

  @Override
  public void attact() {
    System.out.println(this.name + " >> 공격");
  }

  @Override
  public void shield() {
    System.out.println(this.name + " >> 방어");
  }

}

class Villain implements Fight, Move {
  private String name;

  public Villain(String name) {
    this.name = name;
  }

  @Override
  public void walk() {
    System.out.println(this.name + " >> 걷다");

  }

  @Override
  public void run() {
    System.out.println(this.name + " >> 뛰다");
  }

  @Override
  public void jump() {
    System.out.println(this.name + " >> 점프하다");
  }

  @Override
  public void attact() {
    System.out.println(this.name + " >> 공격(Hoi)하다");
  }

  @Override
  public void shield() {
    System.out.println(this.name + " >> 방어하다");
  }

}

public class Ex60_Marble {

  public static void main(String[] args) {

    Hero thor = new Hero("토르");
    thor.walk();
    thor.run();
    thor.attact();
    thor.shield();

    System.out.println("-------------");

    Villain duly = new Villain("둘리");
    duly.walk();
    duly.run();
    duly.attact();
    duly.shield();

    System.out.println("-------------");

    thor.jump();
    thor.weapon();
  }

}
