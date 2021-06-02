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
        System.out.printf("Please enter a number between %d and %d.%n", min, max);
        int userNum = scanner.nextInt();
        scanner.nextLine();
        if (userNum < min || userNum > max){
            System.out.println("Oops, a bit off the mark");
            getInt(min, max);
        } else {
            System.out.printf("Thank you very much, your number %d is between the range%n", userNum);
        }
        return userNum;
    }

    public int getInt(){
        System.out.println("Please enter a number");
        int userNum = scanner.nextInt();
        scanner.nextLine();
        return userNum;
    }

    public double getDouble( double min, double max){
        System.out.printf("Please enter a number between %d and %d.%n", min, max);
        double userNum = scanner.nextDouble();
        if (userNum < min || userNum > max){
            System.out.println("Oops, a bit off the mark");
            getDouble(min, max);
        } else {
            System.out.printf("Thank you very much, your number %d is between the range", userNum);
        }
        return userNum;
    }

}





