package extends_60;

import extends_60.components.AirForce;
import extends_60.components.Army;
import extends_60.components.Navy;

public class Ex50_MilitaryMain {

  public static void main(String[] args) {

    Army army = new Army("육군");
    // army.setName("육군");
    army.attack();// Overrding 메소드 호출
    army.tank();

    System.out.println("------------------------------");

    AirForce air = new AirForce("공군");
    air.attack();

    System.out.println("------------------------------");

    Navy navy = new Navy("해군");
    navy.attack();
    navy.nucleus();
  }
}
