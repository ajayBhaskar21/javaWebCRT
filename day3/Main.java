import java.util.*;

class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;


    BankAccount (String accountNumber, String accName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Successfully deposited in " + accountHolderName + "'s account");
        System.out.println("Remaining balance: " + balance);
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient funds!");

        }
        else {
            System.out.println("Successfully withdrawn from " + accountHolderName + "'s account");
            balance -= amount;
            System.out.println("Remaining Balance : " + balance);
        }
    }

    public void balanceEnquiry(BankAccount[] arr) {
        System.out.println("Enter account number: ");
        String accCheck =  new Scanner(System.in).nextLine();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].accountNumber.equals(accCheck)) {
                System.out.println("Balance amount : " + arr[i].balance);
                return;
            }
        }

        System.out.println("Account number not found!");
        
    }

}


public class Main {
    public static void main(String[] args) {
        
        BankAccount[] obj = new BankAccount[3];
        
        obj[0] = new BankAccount("123" , "Ajay", 2000);
        obj[1] = new BankAccount("124", "Krishna", 5000);
        obj[2] = new BankAccount("125", "Bot", 5024.552);

        //obj[0].balanceEnquiry(obj);
        obj[1].deposit(55.361);
        obj[1].withdraw(999);
        obj[2].withdraw(1222);
        obj[0].withdraw(1500.52611);
    }
}
