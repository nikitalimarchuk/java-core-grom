package lesson10.polyexample;

/**
 * Created by Admin on 31.05.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Human human = new Human("Test");
        run(human);

        User user = new User("Jack");
        run(user);
    }

    private static void run(Human human){
        human.run();
    }
}
