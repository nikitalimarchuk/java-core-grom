package lesson8.homework.task1;

/**
 * Created by Admin on 27.05.2017.
 */
public class Demo {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        Adder adder = new Adder();
        System.out.println(adder.add(5, 5));
        System.out.println(adder.check(array));
    }
}
