import java.util.*;



class InsufficientFundsException  extends Exception{

    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;


    BankAccount (String accountNumber, String accName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
    public String getaccountHolderName() {
        return this.accountHolderName;
    }
    public double getbalance() {
        return this.balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setaccountHolderName(String accName) {
        this.accountHolderName = accName;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Successfully deposited in " + this.accountHolderName + "'s account");
        System.out.println("Remaining balance: " + this.balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {

        
        if (amount > this.balance) {
            throw new InsufficientFundsException("Insufficient funds in the account.");

        }
        
/* 
        if (amount > balance) {
            System.out.println("Insufficient funds!");

        }
        else {
            System.out.println("Successfully withdrawn from " + accountHolderName + "'s account");
            balance -= amount;
            System.out.println("Remaining Balance : " + balance);
        }


*/
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


        try {
            obj[1].withdraw(111);
        } catch(InsufficientFundsException e) {
            System.out.println("Error : " + e.getMessage());
        }
        


        //obj[2].withdraw(1222);
        //obj[0].withdraw(1500.52611);

        System.out.print("Account number is " + obj[0].getAccountNumber());;





    }
}
