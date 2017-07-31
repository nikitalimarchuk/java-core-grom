package lesson5;

public class UniqueCount {
    public static void main(String[] args) {
        int [] array = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11};
        System.out.println(uniqueCount(sortAscending(array)));
    }

    public static int uniqueCount(int [] array){
        int length = array.length;
        int counter = 0;
        for (int i = 0; i < length - 1; i++){
            if(array[i] != array[i+1]){
                counter++;
            }
        }
        return counter + 1;
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
}
