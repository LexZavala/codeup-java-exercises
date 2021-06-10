import java.io.IOException;
import java.nio.file.*;


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
            Files.createFile(toOurDataFile);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

    }
}

