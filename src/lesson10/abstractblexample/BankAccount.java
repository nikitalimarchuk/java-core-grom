package lesson10.abstractblexample;

import lesson9.*;

/**
 * Created by Admin on 31.05.2017.
 */
public class BankAccount {
    private Employee employee;
    private int balance;

    public BankAccount(Employee employee, int balance) {
        this.employee = employee;
        this.balance = balance;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
