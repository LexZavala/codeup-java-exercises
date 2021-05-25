public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while ( i <= 15) {
            System.out.println("The current value of i is " + i);
            i++;
        }

        int x = 100;
        do { System.out.println(x); x -= 5;}
        while (x >= -10);

        long y = 2;
        do {
            System.out.println(y);
            y *= y;

        } while (y < 1000000);

    }
}
