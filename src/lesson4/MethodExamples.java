package lesson4;

/**
 * Created by Admin on 18.05.2017.
 */
public class MethodExamples {
    public static int increaser(int a, int index) {
        //System.out.println("method invoked");
        a+=index;
        //System.out.println("method before return");
        return a;
    }

    public static int min(int a, int b){
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(increaser(5, 20));
        System.out.println(min(increaser(10, 5), 11));
    }
}
