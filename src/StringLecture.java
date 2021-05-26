import java.util.Locale;
import java.util.Scanner;

public class StringLecture {
    public static void main(String[] args) {
        char character = 'd';
        System.out.println(character == 'd');

//        Scanner scanner = new Scanner(System.in);
//        String bob = "Uncle Bob";
//        System.out.println("Who is your favorite uncle?");
//        String input = scanner.nextLine();
////        System.out.println(bob.equals(input));
//        System.out.println(bob.equalsIgnoreCase(input));

//Compare the start and end of Strings
        String david = "David";
        String dad = "Dad";
        String firstLetterDavid = "" + david.charAt(0);
        System.out.println("David and Dad start with the same letter?: " + dad.startsWith(firstLetterDavid));

//        String david2 = "David";
//        String dad2 = "Dad";
//        String firstLetterOfDavid = ("" + david2.charAt(0)).toLowerCase(Locale.ROOT);
//        System.out.println("David and Dad start with the same letter?: " + dad2.startsWith(firstLetterOfDavid));

        String coolCats = "Cool Cats are cool, and we like it like that.";
        System.out.println(coolCats.startsWith("Ca"));
        System.out.println(coolCats.endsWith("that."));

//Manipulation
        int locationOfAInDad = dad.indexOf("a");
        System.out.println("The location of 'a' in the string of \"Dad\" is: " + locationOfAInDad);

        int coolCatsLength = coolCats.length();
        System.out.println(coolCatsLength);

        String hiDad = "Hello, Father!";
        String father = hiDad.substring(7, 13);
        System.out.println(father);
        System.out.println(hiDad.replace(father, dad));
    }
}
