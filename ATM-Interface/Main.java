import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String userId = "user";    //fixed login details
        int pin = 12345;

        System.out.print("Enter User ID: ");
        String id = sc.nextLine();

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (id.equals(userId) && enteredPin==pin) {
            System.out.println("Login Successful!");
            ATM atm=new ATM();
            atm.menu();
        } else {
            System.out.println("Invalid User ID or PIN!");
        }
    }
}