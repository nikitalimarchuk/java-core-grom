package lesson8.homework.task1;

/**
 * Created by Admin on 27.05.2017.
 */
public class Arithmetic {
    public boolean check(int [] array){
        int min = array[0];
        int max = array[0];
        int length = array.length;
        for(int i = 0; i < length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }
        return min + max > 100;
    }
}
