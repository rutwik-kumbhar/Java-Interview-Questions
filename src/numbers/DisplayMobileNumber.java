package numbers;


/*
2. Display last 2 digits in mobile number and replace remaining digits with "#"

Input : 0923478656
OutPut : ########56
*/

public class DisplayMobileNumber {
    public static void main(String[] args) {
        String number = "8806813361";


        String res = number.replaceAll(".(?=.{2})","#");
        System.out.println(res);
    }
}
