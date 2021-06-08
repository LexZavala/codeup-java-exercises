import grades.Student;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryApp extends Input {

    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        HashMap<String, Grocery> groceries = new HashMap<>();
        ArrayList<String> categories =  new ArrayList<>();

        categories.add("Meats");
        categories.add("Dairy");
        categories.add("Vegetables");
        categories.add("Fruits");
//        System.out.println(categories);


//        Grocery item1 = new Grocery("");
//        Grocery item2 = new Grocery("Oranges");
//        Grocery item3 = new Grocery("Bacon");
//        Grocery item4 = new Grocery("Eggs");
//        Grocery item5 = new Grocery("Lettuce");
//        Grocery item6 = new Grocery("Steak");
//        Grocery item7 = new Grocery("Apples");

//        groceries.put("Meats", item1);







        Input input = new Input();
        boolean createList = input.yesNo("Would you like to create a grocery list? (Y/N)");
        if (createList){
            boolean addItem = input.yesNo("Would you like enter a new item? (Y/N)");
            if (addItem){
                System.out.println("These are the categories available:");
                for (String category : categories){
                    System.out.print("|" + category + "| ");
                }
                System.out.println("\n");
                input.getStringAlt("Type the name of the category for your item");
//                System.out.println("Type the name of the category for your item");
            }
        }


    }
}
