package collection;


/*2. How to sort an ArrayList in Descending order! if Java
Input: AA, ZZ, CC, FF

Output: ZZ, FF, CC, AA
*/


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayListDescendingOrder {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "ZZ", "CC", "FF");
//        List<String> stringList = List.of("AA", "ZZ", "CC", "FF");

        System.out.println("Unsorted ArrayList : " + list);



//        Collections.sort(list);
//        System.out.println("Ascending Order Sorted ArrayList : " + list);

//        Collections.reverse(list);
//        System.out.println("Descending Order Sorted ArrayList : " + list);

//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println("Descending Order Sorted ArrayList : " + list);




        list.sort(Collections.reverseOrder());
        System.out.println("Descending Order Sorted ArrayList : " + list);
    }

}
