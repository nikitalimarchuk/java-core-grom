package lesson6;

/**
 * Created by Admin on 24.05.2017.
 */
public class Car {
    private int price;
    private int yearOfManufacturing;
    public String color;
    public String ownerName;
    private double weight;
    public int horsePower;

    public Car(int price, int yearOfManufactoring, String ownerName) {
        this.price = price;
        this.yearOfManufacturing = yearOfManufactoring;
        this.ownerName = ownerName;
    }

    public void startRun() {
        System.out.println("I am running....");
    }

    public void stopRun() {
        System.out.println("I am stopping....");
    }

    public void changeOwner(String newOwnerName) {
        this.ownerName = newOwnerName;
    }
}
