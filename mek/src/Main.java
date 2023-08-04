import Model.Student;
import Servis.FileService;
import Servis.StudentService;

import java.io.IOException;


public class Main {
    public static final String URL = "C:\\Users\\A\\Desktop\\Project\\mek\\Lesson.txt";

    public static void main(String[] args) throws IOException {
        String[] text = FileService.read(URL);
        Student[] students = StudentService.convert(text);

        Student student = StudentService.maxAge(students);
        FileService.wright(URL,"\nMax = " + student.toString());
    }
}