package OOPLecture;

import java.util.Scanner;

public class UserManager {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User testUser = new User();
        testUser.setPassword("12345");

        UserTools.logIn(testUser);
    }
}
