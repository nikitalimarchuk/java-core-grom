package lesson10.polyexample;

/**
 * Created by Admin on 31.05.2017.
 */
public class Child extends Human {
    public Child(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Child class called...");
        super.run();
    }
}
