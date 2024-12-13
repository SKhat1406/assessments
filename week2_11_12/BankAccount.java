// Define a class `BankAccount` with attributes `accountNumber` and `balance`. 
// Include a method `deposit(double amount)` to add money to the account. Demonstrate its usage in the `main` method.

public class BankAccount {
    int accountNumber;
    double balance;

    public double deposit(double amount){
    
        double trascation=amount+balance;
        return trascation;
    }


    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        account.accountNumber=956868542;
        account.balance=25000.2565;
        System.out.println("------------Current account details------------");
        System.out.println("AccountNumber:"+ account.accountNumber +" "+ "balance:"+account.balance);

        double balance= account.deposit(5000);
        System.out.println("After deposit:"+balance);
    }
}
