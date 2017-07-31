package lesson4;

/**
 * Created by Admin on 18.05.2017.
 */
public class PracticeExample {
    public static int min(int a, int b, int c){
        int result = a < b ? a : b;

        return result < c ? result : c;
    }

    public static double average(int n){
        int sum = 0;
        if(n != 0) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            return (double) sum / n;
        }
        else
            return 0;
    }

    public static double average(int a, int b){
        //[2-5] : {2, 3, 4, 5}
        int sum = 0;
        for (int i = a; i <= b; i++){
            sum +=i;
        }

        return (double) sum / (b - a + 1);
    }

    public static int count(int a, int b, int n){
        int count = 0;
        for(int i = a; i < b; i++){
            if(i % 10 == n){
                count++;
            }
        }
        return count;
    }

    public static void main (String args[]) {
        System.out.println(min(2, 5, 10));      //2
        System.out.println(min(10, 5, 2));      //2
        System.out.println(min(10, 5, 10));     //5
        System.out.println(average(2));         //(1+2)/2 = 1.5
        System.out.println(average(10));        //(1+2+3+4+5+6+7+8+9+10)/10 = 5.5
        System.out.println(average(2, 5));      //(2+3+4+5)/4 = 3.5
        System.out.println(count(1, 100, 5));    //{5, 15, 25, 35, 45, 55, 65, 75, 85, 95} : 10
    }
}
