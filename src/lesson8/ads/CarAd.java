package lesson8.ads;

/**
 * Created by Admin on 27.05.2017.
 */
public class CarAd extends Ad {
    public int yearOfManufacturing;
    public String color;
    public String ownerName;
    public double weight;
    public int horsePower;

    public CarAd(long id, int price) {
        super(id, price);
    }

    public void confirmAd(){

    }
}
