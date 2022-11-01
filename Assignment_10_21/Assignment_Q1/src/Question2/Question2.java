package Question2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// • Create an ArrayList of Integers
// • Fill the ArrayList with ten random numbers (1-50)
// • Copy each value from the ArrayList Into another ArrayList of the same capacity
// • Change the last value in the first (original) ArrayList to a -5
// • Display the contents of both ArrayLists
public class Question2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
      // Integer[] num = new Integer[]; //declaration
      Random rand = new Random();
      ArrayList<Integer> list = new ArrayList<Integer>();
      ArrayList<Integer> copy = list;
      
  
      for (int i = 0; i < 10; i++) {
        list.add(rand.nextInt(51));
      }
      System.out.println(list); //original
      System.out.println(copy); //copy

      //sizeで変更出来る
      //setは値の変更が出来る
      //list.getで値を取り出せる
      list.set(list.size() - 1,list.get(list.size() - 1) - 5);
      System.out.println(list);
      System.out.println(copy);
      

  
    }
  }
  