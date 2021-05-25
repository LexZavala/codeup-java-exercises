public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while ( i <= 15) {
            System.out.println("The current value of i is " + i);
            i++;
        }

        int x = 0;
        do { System.out.println(x); x += 2;}
        while (x <= 100);

    }
}
