import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ask Bob a question.");
        String question = scanner.nextLine();

        if (question.endsWith("?")){
            System.out.println("Sure");
        } else {
            System.out.println("That is not a question, bye!");
        }
    }
}
