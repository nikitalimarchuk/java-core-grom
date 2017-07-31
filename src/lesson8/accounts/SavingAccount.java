package lesson8.accounts;

/**
 * Created by Admin on 27.05.2017.
 */
public class SavingAccount extends Account {
    public int savingPerMonth;

    public SavingAccount(String bankName, String ownerName, int moneyAmount, int savingPerMonth) {
        super(bankName, ownerName, moneyAmount);
        this.savingPerMonth = savingPerMonth;
    }

    @Override
    public void changeOwnerName(String newOwnerName){
        if(newOwnerName == "Jack" || newOwnerName == "Ann")
            ownerName = newOwnerName;
        else
            System.out.println("Sorry, you can't change owner name of this saving account");
    }
}
