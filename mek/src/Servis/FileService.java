package Servis;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class FileService {
    public static String [] read(String url) throws IOException {
        return  Files.readAllLines(Paths.get(url)).toArray(new String[0]);
    }

    public static void wright(String url, String text) throws IOException{
        Files.write(Paths.get(url),text.getBytes(), StandardOpenOption.APPEND);
        //stexa patasxan@
    }
}
