package lesson11.firstinterface;

/**
 * Created by susanoo on 16.07.17.
 */
public class TestClass implements FirstInterface {
    public int test = 10;

    @Override
    public void send() {

    }

    @Override
    public String receive() {
        return null;
    }
}