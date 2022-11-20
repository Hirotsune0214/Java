import Fruit.Fruits;

public class App {
  public static void main(String[] args) throws Exception {

    // Instance of the class fruits
    Fruits newInfo = new Fruits();

    System.out.println("Weight is now " + newInfo.weight);
      
    newInfo.addQuantity();

    System.out.println("After changing weight is " + newInfo.weight);

    
  }
}

