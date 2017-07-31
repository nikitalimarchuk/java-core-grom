package lesson8.ads;

/**
 * Created by Admin on 27.05.2017.
 */
public class HouseAd extends Ad {
    public String ownerName;
    public String adress;
    public double square;
    public int floors;

    public HouseAd(long id, int price, String ownerName, String adress, double square, int floors) {
        super(id, price);
        this.ownerName = ownerName;
        this.adress = adress;
        this.square = square;
        this.floors = floors;
    }

    public boolean checkOwner(){
        Owner owners = new Owner();
        for (String owner : owners.owners){
            if(ownerName == owner)
                return true;
        }

        return false;
    }
}
