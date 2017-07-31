package lesson5;

import java.util.Arrays;

/**
 * Created by Admin on 19.05.2017.
 */
public class FirstArray {
    public static void main(String[] args) {
        int a = 10;

        int [] firstArray = new int [3];
        firstArray[0] = 11;
        firstArray[1] = 200;
        firstArray[2] = -10;

        System.out.println(firstArray[0]);
        System.out.println(firstArray[1]);
        System.out.println(firstArray[2]);

        for(int i = 0; i < firstArray.length; i++){
            System.out.println(firstArray[i]);
        }

        System.out.println(Arrays.toString(firstArray));

        int [] secondArray = {1, 10, 15, 20, -50};
        for (int element : secondArray) {
            System.out.println(element);
        }
    }
}
