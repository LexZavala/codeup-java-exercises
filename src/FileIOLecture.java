import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class FileIOLecture {

    public void readFileAndOutput (Path pathToFile){
        List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(pathToFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        for (String line : currentList){
            System.out.println(line);
        }

    }

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


//        try {
//            if (Files.notExists(toOurDataPlace)){
//                Files.createDirectories(toOurDataPlace);
//            } else {
//                System.out.println("The " + toOurDataPlace + " directory already exists.");
//            }
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//
////      FILE CREATION
//        try {
//            if (Files.notExists(toOurDataFile)){
//                Files.createFile(toOurDataFile);
//            }
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//
//        List<String> romanEmpressess = Arrays.asList("Livia", "Agrippina", "Messaline", "Julia Donna");
//
//        try {
//            // 2 arguments for write
//            // The path to our file, the data we want to write
//            Files.write(toOurDataFile, romanEmpressess);
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }

//      READ FILE

//        // create a place to put information we read from the file
//        List<String> currentList = new ArrayList<>();
//
//        // read the info from file
//        try {
//            currentList = Files.readAllLines(toOurDataFile);
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        // loop through the ArrayList and output each item
//        for (String line : currentList){
//            System.out.println(line);
//        }

        FileIOLecture io = new FileIOLecture();
//        io.readFileAndOutput(toOurDataFile);

        // Append a single item to our list

//        try {
//            Files.writeString(toOurDataFile, "Julia Maesa\n", StandardOpenOption.APPEND);
//        } catch (IOException ioe){
//            ioe.printStackTrace();
//        }
//        io.readFileAndOutput(toOurDataFile);

        // Append a list to a list

        List<String> lateRomanEmpresses = new ArrayList<>();
        lateRomanEmpresses.add("Galla Placidia");
        lateRomanEmpresses.add("Theodora");
        lateRomanEmpresses.add("Licinia Eudoxia");

        try {
            Files.write(toOurDataFile, lateRomanEmpresses, StandardOpenOption.APPEND);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        io.readFileAndOutput(toOurDataFile);

        // Remove

    }
}

