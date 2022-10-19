package Shape;

public class Sphere extends Schape {
  // 体積(volume)の求め方V=4/3π*r³ 球の体積をV、
  // 球の半径をr、円周率をπとします。
  private double radius;

  public Sphere(double r) {
    this.radius = r;
  }

  @Override
  public void getVolume() {
    System.out.println(4 / 3 * Math.PI * radius * 3);
  }
}