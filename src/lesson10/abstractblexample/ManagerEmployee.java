package lesson10.abstractblexample;

/**
 * Created by Admin on 01.06.2017.
 */
public class ManagerEmployee extends Employee{
    @Override
    public void paySalary() {
        int newBalance = getBankAccount().getBalance() + getSalaryPerMonth();
        newBalance += newBalance * 0.25;
        getBankAccount().setBalance(newBalance);
    }
}
