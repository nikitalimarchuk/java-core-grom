package lesson10.abstractexample;

/**
 * Created by Admin on 31.05.2017.
 */
public abstract class DbProvider {
    private String dbHost;

    public abstract void connectToDb();
    public abstract void disconnectFromDb();
    public void printDbHost(){
        System.out.println("DB host is " + dbHost);
    }
}
