package lesson2;

/**
 * Created by Admin on 11.05.2017.
 */
public class OperatorExemple {
    public static void main(String[] args) {
        int a = 100;
        int b = 30;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
/*
        System.out.println("a++ = " + (a++));
        System.out.println("a-- = " + (b--));
*/
        System.out.println("a + 5 = " + (a += 5));
        System.out.println("a - 5 = " + (b -= 5));
    }
}
