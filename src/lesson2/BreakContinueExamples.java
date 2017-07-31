package lesson2;

/**
 * Created by Admin on 12.05.2017.
 */
public class BreakContinueExamples {
    public static void main(String[] args) {
        int test = 10;

//        while(test > 0){
//            System.out.println(test);
//            System.out.println("...");
//            test--;
//            break;
//        }

        while(test > 0){
            System.out.println(test);
            System.out.println("...");
            test--;
            continue;
        }

        System.out.println("done");
    }
}
