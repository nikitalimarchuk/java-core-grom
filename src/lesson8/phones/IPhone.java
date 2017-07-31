package lesson8.phones;

/**
 * Created by Admin on 27.05.2017.
 */
public class IPhone extends Phone{
    private boolean fingerPrint;

    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint) {
        super(price, weight, countryProduced);
        System.out.println("Iphone constructor was invoked...");
        this.fingerPrint = fingerPrint;

    }

    public void deleteIPhoneFromDb(){
        System.out.println("deleteIPhoneFromDb invoked...");
    }
}
