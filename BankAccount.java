class BankAccountDetails {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    BankAccountDetails(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void getDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    void setDetails(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

}

public class BankAccount {
    public static void main(String[] args) {
        BankAccountDetails account = new BankAccountDetails("John Doe", 123456789, 1000);
        account.getDetails();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(2000);

    }
}
