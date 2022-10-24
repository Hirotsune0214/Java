import java.util.InputMismatchException;
import java.util.Scanner;


//外と中でvalueを入れて、外の値が中で合っているかを確認する
//while内でtrueかの確認をしてbreakもいれる
public class App {
    public static void main(String[] args) {
      
     

       

        String s1 = "Yes";
        String s2 = "No";
        String s3 = "yes";
        String s4 = "no";
        String userSelect = s1;

         //infinite loop because of true. Label
   
        System.out.println("==============================");
        System.out.println("Type 1 : For Adding");
        System.out.println("Type 2 : For Subtraction");
        System.out.println("Type 3 : For Division");
        System.out.println("==============================");

        Scanner sc = new Scanner(System.in);

        int userChoice = 0;
        int number1 = 1;
        int number2 = 1;
            
        try {
  
            
            // System.out.println("Please enter First Number : ");
            // int num1Input = sc.nextInt();
    
            // boolean b = true;
           
            //int userSelect = 0;

            //int number3 = 0;
           
            
            while (s1.equals(userSelect) || s3.equals(userSelect)) {

                int output = 0;
                System.out.println("PLease enter a choice : ");
                userChoice = sc.nextInt(); // Waiting for a user to enter the input

                System.out.println("Please enter First number : ");
                number1 = sc.nextInt();

                System.out.println("Please enter Second number : ");
                number2 = sc.nextInt();

                if (userChoice == 1) {
                    output = number1 + number2;
                }

                if (userChoice == 2) {
                    output = number1 - number2;
                }

                if (userChoice == 3) {
                    output = number1 / number2;
                }
                System.out.println("Your final output is : " + output);
                System.out.println("The operation is completed");
                Scanner myObj = new Scanner(System.in);
                System.out.println("Do you want to use calculator again ?\r\nPlease type Yes or No");
                
                userSelect = myObj.nextLine();
                //userSelect = sc.nextInt();
                //while (true) { 
                if (s1.equals(userSelect) || s3.equals(userSelect)) {
                  output++;
                } else if(s2.equals(userSelect) || s4.equals(userSelect) ){ //Worked
                    break;
                } else{
                    System.out.println("You typed wrong"); //Worked
                    break;
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Please enter a number which is valid meaning integer");
        // } catch (IllegalStateException e) {
        //     System.out.println("Sorry, scanner is closed now");
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide a number by 0");
        } catch (Exception e) {
            System.out.println("Something Went Wrong Sorry");
        } finally {
            // System.out.println("Your final output is : " + output);
            // System.out.println("The operation is completed");
            System.out.println("Thankyou for using the calculator, BYE BYE!");

            sc.close();
        }
    }
}

// while (true) { // loops forever until break
// try { // checks code for exceptions
// System.out.println("How many racers should" + " participate in the race?");
// amountRacers = in.nextInt();
// break; // if no exceptions breaks out of loop
// }
// catch (InputMismatchException e) { // if an exception appears prints message
// below
// System.err.println("Please enter a number! " + e.getMessage());
// continue; // continues to loop if exception is found
// }
// }

// ASSIGNMENT -
// You have to use the above code which I wrote, or if you want to modify its up
// to you
// And you have ask the user everytime the operation is completed
// Do you want to use calculator again ?
// If user says "YES" --> Repeat same process again
// IF user says "NO" --> Thankyou for choosing the calculator, BYE BYE!

// HINT FOR THIS IS you have to use a while loop and break the loop when the
// user says NO
// while (true)

// while (true) {
// if (a == 0) {
// break;
// }

// console.log("Value of a : " + a);
// a--;
// }
