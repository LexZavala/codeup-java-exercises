import grades.Student;
import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GroceryApp extends Input {

    Scanner scanner = new Scanner(System.in);
    public String getString(String command){
        System.out.println(command);
        String userSentence = scanner.nextLine();
        System.out.println("Your sentence is: " + userSentence);
        return userSentence;
    }

    public static void main(String[] args) {
        HashMap<String, Grocery> groceries = new HashMap<>();



        Input input = new Input();
        boolean createList = input.yesNo("Would you like to create a grocery list? (Y/N)");
        if (createList){
            boolean addItem = input.yesNo("Would you like enter a new item? (Y/N)");
            if (addItem){
                System.out.println("this worked");
            }
        }


    }
}
