package extends_60.components;

public class Navy extends Unit {

  public Navy(String name) {
    super(name);
  }

  @Override
  public void attack() {
    System.out.println(this.getName() + " >> 어뢰발사~!");
  }

  public void nucleus() {
    System.out.println(this.getName() + " >> 핵어뢰~!");
  }

}
