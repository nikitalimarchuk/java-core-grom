package lesson10.abstractblexample;

/**
 * Created by Admin on 31.05.2017.
 */
public class DeveloperEmployee extends Employee{
    private String[] framaworks = new String[10];

    @Override
    public void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth() + 1000;
        getBankAccount().setBalance(newBalance);
    }
}
