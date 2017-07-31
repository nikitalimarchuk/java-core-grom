package lesson15.cast;

/**
 * Created by susanoo on 28.07.17.
 */
public class Demo {
    public static void main(String[] args) {
        InternetProvider provider = (InternetProvider) test();
        FoodProvider foodProvider = (FoodProvider) testFood();
        System.out.println(provider);
    }

    public static Provider test(){
        return new InternetProvider();
    }

    public static Provider testFood(){
        return new InternetProvider();
    }
}
