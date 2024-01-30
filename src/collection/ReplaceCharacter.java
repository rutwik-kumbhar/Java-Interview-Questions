package collection;


/*
1. Replace a character at a specific index in a String in java
Input: String = "Eelcome to java"

Output: “welcome to java"
*/

public class ReplaceCharacter {
    public static void main(String[] args) {

        String input = "Eelcome to java";
        int i = 0;
        char ch = 'W';

       StringBuffer sb = new StringBuffer(input);

       sb.setCharAt(i,ch);

        System.out.println(sb);
    }
}
