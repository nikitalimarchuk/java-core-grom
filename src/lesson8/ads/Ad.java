package lesson8.ads;

import java.util.Date;

/**
 * Created by Admin on 27.05.2017.
 */
public class Ad extends BaseEntity{
    public int price;
    public Date dateCreated;

    public Ad(long id, int price) {
        super(id);
        this.price = price;
        this.dateCreated = new Date();
    }

    public void publishAd(){

    }
}
