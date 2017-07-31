package lesson4;

/**
 * Created by Admin on 18.05.2017.
 */
public class NumCounter {
    public static int findDivCount(short a, short b, int n){
        int counter = 0;
        if(n != 0) {
            for (int i = a; i <= b; i++) {
                if (i % n == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(findDivCount((short)1, (short)8, 2)); //[2, 4, 6, 8] : % 2 = 0 :: i % n = 0 => count++
    }
}
