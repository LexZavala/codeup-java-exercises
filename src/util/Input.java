package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }


    public String getString(String command){
        System.out.println(command);
        String userSentence = scanner.nextLine();
        return userSentence;
    }

    public String getStringAlt(String command){
        System.out.println(command);
        String userSentence = scanner.nextLine();
        return userSentence;
    }

    public boolean yesNo(String question){
        System.out.println(question);
        String userYesNo = scanner.nextLine();
        return  (userYesNo.trim().equalsIgnoreCase("yes") || userYesNo.trim().equalsIgnoreCase("y"));
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
        System.out.println("Your interger was " + userNum);
        return userNum;
    }

    public int getIntAlt(String question){
        System.out.println(question);
        int userNum = scanner.nextInt();
        scanner.nextLine();
        return userNum;
    }

    public int getIntExc(){
        String userInput = getString("Enter an interger number please");
        try {
            int intUserInput = Integer.valueOf(userInput);
            System.out.println("Thank you very much, your number was " + intUserInput);
            return  intUserInput;
        } catch (NumberFormatException nfe) {
            System.out.println("That's not a number");
             return getIntExc();
        }
    }



    public double getDouble( double min, double max){
        System.out.printf("Please enter a number between %f and %f.%n", min, max);
        double userNum = scanner.nextDouble();
        if (userNum < min || userNum > max){
            System.out.println("Oops, a bit off the mark");
            getDouble(min, max);
        } else {
            System.out.printf("Thank you very much, your number %f is between the range\n", userNum);
        }
        return userNum;
    }

    public double getDouble(){
        System.out.println("Please enter a decimal number");
        double userNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your double is " + userNum);
        return userNum;
    }

    public double getDoubleExc(){
        String userInput = getString("Enter an decimal number please");
        try {
            double doubleUserInput = Double.valueOf(userInput);
            System.out.println("Thank you very much, your number was " + doubleUserInput);
            return doubleUserInput;
        } catch (NumberFormatException nfe) {
            System.out.println("That's not a decimal");
            return getDoubleExc();
        }
    }

}





