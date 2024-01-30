package numbers;


/*1. Merging two lists into single list using Java 8

Input : List1 [1, 2, 3, 4, 5]
        List2 [3, 4, 5, 6, 7, 8]

Output : MergedList [1, 2, 3, 4, 5, 3, 4, 5, 6, 7, 8]*/

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergedTwoList {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(3, 4, 5, 6, 7, 8);

        List<Integer> mergedList =  Stream.concat(list1.stream(),list2.stream()).toList();

        System.out.println(mergedList);



//      Unique element from merged list
//        List<Integer>  unique  =  mergedList.stream().distinct().collect(Collectors.toList());
//        System.out.println(unique);

//        Set<Integer> unique = mergedList.stream().distinct().collect(Collectors.toSet());
//        System.out.println(unique);

//        Set<Integer> unique = new HashSet<>(mergedList);
//        System.out.println(unique);


        String str = null;
        Optional<String> opt =  Optional.ofNullable(str);


    }
}
