package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a sentence");
        String userSentence = scanner.nextLine();
        System.out.println("Your sentence is: " + userSentence);
        return userSentence;
    }

    public boolean yesNo(){
        System.out.println("Enter yes or no");
        String userYesNo = scanner.nextLine();
        boolean result = false;
        if (userYesNo.equalsIgnoreCase("yes")) {
            result = true;
        } else if (userYesNo.equalsIgnoreCase("no")){
            result = false;
        }
        System.out.println("Your boolean is: " + result);
        return result;
    }

    public int getInt(int min, int max){
        System.out.println("Please enter two numbers, the first one is the minimum and the second is the maximum in a range");

    }


}


