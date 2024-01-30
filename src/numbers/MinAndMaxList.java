package numbers;

import java.util.ArrayList;
import java.util.List;

public class MinAndMaxList {



    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,5,30,15,3,20);

       int min =  numbers.stream().min(Integer::compareTo).get();
       int max = numbers.stream().max((a,b)-> a.compareTo(b)).get();

        System.out.println("Minimum  : " + min);
        System.out.println("Maximum : " + max);


    }
}
