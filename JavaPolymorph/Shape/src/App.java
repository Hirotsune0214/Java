import Shape.Circle;
import Shape.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        // Rectangle r1 = new Rectangle(20, 50);
         Circle c1 = new Circle(20);
        // double c1Circle = c1.getArea();
        // double r1Rectangle =  r1.getArea();
        // System.out.printf("Area of Rectangle R1 is : " + r1Rectangle);
        // System.out.printf("%8.2f", c1Circle);
        
        //円周の求め方 = (円周）= （直径）×（円周率）
        Circle c2 = new Circle(10);
        double c2Circle = c2.getAround();
        System.out.println("Around of Circle c2 is : " + c2Circle); //31.4

         //長方形の周りの長さの求め方は、(縦 * 横)* 2
        Rectangle r2 = new Rectangle(10, 10); //200
        double r2Rectangle = r2.getAround();
        System.out.println("Around of Rectangle r2 is : " + r2Rectangle);

    }
}
