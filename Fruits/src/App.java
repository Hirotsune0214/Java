public class App {
  public static void main(String[] args) throws Exception {

    // Instance of the class fruits
    Fruits newInfo = new Fruits();

    System.out.println("Weight is now " + newInfo.weight); //0
    System.out.println("Price is now " + newInfo.price); //0
    System.out.println("Quantity is now " + newInfo.quantity); //1
      
    newInfo.addQuantity();

    System.out.println("After changing weight is " + newInfo.weight); //5
    System.out.println("After changing price is " + newInfo.price); //4
    System.out.println("After chaning qunatity is " + newInfo.quantity); //2

    
    // System.out.println("Weight is now " + newInfo.weight); //0
    // System.out.println("Price is now " + newInfo.price); //0
    // System.out.println("Quantity is now " + newInfo.quantity); //2

      
    newInfo.removeQuantity();

    System.out.println("After remove weight is " + newInfo.weight); //4
    System.out.println("After remove price is " + newInfo.price); //3
    System.out.println("After remove qunatity is now " + newInfo.quantity); //1
  }
}

