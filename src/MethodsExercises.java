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

    public static long getFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d%n", 1, 10);
        int input = scanner.nextInt();
        String newString = input + "! = ";
        long result = input;
        for (int i = 1; i < input; i++) {
            if (input > 1 || input < 10) {
                newString += i + " x ";
                result *= i;
            } else {
                System.out.println("Oops, missed the mark there");
                return getFactorial();
            }
        }
        newString += input + " = " + result;
        System.out.printf(newString + "\n");
        scanner.nextLine();
        System.out.println("Do you want to do it again? yes / no");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            getFactorial();
        }
        return result;
    }

//    public static int rollDice() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of sides you want on your pair of dice");
//        int sides = scanner.nextInt();
//        System.out.println("Enter \"Roll\" to roll dice");
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
        getFactorial();
    }
}
