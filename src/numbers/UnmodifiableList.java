package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {

    public static void main(String[] args) {
//        List<String> students = new ArrayList<>();
//
//
//        students.add("Rutwik");
//        students.add("Vicky");
//        students.add("Raj");
//        students.add("Pravin");
//
//
//        students =  Collections.unmodifiableList(students);
//        students.add("Rahul");
//
//        System.out.println(students);


//        List<String> students = Arrays.asList("Rutwik", "Rahul", "vicky");
//        students.add("Ganesh");
//        System.out.println(students);


        List<String> students = List.of("Rutwik", "Rahul", "vicky");
        students.add("Ganesh");
        System.out.println(students);

    }

}
