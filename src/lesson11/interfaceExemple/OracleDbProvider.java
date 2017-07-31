package lesson11.interfaceExemple;

/**
 * Created by Admin on 31.05.2017.
 */
public class OracleDbProvider implements DbProvider {
    @Override
    public void connectToDb(){
        //logic for oracle
    }

    @Override
    public void disconnectFromDb(){
        //logic for oracle
    }

    @Override
    public void encriptData() {

    }

}
