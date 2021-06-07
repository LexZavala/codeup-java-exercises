package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class GradesApplication {
    public static String getStudentInfo( ArrayList<String> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What student would you like to see more information on?");
        String studentInput = scanner.nextLine();
        if (!list.contains(studentInput)) {
            System.out.println("Sorry, no student found with the Github username of: " + " \"" + studentInput + "\"\n");
            System.out.println("Would you like to see another student? (Y/N)");
            String userContinue = scanner.nextLine();
            if (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y")){
                getStudentInfo(list);
            }
        } else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Lex");
        Student student2 = new Student("Clark");
        Student student3 = new Student("Bruce");
        Student student4 = new Student("Diana");


        student1.addGrade(98);
        student1.addGrade(83);
        student1.addGrade(100);

        student2.addGrade(75);
        student2.addGrade(94);
        student2.addGrade(80);

        student3.addGrade(97);
        student3.addGrade(90);
        student3.addGrade(65);

        student4.addGrade(99);
        student4.addGrade(89);
        student4.addGrade(79);

        students.put("LexZavala", student1);
        students.put("ClarkGithub", student2);
        students.put("NotBatman", student3);
        students.put("PrinceCoder", student4);

        Set<String> keySet = students.keySet();

        ArrayList<String> usernameList = new ArrayList<>(keySet);

        System.out.println(usernameList);

//      INTERFACE
        System.out.println("Welcome!\n");
        System.out.println("Here are the Github usernames of our students:");
        for (String username : usernameList){
            System.out.print("|" + username + "| ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("What student would you like to see more information on?");
        String studentInput = scanner.nextLine();
        if (!usernameList.contains(studentInput)) {
            System.out.println("Sorry, no student found with the Github username of: " + " \"" + studentInput + "\"\n");
            System.out.println("Would you like to see another student? (Y/N)");
            String userContinue = scanner.nextLine();
            if (userContinue.equalsIgnoreCase("yes") || userContinue.equalsIgnoreCase("y")){
                System.out.println("What student would you like to see more information on?");
                if (usernameList.contains(studentInput)) {
                    System.out.println(students.);
                }
            }
        } else {
            System.out.println();
        }









    }
}
