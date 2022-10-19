package Shape;

public class Cylinder extends Schape{
  //円柱の体積
  //( PI * r**2 * h )
  // パイ * 半径 * 半径 * 高さ
  private double radius;
  private double height;

  public Cylinder(double r,double h){
    this.radius = r;
    this.height = h;
  }

  @Override
  public void getVolume() {
    System.out.println("Volume of Cylinder is " + Math.PI * this.radius * this.radius * this.height);
  }
}
