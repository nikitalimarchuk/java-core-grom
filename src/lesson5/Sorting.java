package lesson5;

/**
 * Created by Admin on 22.05.2017.
 */
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int [] array = {100, 75, 50, -25, -50, 0, 25, -100, -75};
        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));
    }

    public static int [] sortAscending(int [] array){
        int length = array.length;
        int thirdValue = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length - 1; j++) {
                if (array[j + 1] < array[j]) {
                    thirdValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = thirdValue;
                }
            }
        }
        return array;
    }

    public static int [] sortDescending(int [] array){
        int length = array.length;
        int thirdValue = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    thirdValue = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = thirdValue;
                }
            }
        }
        return array;
    }
}
