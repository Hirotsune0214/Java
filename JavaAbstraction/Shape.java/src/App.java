import Shape.Cylinder;
import Shape.Sphere;

public class App {
    public static void main(String[] args) throws Exception {
    
        Cylinder c = new Cylinder(10, 5);
        Sphere s = new Sphere(20);


        c.getVolume();
        s.getVolume();
    }
}
