import java.util.Scanner;

public class ExceptionsLecture {
    public String maybeAnInterger = "42";
    public String definitelyNotAnInterger = "Nope I am definitely not an Interger. I am a String";

    public void askForAnInterger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an interger");
        String userInput = scanner.nextLine();
        try {
            int userInputInterger = Integer.parseInt(userInput);
            System.out.println("The interger in your string is: " + userInputInterger);
        } catch (NumberFormatException nfe){
            System.out.println("Uh oh, " + nfe.getMessage() + " there is no interger!");
        } finally {
            System.out.println("thank you for using this complex useful application");
            System.out.println("Please come back and visit us.");
        }
    }

    // Make sure you put more specific exception catches
    // ABOVE more general exception catches in your code
    // or you will get the has already been caught exception
    public void aMoreComplexAskForInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = scanner.nextLine();
        try {
            int userInputInteger = Integer.parseInt(userInput, 10, 15, 10);
        } catch (NumberFormatException nfe){
            System.out.println("No integer between characters 10 and 15");
        } catch (IndexOutOfBoundsException iobe){
            System.out.println("Your string wasn't long enough");
        } catch (NullPointerException npe) {
            System.out.println("You literally didnt enter anything");
        } finally {
            System.out.println("Thank you for visiting our application.");
        }
    }

    public void echoWord() throws  IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I am a parrot. Please say something and I will parrot you");
        String userInput = scanner.nextLine();
        if (userInput.equals("curses")){
            throw new IllegalArgumentException();
        }
        System.out.println(userInput);
    }
}
