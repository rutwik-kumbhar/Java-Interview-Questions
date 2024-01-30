package string;


/*1.
How to Remove Special Characters from String in Java

Input : $j#@a!*vas*
Output : java
*/
public class RemoveSpecialCharacter {


    public static void main(String[] args) {
        String str = "$j#@a!*va*";

        String res = str.replaceAll("[^a-zA-Z0-9]" , "");

        System.out.println(res);

    }






}
