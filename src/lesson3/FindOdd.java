package lesson3;

import com.sun.org.glassfish.gmbal.Description;

/**
 * Created by Admin on 14.05.2017.
 */
public class FindOdd {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 1000; i++){
            if((i % 2) != 0 ){
                sum += i;
                System.out.println("Found");
            }
        }
        //if else
//        if((sum * 5) > 5000) {
//            System.out.println("Bigger");
//        }else {
//            System.out.println("Smaller or equal");
//        }
        //ternary operator v1.0
//        String result;
//        result = ((sum *5) > 5000) ? "Bigger" : "Smaller or equal";
//        System.out.println(result);

        //ternary operator v2.0
        System.out.println(((sum *5) > 5000) ? "Bigger" : "Smaller or equal");
    }
}
