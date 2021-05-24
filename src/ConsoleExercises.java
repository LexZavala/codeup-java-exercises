import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
//        pi= Math.floor(pi*100) / 100;
        System.out.format("The value of pi is approximately %.2f %n", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an interger.");
//        int userInput = scanner.nextInt();
//        System.out.printf("The number you entered is " + userInput + "%n");
//
//        System.out.println("Please enter three words");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf(firstWord + "%n" + secondWord + "%n" + thirdWord + "%n");
//
//        scanner.nextLine();
//        System.out.println("Please enter a sentence");
//        String sentenceInput = scanner.nextLine();
//        System.out.printf("Your sentence is %s%n ", sentenceInput);

        System.out.println("Please enter the length of the classroom");
        String classroomLength = scanner.nextLine();
        System.out.println("Please enter the width of the classroom");
        String classroomWidth = scanner.nextLine();
        int lengthNum = Integer.parseInt(classroomLength);
        int widthNum = Integer.parseInt(classroomWidth);
        int classroomArea = lengthNum * widthNum;
        System.out.printf("Your class length is: %s, and your class width is: %s%n", lengthNum, widthNum);
        System.out.printf("The Area of your classroom is %s sqft %n", classroomArea);



    }
}
