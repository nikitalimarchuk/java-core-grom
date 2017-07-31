package lesson10.polyexample;

/**
 * Created by Admin on 31.05.2017.
 */
public class Human {
    private String name;

    public Human(String name){
        this.name = name;
    }

    public void run(){
        System.out.println("Human class is called...");
        System.out.println(name + " is running");
    }
}
