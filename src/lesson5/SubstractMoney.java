package lesson5;

/**
 * Created by Admin on 22.05.2017.
 */
public class SubstractMoney {
    public static void main(String[] args) {
        String [] clients = {"John", "Bob", "Cathy"};
        int [] balances = {500, 750, 1000};
        System.out.println(withdraw(clients, balances, "Cathy", 25));
    }
    public static int withdraw(String[] clients, int[] balances, String client, int amount){
        int index = findClientIndexByName(clients, client);
        if(balances[index] < amount){
            return -1;
        }else{
            balances[index] -= amount;
        }
        return balances[index];
    }

    public static int findClientIndexByName(String[] clients, String client) {
        int index = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            index++;
        }
        return index;
    }
}
