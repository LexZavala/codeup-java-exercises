import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        EXERCISE A
        int i = 5;
        while ( i <= 15) {
            if (i == 15){
                System.out.print(i + " ");
            } else {
                System.out.printf(i + " ");
            }
            i++;
        }

//        EXERCISE B
//        int x = 100;
//        do { System.out.println(x); x -= 5;}
//        while (x >= -10);
//
//        long y = 2;
//        do {
//            System.out.println(y);
//            y *= y;
//
//        } while (y < 1000000);

//        EXERCISE C
        for (int x = 100; x >= -10; i--){
            System.out.println(x);
            x -= 5;
        }

        for (long y = 2; y < 1000000; i++){

            System.out.println(y);
            y *= y;
        }

//      #2
        Scanner pinCollector = new Scanner(System.in);
        int correctPin = 12345;

        for (int z = 1; z <= 3; z++){
                System.out.println("Please enter the pin");
                int attempt =  pinCollector.nextInt();

                if (attempt == correctPin) {
                    System.out.println("Correct, welcome back.");
                    z = 3;
                } else if (z == 3){
                    System.out.println("Sorry you are locked out.");
                } else {
                        System.out.println("Incorrect, try again. This is attempt number " + (z));
                }
            }

//      #3
        System.out.println("What number would you like to go up to?");
        int number = pinCollector.nextInt();
        boolean userWantsToContinue = false;
        System.out.println( "Here is your table!");
        System.out.println("");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (int p = 1; p <= number; p++){
            int squared = p * p;
            int cubed = p * p * p;
            System.out.printf("%-6d | %-7d | %-4d%n", p, squared, cubed);
            }
        System.out.println("Would you like to continue? Y/N");
        while(pinCollector.next().toLowerCase().equals("yes"));

//      #4
        System.out.println("Enter a grade from 0 to 100");
        byte gradeInput = pinCollector.nextByte();
        if (gradeInput <= 100 && gradeInput >= 88){
            System.out.println("Your grade is A");
        } else if (gradeInput <= 87 && gradeInput >= 80) {
            System.out.println("Your grade is B");
        } else if (gradeInput <= 79 && gradeInput >= 67){
            System.out.println("Your grade is C");
        } else if (gradeInput <= 66 && gradeInput >= 60){
            System.out.println("Your grade is D");
        } else if (gradeInput <= 50 && gradeInput >= 0){
            System.out.println("Your grade is F, get gud");
        }
        System.out.println("Would you like to continue? Y/N");
        do {
            userWantsToContinue = true;
        } while(pinCollector.next().toLowerCase().equals("y"));


        }
    }

