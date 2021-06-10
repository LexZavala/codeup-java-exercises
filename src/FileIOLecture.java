import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileIOLecture {
    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());

//        Path path = Paths.get("src", "FileIOLecture.java");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());


        // WILL NOT WORK
//        Path pathToSrc = Paths.get("src");
//        System.out.println(pathToSrc);
//        Path thisWontWork =  Paths.get(pathToSrc, "FileIOLecture.java");
        // Reason it doesnt work is cause the get method needs a string parameter not object

        // WILL WORK
//        Path pathToSrc = Paths.get("src");
//        System.out.println(pathToSrc);
//        Path thisWontWork =  Paths.get(String.valueOf(pathToSrc), "FileIOLecture.java");
        // convert object to string

        Path toOurDataPlace = Paths.get("src/data");
//        System.out.println(toOurDataPlace);
        Path toOurDataFile =  Paths.get(String.valueOf(toOurDataPlace), "data.txt");


        try {
            if (Files.notExists(toOurDataPlace)){
                Files.createDirectories(toOurDataPlace);
            } else {
                System.out.println("The " + toOurDataPlace + " directory already exists.");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

//      FILE CREATION
        try {
            if (Files.notExists(toOurDataFile)){
                Files.createFile(toOurDataFile);
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        List<String> romanEmpressess = Arrays.asList("Livia", "Agrippina", "Messaline", "Julia Donna");

        try {
            Files.write(toOurDataFile, romanEmpressess);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }
}

