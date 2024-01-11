package extends_60.components;

public class AirForce extends Unit {

  public AirForce(String name) {
    super(name);//부모의 생성자를 호출
  }

  @Override
  public void attack() {
    System.out.println(this.getName() + " >> 이륙");
    System.out.println(this.getName() + " >> 공중공격 실행함");
  }

  public void bombing() {
    System.out.println(this.getName() + " >> 폭격");
  }

}
