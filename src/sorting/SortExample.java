package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(12);
        marks.add(10);
        marks.add(5);
        marks.add(20);

        Collections.sort(marks);
        System.out.println(marks);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(4,"Rutwik", "8806813361"));
        employees.add(new Employee(3,"Vicky", "9134345694"));
        employees.add(new Employee(1,"Durgesh", "3849439548"));
        employees.add(new Employee(2,"Pratik", "9453783361"));
        employees.add(new Employee(5,"Ganesh", "3409437892"));

//        Collections.sort(employees,new IdComparator());
//
//        Collections.sort(employees,new NameComparator());

//        employees.sort(new IdComparator());
//        employees.sort(new NameComparator());

        Collections.sort(employees,(a,b)-> a.getId()-b.getId());

        employees.sort((a,b)-> a.getName().compareTo(b.getName()));

        System.out.println(employees);
    }
}
