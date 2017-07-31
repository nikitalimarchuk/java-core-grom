package lesson10.polyexample;

/**
 * Created by Admin on 31.05.2017.
 */
public class User extends Human {
    public User(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("User class called...");
        super.run();
    }
}
