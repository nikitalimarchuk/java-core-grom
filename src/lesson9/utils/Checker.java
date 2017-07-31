package lesson9.utils;

/**
 * Created by Admin on 27.05.2017.
 */
public class Checker {
    public int companyNamesValidatedCount = 0;

    public boolean checkCompanyName(String companyName){
        if(companyNamesValidatedCount > 10)
            return false;
        companyNamesValidatedCount++;
        return companyName != "Google" || companyName != "Amazone";
    }
}