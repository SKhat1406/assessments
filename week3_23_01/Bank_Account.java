
public class Bank_Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Bank_Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println(amount > balance ? "Insufficient funds." : "Invalid withdrawal amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank_Account account = new Bank_Account("8857857548", "Wanderlust", 1000.0);

        account.displayBalance();
        account.deposit(500.0);
        account.displayBalance();

        account.withdraw(300.0);
        account.displayBalance();

        account.withdraw(1500.0);
    }
}

