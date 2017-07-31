package lesson6;

import java.util.Date;

public class Order {
    private long id;
    private int price;
    private Date dateCreated;
    private boolean isConfirmed;
    private Date dateConfirmed;
    private String city;
    private String country;
    private String type;

    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order() {
    }

    public void confirmOrder() {
        if (!isConfirmed) {
            this.isConfirmed = true;
            this.dateConfirmed = new Date();
        }
    }

    public boolean checkPrice() {
        return price > 1000;
    }

    public boolean isValidType() {
        return this.type == "Buy" || this.type == "Sale";
    }
}
