package lesson3;

/**
 * Created by Admin on 12.05.2017.
 */
public class IfElseExample {
    public static void main(String[] args) {
//        int test = 1000;
//        if(test > 100)  System.out.println("Good");
//        else            System.out.println("Bad");

        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(true && true);
        System.out.println("--------------");
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println("-------------");
        System.out.println(!true);
        System.out.println(!false);
    }
}
