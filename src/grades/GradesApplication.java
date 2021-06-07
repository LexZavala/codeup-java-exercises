package grades;

import java.util.HashMap;

public class GradesApplication {
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




    }
}
