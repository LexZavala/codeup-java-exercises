import java.util.Scanner;

public class MethodsExercises {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
//        return num1 * num2;
//        Without * operator

        int result = 0;
        while (num1 > 0) {
            result += num2;
            num1--;
        }
        return result;
    }

    public static int multiplyRecursion(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        } else if (x == 1) {
            return y;
        } else {
            return x + (multiplyRecursion(x, y - 1));
        }
    }

    public static int divide(int num1, int num2) {
        if (num1 == 0 && num2 == 0) {
            return 0;

        } else {
            return num1 / num2;
        }
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d%n", min, max);
        int input = scanner.nextInt();
        if (input < min || input > max) {
            System.out.println("oops, that is not within the range");
            return getInteger(min, max);
        } else {
            System.out.println("Thank you, your number was:");
            return input;
        }
    }

    public static int getFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d%n", 1, 10);
        int input = scanner.nextInt();
        long result = 1;
        for (int i = input; i >= 1; i--) {
            if (input < 1 || input > 10) {
                System.out.println("Please enter a number between 1 & 10");
                input = scanner.nextInt();
            } else {
                result *= i;
            }
        }
        System.out.printf("The factorial for your number %d is: %d%n", input, result);
        return (int) result;
    }



//    public static int factorial() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nEnter a number between 1 & 10.");
//        int userNum = sc.nextInt();
//        while(userNum < 1 || userNum > 10){
//            System.out.println("Please enter a number between 1 & 10");
//            userNum = sc.nextInt();
//        }
//        long fact = 1;
//        for (int i = 1; i <= userNum; i++) {
//            if (i == 1) {
//                System.out.println(i + "! " + " = " + i * fact);
//                fact = fact * i;
//
//            }else{
//                System.out.println(i + "! " + " = " + fact +" x "+ i +" = "+ i*fact);
//                fact = fact * i;
//            }
//        }
//        return (int) fact;
//    }





    public static void main(String[] args) {
        System.out.println(add(9, 10));
        System.out.println(subtract(20, 7));
        System.out.println(multiply(10, 10));
        System.out.println(divide(50, 5));
        System.out.println(divide(0, 0));
        System.out.println(modulus(2,4));
        System.out.println(multiplyRecursion(5, 5));
        System.out.println(getInteger(1,10));
        System.out.println(getFactorial());
    }
}
