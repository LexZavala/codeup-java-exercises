import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ask Bob a question.");
        String input = scanner.nextLine();

        if (input.endsWith("?")){
            System.out.println("Sure");
        } else if (input.endsWith("!")){
            System.out.println("Whoah, chill out!");
        } else if (input.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else if (input.equalsIgnoreCase("Tell me your full name")) {
            System.out.println("Bob Vance from Vance Refrigeration");
        }
    }
}
