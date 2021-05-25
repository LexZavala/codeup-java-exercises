public class ControlFlowLec {
    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5){
//            System.out.println("If you are reading thus it means x is 5");
//        }
//        System.out.println("on the other hand, this says nothing about x, because it runs regardless of what x is");
//
//
//        int y = 2;
//        if (y ==2) {
//            System.out.println("I have carried out a conditional test and can confirm that the statement 'y == 2' is true");
//        } else {
//            System.out.println("I have carried out a conditional test and can confirm that the statement 'y == 2' is not true. It is false");
//        }

        short y = 32000;
        if (y < 0) {
            System.out.println("The variable y contains a negative number value");
        } else if (y >= 0 && y < 30000){
            System.out.println("The variable contains a positive number value");
        } else {
            System.out.println( "The variable y contains a numeric valye that is dangerously close to the max value for short type variables which is " + Short.MAX_VALUE);
        }

        String customerChoice;

    //LOOPS

        int i = 1;
        while (i < 10){
            System.out.println("Now I am in the loop. I has not incremented yet and its value is " + i);
            i++;
            System.out.println("I am still in the loop but I am incremented and its value is " + i);
        }
        System.out.println("This is outside the loop after it has executed. The conditional has tested false. The value of i is now 10");

        for (int i = 0; i <10; i++){
            System.out.println("Now I am in the loop, I has not incremented");
        }




    }
}
