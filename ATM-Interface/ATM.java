import java.util.Scanner;

public class ATM {
        Scanner sc=new Scanner(System.in);
        Account acc=new Account();

    public void menu() {
        int ch;
        do {
            System.out.println("\n -- WELCOME TO THE ATM SYSTEM! -- ");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            
            ch = sc.nextInt();
            switch (ch) {
                case 1: acc.showHistory();
                        break;
                case 2: System.out.print("Enter amount to withdraw: ");
                        acc.withdraw(sc.nextInt());
                        break;

                case 3: System.out.print("Enter amount to deposit: ");
                        acc.deposit(sc.nextInt());
                        break;

                case 4: System.out.print("Enter amount to transfer: ");
                        acc.transfer(sc.nextInt());
                        break;

                case 5: System.out.println("Thank you for using the ATM!");
                        break;

                default: System.out.println("Invalid choice!");
            }
        } while (ch!=5);
    }
}