package OOPLecture;


import java.util.Scanner;

public class UserTools {
    public static Scanner scanner = new Scanner(System.in);

    public static void logIn (User u) {
        System.out.println("Please enter your password: ");

        String userPassword = scanner.nextLine();

        if (userPassword.equals(u.getPassword())){
            u.setLoggedIn(true);
            System.out.println("You have succesfully log in!");
        } else {
            System.out.println("That password is incorrect.");
        }
    }

    public static void logOut (User u) {
        System.out.println("Are you sure you want to log out? (Y/N) ");

        String userChoice = scanner.nextLine();

        if (userChoice.equalsIgnoreCase("y")){
            System.out.println("You have succesfully logged out!");
        } else {
            System.out.println("You are still logged in");
        }
    }

    public static void  changePassword(User u){
        if (!u.isLoggedIn()){
            System.out.println("Sorry you are currently logged out. Please log in");
            logIn(u);
        } else {
            System.out.println("Please enter your current password: ");
            String currentPassword = scanner.nextLine();
            if (u.getPassword().equals(currentPassword)){
                System.out.println("Please enter a new password:");
            } else {
                System.out.println("Sorry that password is incorrect");
                String newPassword = scanner.nextLine();
                u.setPassword(newPassword);
            }
        }
    }

    public static void startMenu (User u){
        System.out.println("Welcome, what would you liek to do?");
        System.out.println("1.  Log in.\n2. Exit the program. ");
        int userChoice = scanner.nextInt();

        if ( userChoice == 1){
            UserTools.logIn(u);
        } else {
            System.out.println("Thank you for your time. Bye!");
        }
    }


    public static void main(String[] args) {
//        User testUser1 = new User();
//        testUser1.username = "jayman";
//        testUser1.setPassword("password");
//        testUser1.email = "jayman@email.com";
//        System.out.println(testUser1.getPassword());
//
//        UserTools.logIn(testUser1);

        User user2 = new User("lex-username", "password", "email@gmail.com");
        startMenu(user2);


    }

}
