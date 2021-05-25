import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        EXERCISE A
        int i = 5;
        while ( i <= 15) {
            System.out.println("The current value of i is " + i);
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


        }
    }

