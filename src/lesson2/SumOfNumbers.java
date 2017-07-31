package lesson2;

/**
 * Created by Admin on 11.05.2017.
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        long i;
        long result = 0;
        for(i = 0; i <= 10000000 ; i++){
            result += i;
        }
        System.out.println(result);
    }
}
