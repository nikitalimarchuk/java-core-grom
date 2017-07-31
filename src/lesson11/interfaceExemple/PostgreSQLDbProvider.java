package lesson11.interfaceExemple;

/**
 * Created by Admin on 31.05.2017.
 */
public class PostgreSQLDbProvider implements DbProvider {
    @Override
    public void connectToDb(){
        //logic for postgres
    }

    @Override
    public void disconnectFromDb(){
        //logic for postgres
    }

    @Override
    public void encriptData() {

    }
}
