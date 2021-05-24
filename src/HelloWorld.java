import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.print("Hello");
//        System.out.print(", World\n");
//        System.out.println("I am in brackets!");
//        // This is a single line comment
//
//        /*
//        This is a multiline comment
//        test
//         */
//        byte smallNumber = 34;
//        System.out.println(smallNumber);
//
//        short notASmallNumber = 30000;
//
//        int num = 45000000;
//
//        long largeNum = 14;
//
//        System.out.println(largeNum);
//
//        float decimal = 1.5F;
//        System.out.println(decimal);
//
//        double bigDecimal = 45;
//        System.out.println(bigDecimal);
//
//        final char singleLetter = 'g';
//        //singleLetter's value cannot be reassigned
//
//
//        boolean amILearningJava = true;
//
//        String message = "Hi \"how\"\n\t are you?";
//        System.out.println(message);
//
//        int sum = 4 + 5;
//        System.out.println(sum);
//
//        int difference = 72 - 19;
//        System.out.println(difference);
//
//        int whatWillThisBe = -4 * 2;
//        System.out.println(whatWillThisBe);
//
//        int iAmAnInt = 44;
//        long iAmALong = iAmAnInt;
//        System.out.println(iAmALong);
//
//        iAmALong = 99;
//        iAmAnInt = (int) iAmALong;
//        //The above shows casting which allows for the value to convert to the value type you declare
//        System.out.println(iAmAnInt);

//  EXERCISES
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        String  myString = "Superman";
        System.out.println(myString);

        // #3 it cannot since single quotes only accept a single character (char)
        // #4 it cannot be reassigned since myString is not a double

        // #5 Get an error due to it not having a value, not initialized
        float myNumber;
        // System.out.println(myNumber);

        //myNumber = 3.14;
        // #8 did not work due to 3.14 not being a long, it is a double

        myNumber =  (float) 3.14;
        System.out.println(myNumber);
        /* #8 assigning 123 works because a long are long intergers
         so the type of value is compatible despite it being shorter
         */

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        var class > YOU CANT CAUSE IT IS RESERVED WORD
//        String theNumberThree = "three";
//        Object o = theNumberThree; it seems like you can assign any value to object but not a stored variable
//        int three = (int) o;
//        int three = (int) "three"; A string cannot be converted to an interger

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x /= x / y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);
    var max = Byte.MAX_VALUE;
        System.out.println(max);
    byte hi = (byte) 128;
        System.out.println(hi);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey friend-o, how's it going?");
        String userInput = scanner.nextLine();

        System.out.printf("You're feeling: %s%n", userInput);

    }
}
