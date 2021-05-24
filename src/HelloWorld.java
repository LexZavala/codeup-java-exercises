public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.print(", World\n");
        System.out.println("I am in brackets!");
        // This is a single line comment

        /*
        This is a multiline comment
        test
         */
        byte smallNumber = 34;
        System.out.println(smallNumber);

        short notASmallNumber = 30000;

        int num = 45000000;

        long largeNum = 14;

        System.out.println(largeNum);

        float decimal = 1.5F;
        System.out.println(decimal);

        double bigDecimal = 45;
        System.out.println(bigDecimal);

        final char singleLetter = 'g';
        //singleLetter's value cannot be reassigned


        boolean amILearningJava = true;

        String message = "Hi \"how\"\n\t are you?";
        System.out.println(message);


    }

}
