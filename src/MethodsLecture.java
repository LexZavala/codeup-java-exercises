import java.util.Scanner;

public class MethodsLecture {

    public static void sayHello(String name) {
        System.out.printf("Hi there! My name is %s! Have a great day!\n", name);
    }

    public static int multiply (int num1, int num2){
        return num1 * num2;
    }

    public static void willYouTakeUsToMtSplashmore (Scanner sc){
        System.out.println("Will you take us to Mt. Splashsmore?");
        if (!sc.nextLine().equalsIgnoreCase("yes")){
            willYouTakeUsToMtSplashmore(sc);
        } else {
            System.out.println("Thanks Dad, you're the best!");
        }
    }

    public static void bottlesOfBlank (String beverage, int numBottles) {
        if (numBottles == 0) {
            System.out.printf("No more bottles of %s on the wall%n", beverage);
        } else if (numBottles == 1) {
            System.out.printf("1 bottle of %s on the wall%n", beverage);
        } else if (numBottles == 2) {
            System.out.printf("2 bottles of %s on the wall%n", beverage);
        }
    }


    public static void main(String[] args) {
        sayHello("Lex");
        System.out.println(multiply(5,2));
        int product = multiply(7, 3);
        System.out.printf("Did you know that %d x %d = %d?%n", product, product, product * product);
        Scanner myScan = new Scanner(System.in);
        willYouTakeUsToMtSplashmore(myScan);
        bottlesOfBlank("Dr.Pepper" , 3);

    }
}


