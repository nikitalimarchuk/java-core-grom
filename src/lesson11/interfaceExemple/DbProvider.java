package lesson11.interfaceExemple;

/**
 * Created by Admin on 31.05.2017.
 */
public interface DbProvider {

    public void connectToDb();

    public void disconnectFromDb();

    public void encriptData();
}
