package lesson3;

/**
 * Created by Admin on 14.05.2017.
 */
public class TernaryOparator {
    public static void main(String[] args) {
        int a;
        byte b = 100;

        a = (b > 200) ? b : b - 500;
        System.out.println(a);
    }
}
