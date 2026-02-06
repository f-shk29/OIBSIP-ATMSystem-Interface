import java.util.ArrayList;

public class Account{

    int balance=5000;
    ArrayList<String> history=new ArrayList<>();

    public void deposit(int amt){
        balance += amt;
        history.add("Deposited: "+amt);
        System.out.println("Deposit successful!");
    }

    public void withdraw(int amt){
        if (amt <= balance) {
            balance -= amt;
            history.add("Withdrawn: "+amt);
            System.out.println("Please collect your cash!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void transfer(int amt){
        if (amt <= balance) {
            balance -= amt;
            history.add("Transferred: "+amt);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void showHistory(){
        if (history.isEmpty()){
            System.out.println("No transactions yet.");
        } else {
            for(String s : history){
                System.out.println(s);
            }
        }
        System.out.println("Check Balance: "+balance);
    }
}