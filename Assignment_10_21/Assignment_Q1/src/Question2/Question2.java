package Question2;

import java.util.Arrays;
import java.util.Random;

// • Create an ArrayList of Integers
// • Fill the ArrayList with ten random numbers (1-50)
// • Copy each value from the ArrayList Into another ArrayList of the same capacity
// • Change the last value in the first (original) ArrayList to a -5
// • Display the contents of both ArrayLists
public class Question2 {
  public static void main(String[] args) {
    Integer[] num = new Integer[11]; // declaration
    Integer[] replica = num.clone();
    // Integer[] copy = new Integer[10];
    Random rand = new Random();

    for (Integer i = 1; i <= 50; i++) {
      num[i] = rand.nextInt(50) + 1;
      System.out.println(num[i]);
      System.out.println(replica[i]);
    }
    

   

  }
}
