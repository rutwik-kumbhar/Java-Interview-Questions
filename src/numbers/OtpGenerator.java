package numbers;

public class OtpGenerator {

    public static  int generateOtp(){
        double otp =  Math.random()*9999+1000;
        return (int)otp;
    }

    public static void main(String[] args) {
      int otp =   OtpGenerator.generateOtp();
        System.out.println(otp);
    }


}
