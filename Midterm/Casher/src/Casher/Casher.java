package Casher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Casher {

  /**
   * @param args
   * @throws InterruptedException
   */
  public static void main(String[] args) throws InterruptedException {
    String HolderName;
    int option = 0;
    String s1 = "Yes";
    String s2 = "No";
    String userSelect = s1;
    Scanner sc = new Scanner(System.in);

    System.out.println("==============================");
    System.out.println(" Welcome to Coffee beans shop");
    System.out.println("==============================");
    System.out.println();
    System.out.println("Are you a loyal member?");

    System.out.println();
    System.out.println("==============================");
    System.out.println("       1: Yes");
    System.out.println("       2: No");
    System.out.println("==============================");
    System.out.println();

    while (option == 0) {
      System.out.println("Please select a number");
      option = sc.nextInt();
      if (option == 1) {
        System.out.println("Please type your name");
        Scanner line = new Scanner(System.in);
        String name = sc.next();
        System.out.println();
        System.out.println("Welcome " + name);
        break;
      } else if (option == 2) {
        System.out.println("Welcome to the our shop");
        break;
      } else {
        System.out.println("Sorry, You typed wrong\r\ntry again");
      }
    }

    System.out.println();
    System.out.println("What would you buy");
    System.out.println("Now is our fall season sale");
    System.out.println("If you purchase over 45 dollars, You'll get 15% discount");
    System.out.println("Choose the below");

    System.out.println();
    System.out.println("=================================================");
    List<String> listBeans = new ArrayList<String>(Arrays.asList("1 : Fall Blend", "2 : Japan Blend", "3 : Verona"));
    List<String> listPrice = new ArrayList<String>(
        Arrays.asList("1 : 15 dollars", "2 : 20 dollars ", "3 : 25 dollars"));
    System.out.println(listBeans);
    System.out.println(listPrice);
    System.out.println("=================================================");

    int total = 0;
    int price1 = 15;
    int price2 = 20;
    int price3 = 25;
    int userOrder = 0;
    double discountPrice;
    int payment = 0;
    // 3回は値が入るようになったが、まだ買いますかの質問が表示されYesを押すと抜けるようになっているので修正が必必要
    for (int i = 0; i < 3; i++) {

      System.out.println("Please type 1 or 2 or 3");
      userOrder = sc.nextInt(); // 15ドルを与える

      if (userOrder == 1) {
        total += 15;
      } else if (userOrder == 2) {
        total += 20;
      } else if (userOrder == 3) {
        total += 25;
      } else {
      }
      System.out.println("Would you still buying??\r\nType Yes or No");
      Scanner myObj = new Scanner(System.in);
      userSelect = myObj.nextLine();
      if (s1.equals(userSelect)) {

      } else if (s2.equals(userSelect)) {
        System.out.println();
        break;
      } else {
        System.out.println("You typed wrong\r\nTry again");
        break;
      }
      
    }

    System.out.println();
    if (total >= 45) {
      discountPrice = total * 0.85;
      System.out.println("The final price is " + discountPrice + " dollars");
    } else if (total < 45) {
      System.out.println("The price is " + total + " dollars");
    }

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
        Thread.sleep(5000);
        break;
      } else if (payment == 2) {
        System.out.println("Processing.......");
        // 3秒間停止する
        Thread.sleep(5000);
        break;
      } else if (payment == 3) {
        System.out.println("Processing.......");
        break;
      } else {
        System.out.println("Sorry, You typed wrong\r\ntry again");
      }
    }
    System.out.println();
    System.out.println("Accepted\r\nThank you for shopping ");

    /* 
    レシートを作成するか検討する
    動画を再度確認して決める
    **************
    *
    *Thank you for shopping
    *
    *
    *
    *
    **************
    */

  } // main
} // class
