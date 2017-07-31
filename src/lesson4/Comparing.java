package lesson4;

/**
 * Created by Admin on 19.05.2017.
 */
public class Comparing {
    public static boolean compareSums(int a, int b, int c, int d){
        return sum(a, b) > sum(c, d);
    }

    public static long sum(int from, int to){
        long result = 0;
        for(long i = from; i <= to; i++){
            result += i;
        }
        return result;
    }
}
