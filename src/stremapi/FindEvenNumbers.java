package stremapi;


/*
1. Gives a list of Integer, find all the even numbers using Java 8 Stream API

Input : 1,2,3,4,5,6,7,8
Output : 2,4,6,8
*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FindEvenNumbers {
    public static void main(String[] args) {

        List<Integer> list =  List.of(1,2,3,4,5,6,7,8);



        Predicate<Integer> predicated = i -> i % 2 == 0;
        boolean numPredicateRes =  predicated.test(2);
        System.out.println(numPredicateRes);

        list.stream().filter((num)-> num % 2 == 0).forEach((n)-> System.out.println(n));

        List<String> nameList = Arrays.asList("Rutwik" , "Vicky" , "Sam" , "Rut");
        Predicate<String> predicate = (str) -> str.length() > 3;
        boolean strPredicateRes = predicate.test("Rut");
        boolean strPredicateRes2 = predicate.test("vicky");
        System.out.println(strPredicateRes);
        System.out.println(strPredicateRes2);

        nameList.stream().filter(name-> name.length() > 3 ).forEach(System.out::println);



//

    }
}
