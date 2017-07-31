package lesson10.abstractblexample;

/**
 * Created by Admin on 31.05.2017.
 */
public abstract class Employee {
    private String name;
    private int age;
    private int yearsOfExperience;

    private String curPosition;

    private int salaryPerMonth;
    private BankAccount bankAccount;
    private Company[] companiesWorked = new Company[10];
    private String[] positionsWorked = new String[10];

    public abstract void paySalary();

    public void changePosition(String newPosition){
        savePositionToHistory();
        curPosition = newPosition;
    }

    private void savePositionToHistory(){
        int index = 0;
        for(String pos : positionsWorked){
            if(pos == null){
                positionsWorked[index] = curPosition;
                break;
            }
            index++;
        }
    }

    public int getBalance(){
        return bankAccount.getBalance();
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getName() {
        return name;
    }
}
