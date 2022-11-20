import java.util.List;
import java.util.Scanner;

import DTO.User;
import Services.UserServiceIm;
import service.UserService;


public class App {
    public static void main(String[] args) throws Exception {
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserServiceIm();

        String userChoice = "";

        do {
            System.out.println("=================================");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Get All Users");
            System.out.println("4. Delete User");
            System.out.println("5. Update User");
            System.out.println("6. Exit");
            System.out.println("=================================");

            userChoice = scanner.nextLine();

            int id;
            switch (userChoice) {
                case "1":
                    System.out.println("Enter Your Name");
                    String name = scanner.nextLine();
                    System.out.println("Enter your Stundent ID");
                    int StudentID = scanner.nextInt();
                    System.out.println("Enter Your email");
                    String email = scanner.nextLine();
                    System.out.println("Enter Your Student Roll Number");
                    int StudentRollNumber = scanner.nextInt();

                    User user = new User(name, StudentID, email, StudentRollNumber);
                    userService.insert(user);
                    break;

                //他ファイルでのコードを削除した可能性があるので余裕があれば確認する
                // case "2":
                //     System.out.println("Enter Your email");
                //     email = scanner.nextLine();
                //     System.out.println("Enter Your Student Roll Number");
                //     StundentRollNumber = scanner.nextInt();

                //     User user2 = userService.getByEmailAndStudentRollNumber(email, StundentRollNumber);

                //     if (user2 != null) {
                //         System.out.println("Welcome " + user2.getName());
                //     } else {
                //         System.out.println("Invalid email or Student Roll Number");
                //     }
                //     break;

                case "3":
                    System.out.println("=================================");
                    displayUsers(userService.getAll());

                case "4":
                    System.out.println("=================================");
                    displayUsers(userService.getAll());
                    System.out.println("=================================");
                    System.out.println("Enter user ID : ");
                    // Scanner retursn a string so we have to convert it to an integer in order to
                    // query DB
                    id = Integer.parseInt(scanner.nextLine());
                    userService.delete(id);
                    break;

                case "5":
                    System.out.println("==================================");
                    displayUsers(userService.getAll());
                    System.out.println("==================================");

                    System.out.println("Enter user ID : ");
                    id = Integer.parseInt(scanner.nextLine());
                    User user4 = userService.getUserById(id);

                    if (user4 != null) {
                        System.out.println("Enter new user name");
                        String newName = scanner.nextLine();
                        System.out.println("Enter new Stundent ID");
                        int newStudentID = scanner.nextInt();
                        System.out.println("Enter new  email");
                        String newEmail = scanner.nextLine();
                        System.out.println("Enter Student Roll Number");
                        int newStundentRollNumber = scanner.nextInt();

                        user4.setName(newName);
                        user4.setStudentID(newStudentID);
                        user4.setEmail(newEmail);
                        user4.setStudentRollNumber(newStundentRollNumber);

                        userService.update(user4);
                    } else {
                        System.out.println("User not found!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (!userChoice.equals("7"));
        scanner.close();
    }

    public static void displayUsers(List<User> users) {
        System.out.println("ID\tNAME\tStudentID\tStudentRollNumber\tEMAIL");
        for (User user : users) {
            System.out.println(user);

        }
    }
}
