package lesson8.accounts;

/**
 * Created by Admin on 27.05.2017.
 */
public class Account {
    public String bankName;
    public String ownerName;
    public int moneyAmount;

    public Account(String bankName, String ownerName, int moneyAmount) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }

    public void depositMoney(int amount){
        moneyAmount += amount;
    }

    public void depositMoney(){
        moneyAmount += 1000;
        System.out.println("Deposit was successful");
    }

    public void changeOwnerName(String newOwnerName){
        ownerName = newOwnerName;
    }
}
