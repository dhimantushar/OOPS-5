// Non-public domain class: BankAccount
class BankAccount {
    private String accountNo;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit rejected: amount must be positive.");
        }
    }

    void withdraw(double amount) {
        boolean success; // local variable tracking whether this withdrawal is allowed

        if (amount <= 0) {
            success = false;
            System.out.println("Withdrawal rejected: amount must be positive.");
        } else if (amount > balance) {
            success = false; // withdrawal must fail when amount exceeds balance
            System.out.println("Withdrawal rejected: insufficient balance.");
        } else {
            balance -= amount;
            success = true;
        }

        if (success) {
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        }
    }

    double getBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account No: " + accountNo + " | Holder: " + accountHolderName + " | Balance: " + balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Sneha Kapoor", 1000.0);

        account.deposit(500.0);
        account.withdraw(300.0);
        account.withdraw(5000.0); // insufficient balance - should fail
        account.displayAccount();
    }
}
