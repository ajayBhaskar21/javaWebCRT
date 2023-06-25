import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Character;

class Account {
    private String name;
    private double balance;
    private String password;

    public Account() {}

    public Account(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    public String getAccountHolderName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getPassword() {
        return this.password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class Manager {
    private String username;
    private String password;

    public Manager () {
        this.username = "Admin";
        this.password = "Admin";
    }

    public boolean checkIfManager(String username, String password) {
        if (!this.username.equals(username)) {
            System.out.println("Username did not match!");
            return false;
        }
        else if (!this.password.equals(password)) {
            System.out.println("Passwords did not match!");
            return false;
        }
        System.out.println("Details matched");
        return true;
    }
}

public class BankApplication {
    Manager manager;
    Account account;
    Scanner scanner;
    HashMap<String, Account> accounts;

    public BankApplication (Manager manager, Account account, HashMap<String, Account> accounts) {
        this.manager = manager;
        this.account = account;
        this.scanner = new Scanner(System.in);
        this.accounts = accounts;
    }

    public boolean isvalidAccountNumber(String accountNumber) {
        for (int i = 0; i < accountNumber.length(); i++) {
            if (!Character.isDigit(accountNumber.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isvalidAccountHolderName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') continue;
            if (!Character.isLetter(name.charAt(i)) ) {
                return false;
            }
        }
        return true;
    }

    public void addAccount() {
        System.out.println("Enter your username(Admin) and password(Admin) (Manager) : ");
        String username = scanner.next();
        scanner.nextLine();
        String password = scanner.next();
        if (manager.checkIfManager(username, password)) {

            System.out.print("Enter account number: ");
            String enteredAccountNumber = scanner.next();
            if (!isvalidAccountNumber(enteredAccountNumber)) {
                System.out.println("Account number should contain only digits!!");
                return;
            }
            if (accounts.containsKey(enteredAccountNumber)) {
                System.out.println("Account number Already taken!");
            }
            else {
                System.out.print("Enter account holder name: ");
                String enteredName = scanner.next();
                if (!isvalidAccountHolderName(enteredName)) {
                    System.out.println("Name should contain only letters.");
                    return ;
                }
                System.out.println("Initial balance is 0, but you if you want to deposit any amount please choose deposit section.");
                System.out.print("Enter password: ");
                String enteredPassword = scanner.next();
                accounts.put(enteredAccountNumber, 
                    new Account(enteredName, 0, enteredPassword)
                );
                System.out.println("Account Added!");
            }
        }
        else {
            System.out.println("Sorry!, your credentials are incorrect.");
        }
    }

    public void getAllDetails() {
        System.out.println("Enter your username(Admin) and password(Admin) (Manager): ");
        String username = scanner.next();
        scanner.nextLine();
        String password = scanner.next();
        if (manager.checkIfManager(username, password)) {
            if (accounts.size() == 0){
                System.out.println("No Accounts present!");
                return;
            }
            System.out.println("Account Number : Account Holder Name, Available Balance, Current Password--->");
            for (String accountNumber: accounts.keySet()) {
                System.out.println(accountNumber + " : " +
                    accounts.get(accountNumber).getAccountHolderName() + ", " +
                    accounts.get(accountNumber).getBalance() + ", " +
                    accounts.get(accountNumber).getPassword()          
                );
            }
        }
        else {
            System.out.println("Sorry!, your credentials are incorrect.");
        }
    }

    public void deposit() {
        System.out.println("Enter account number: ");
        String enterAccountNumber = scanner.next();
        if (isAccountNumberAvailable(enterAccountNumber) && isValidPassword(enterAccountNumber)) {
            System.out.println("Enter deposit amount: ");
            try {
                double enterAmount = scanner.nextDouble();
                accounts.get(enterAccountNumber).setBalance(
                    accounts.get(enterAccountNumber).getBalance() + enterAmount
                );
                System.out.println("Successfully Deposited");
            }
            catch (InputMismatchException e) {
                System.out.println(" only numerical values allowed for amount!");
            }
        }
    }

    public void withdraw() {
        System.out.println("Enter account number: ");
        String enterAccountNumber = scanner.next();
        if (isAccountNumberAvailable(enterAccountNumber) && isValidPassword(enterAccountNumber)) {
            System.out.println("Enter withdraw amount: ");
            try {
                double enterAmount = scanner.nextDouble();
                if (enterAmount > accounts.get(enterAccountNumber).getBalance()) {
                    System.out.println("Insufficient Funds!");
                }
                else {
                    accounts.get(enterAccountNumber).setBalance(
                        accounts.get(enterAccountNumber).getBalance() - enterAmount
                    );
                    System.out.println("Successfully Withdrawn");
                }
            }
            catch (InputMismatchException e) {
                System.out.println(" only numerical values allowed for amount!");
            }
        }
    }

    public void balanceEnquiry() {
        System.out.println("Enter account number: ");
        String enterAccountNumber = scanner.next();
        if (isAccountNumberAvailable(enterAccountNumber) && isValidPassword(enterAccountNumber)) {
            System.out.println("Balance Amount : " + accounts.get(enterAccountNumber).getBalance());
        }
    }

    public void getAccountDetails() {
        System.out.println("Enter account number: ");
        String enterAccountNumber = scanner.next();
        if (isAccountNumberAvailable(enterAccountNumber) && isValidPassword(enterAccountNumber)) {
            System.out.println("Account Number : Account Holder Name, Available Balance, Current Password");
            System.out.println(
                enterAccountNumber + " : " +
                accounts.get(enterAccountNumber).getAccountHolderName() + ", " +
                accounts.get(enterAccountNumber).getBalance() + ", " +
                accounts.get(enterAccountNumber).getPassword()
            );
        }
    }

    public void changeAccountName() {
        System.out.println("Enter account number: ");
        String enterAccountNumber = scanner.next();
        if (isAccountNumberAvailable(enterAccountNumber) && isValidPassword(enterAccountNumber)) {
            System.out.println("Enter New Name to change: ");
            String enteredName = scanner.next();
            if (accounts.get(enterAccountNumber).getAccountHolderName().equals(enteredName)) {
                System.out.println("New Name should not be same as old Name!!");
            }
            else {
                accounts.get(enterAccountNumber).setName(enteredName);
                System.out.print("Successfully changed the account holder name");
            }
        }
    }

    public void changeAccountPassword() {
        System.out.println("Enter account number: ");
        String enterAccountNumber = scanner.next();
        if (isAccountNumberAvailable(enterAccountNumber) && isValidPassword(enterAccountNumber)) {
            System.out.println("Enter new password to change: ");
            String enteredPassword = scanner.next();
            if (enteredPassword.equals(
                accounts.get(enterAccountNumber).getPassword()
            )){
                System.out.println("New Password should be not be same as Old Password");
            }
            else {
                accounts.get(enterAccountNumber).setPassword(enteredPassword);
                System.out.println("Successfully changed the account holder password");
            }
        }
    }


    public boolean isAccountNumberAvailable (String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account number found");
            return true;
        }
        else {
            System.out.println("Account number not found!");
            return false;
        }
    }

    public boolean isValidPassword(String accountNum) {
        System.out.print("Enter Password: ");
        String Password = scanner.next();
        if (accounts.get(accountNum).getPassword().equals(Password)) {
            System.out.println("Password Matched!");
            return true;
        }
        else {
            System.out.println("Password not matched!!!");
            return false;
        }
    }




    public static void main(String[] args) {
        HashMap<String, Account> accounts = new HashMap<>();
        Manager manager = new Manager();
        Account account = new Account();
        BankApplication  mainObj = new BankApplication(manager, account, accounts);

        while (true) {
            System.out.println("\n1. Add Account (Only for Manager)");
            System.out.println("2. Get All Account Details (Only for Manager)");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Balance Enquiry");
            System.out.println("6. Get Account Details");
            System.out.println("7. Change Account Holder Name");
            System.out.println("8. Change Account Holder Password");
            System.out.println("0. Exit\n");
            int choice = mainObj.scanner.nextInt();
            if (choice == 1) {
                mainObj.addAccount();
            }
            else if (choice == 2) {
                mainObj.getAllDetails();
            }
            else if (choice == 3) {
                mainObj.deposit();
            }
            else if (choice == 4) {
                mainObj.withdraw();
            }
            else if (choice == 5) {
                mainObj.balanceEnquiry();
            }
            else if (choice == 6) {
                mainObj.getAccountDetails();
            }
            else if (choice == 7) {
                mainObj.changeAccountName();
            }
            else if (choice == 8) {
                mainObj.changeAccountPassword();
            }
            else if (choice == 0) {
                break;
            }
            else {
                System.out.println("Incorrect choice!!");
            }
        }
    }
}
