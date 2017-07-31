package lesson8.phones;

import lesson8.phones.IPhone;

/**
 * Created by Admin on 27.05.2017.
 */
public class Demo {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone(110, 10.0, "Chine", true);
        iPhone.deleteIPhoneFromDb();
        iPhone.orderPhone();
    }
}
