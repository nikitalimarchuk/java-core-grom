package lesson8.accounts;

/**
 * Created by Admin on 27.05.2017.
 */
public class CheckingAccount extends Account{
    public int limitOFExpenses;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limitOfExpences) {
        super(bankName, ownerName, moneyAmount);
        this.limitOFExpenses = limitOfExpences;
    }

    public void withdraw(int amount){
        if(amount > limitOFExpenses)
            return;
        moneyAmount -= amount;
    }
}
