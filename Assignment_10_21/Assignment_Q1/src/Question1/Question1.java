package Question1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// • Create an ArrayList of Integers
// • Fill each of the 10 slots with a random value from 1-50.
// • Display those values on the screen, and then prompthe user for an integer.
// • Search through the ArrayList, and if the item is present, print a message that the number is in the list.
// • If the value is not in the ArrayList, print a message that the number is not in the list

public class Question1 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    // Integer[] num = new Integer[]; //declaration
    Random rand = new Random();
    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
      list.add(rand.nextInt(51));

    }
    System.out.println(list);
    Scanner sc = new Scanner(System.in);
    System.out.println("Type a number between 1 to 50");
    Integer userInteger = sc.nextInt();

    if (list.contains(userInteger)) {
      System.out.println("The number is in the array");
    } else {
      System.out.println("The number isn't the array");
    }

  }
}
