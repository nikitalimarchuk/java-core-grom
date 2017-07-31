package lesson5;

/**
 * Created by Admin on 21.05.2017.
 */
public class ArrayPractice {
    public static int maxElement(int [] array){
        int max = array[0];

        for(int element : array){
            if(element > max){
                max = element;
            }
        }
        return max;
    }

public static int nCount(int [] array, int number){
    int counter = 0;

    for(int element : array){
        if(element == number){
            counter++;
        }
    }

    return counter;
}

    public static void main(String[] args) {
        int [] array = {-10, 0, 110, 555, 1000, -45, 0, 60};
        System.out.println("Max element: " + maxElement(array));
        System.out.println("Counter: " + nCount(array, 0));
    }
}
