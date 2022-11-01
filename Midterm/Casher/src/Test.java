import java.util.Scanner;

public class Test {
  public static void main(String[] args) {

    int price = 100;
    int payment = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("The total is " + price);
     System.out.println("How do you pay?");
     System.out.println("Choose the below");
     System.out.println(); 
      System.out.println("==============================");
      System.out.println("Type 1 : Credit");
      System.out.println("Type 2 : Debit");
      System.out.println("Type 3 : Cash");
      System.out.println("==============================");
     while (payment == 0) {
      System.out.println("Please select a number");
      payment = sc.nextInt();
      if (payment == 1) {
        System.out.println("Processing.......");
        System.out.println();
        break;
      } else if (payment == 2) {
        System.out.println("Processing.......");
        break;
      } else if (payment == 3) {
        System.out.println("Processing.......");
        break;
      } else {
        System.out.println("Sorry, You typed wrong\r\ntry again");
      }
     }
     System.out.println("Accepted\r\nThank you for shopping" );
     
  }
}