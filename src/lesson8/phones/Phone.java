package lesson8.phones;

/**
 * Created by Admin on 27.05.2017.
 */
public class Phone {
    private int price;
    private double weight;
    private String countryProduced;

    public Phone(int price, double weight, String countryProduced) {
        System.out.println("Phone constructor was invoked...");
        this.price = price;
        this.weight = weight;
        this.countryProduced = countryProduced;
    }

    public void orderPhone(){
        System.out.println("order phone invoked...");
    }
}
