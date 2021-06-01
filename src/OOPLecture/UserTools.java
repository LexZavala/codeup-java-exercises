package OOPLecture;


import java.util.Scanner;

public class UserTools {
    public static Scanner scanner = new Scanner(System.in);

    public static void logIn (User u) {
        System.out.println("Please enter your password: ");

        String userPassword = scanner.nextLine();

        if (userPassword.equals(u.password)){
            System.out.println("You have succesfully log in!");
        } else {
            System.out.println("That password is incorrect.");
        }
    }
}
