import util.Input;

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
        Input input = new Input();
        boolean createList = input.yesNo("Would you like to create a grocery list?");
        if (createList){
            boolean addItem = input.yesNo("Would you like enter a new item?");
            if (addItem){
                System.out.println("this worked");
            }
        }


    }
}
