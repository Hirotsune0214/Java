import Animal.Class_Animal;
import Class_Birds.Class_Birds;
import Class_Birds.Class_Eagle;
import Class_Reptile.Class_Crocodile;
import Class_Reptile.Class_Reptile;
import Class_Fish.Class_Fish;
import Class_Fish.Class_Eel;

public class App {
    public static void main(String[] args) throws Exception {
        
    Class_Animal fish = new Class_Animal();

    System.out.println("Fish height before : " + fish.getHeight());

    fish.setHeight(10);

    System.out.println("Fish height after : " + fish.getHeight());
    }
}
