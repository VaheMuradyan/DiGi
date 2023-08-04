package Servis;

import Model.Student;

public class StudentService {
    public static Student [] convert(String [] text){
        Student [] students = new Student[text.length];
        for(int i = 0; i < text.length; i++){
            students[i] = new Student(text[i]);
        }
        return students;
    }

    public static Student maxAge(Student [] students){
        Student max = students[0];
        for(int i = 1; i < students.length; i++){
            if(students[i].getYear() < max.getYear()){
                max = students[i];
            }
        }
        return max;
    }


}
