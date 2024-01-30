package functionalinterface;

import java.sql.PreparedStatement;

public class Demo {

    public static void main(String[] args) {

//        FunctionalInterface functionalInterface = new FunctionalInterfaceDemo();
//        functionalInterface.add(2, 5);

//        FunctionalInterface functionalInterface = new FunctionalInterface() {
//            @Override
//            public  void add(int a ,int b){
//                System.out.println(a+b);
//            }
//        };
//
//        functionalInterface.add(2,3);

        FunctionalInterface addition= (a, b)-> System.out.println(a+b);


         addition.add(2, 3);

    }
}
