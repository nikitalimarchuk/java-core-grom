package lesson8.phones;

/**
 * Created by Admin on 27.05.2017.
 */
public class Android extends Phone{
    private String androidVersion;
    private int screenSize;

    private String secretDeviceCode;

    public Android(int price, double weight, String countryProduced, String androidVersion, int screenSize, String secretDeviceCode) {
        super(price, weight, countryProduced);
        System.out.println("Android constructor was invoked...");
        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviceCode = secretDeviceCode;
    }

    public void installNewAndroidVersion(){
        System.out.println("installNewAndroidVersion invoked...");
    }
}
