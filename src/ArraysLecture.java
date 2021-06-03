import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        int[] numbers = {14, 64, 34, 44};
        for (int number : numbers) {
            System.out.println(number);
//            for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
        }


        String[] topFiveBoyNames = new String[6];

        topFiveBoyNames[0] = "Greg";
        topFiveBoyNames[1] = "Jim";
        topFiveBoyNames[2] = "Geoff";
        topFiveBoyNames[3] = "Naysa";
        topFiveBoyNames[4] = "Hideo";

        for (String name : topFiveBoyNames) {
            System.out.println(name);
        }

        boolean[] testBoolean = new boolean[3];

        for (boolean boo : testBoolean) {
            System.out.println(boo);
        }

        Arrays.fill(testBoolean, true);

        for (boolean boo : testBoolean) {
            System.out.println(boo);
        }

        Arrays.fill(topFiveBoyNames, "Jim");
        topFiveBoyNames[0] = "Naysa";

        for (String name : topFiveBoyNames) {
            System.out.println(name);
        }

        int[]alsoNums = {14, 33, 34, 44};

        for (int number : alsoNums){
            System.out.println(number);
        }

        int[] yetMoreNums = Arrays.copyOf(numbers, 5);

        for (int number: yetMoreNums){
            System.out.println(number);
        }

        int[] unsortedArr = {2, 32, 5, 1, 67};
        System.out.println(Arrays.toString(unsortedArr));

        Arrays.sort(unsortedArr);
        System.out.println(Arrays.toString(unsortedArr));

        char[][] letters = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };

        for (char[] row : letters){
            System.out.println("+---+---+---+");
            System.out.print("| ");

            for (char n : row){
                System.out.print(n + " | ");
            }

            System.out.println();
        }
        System.out.println("+---+---+---+");


    }
}
