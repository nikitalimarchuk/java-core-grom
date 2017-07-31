package lesson2;

/**
 * Created by Admin on 11.05.2017.
 */
public class SumAndDivision {
    public static void main(String[] args) {
        int    sum = 0;
        for(int i = 0; i <= 1000; i++){
            sum += i;
        }
        int dev     = sum / 3;
        int rest    = sum % 1234;
        System.out.println(rest > dev);
    }
}
