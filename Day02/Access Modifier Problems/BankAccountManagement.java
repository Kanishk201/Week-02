// Base class: BankAccount
class BankAccount {
    public String accountNumber; // Public member
    protected String accountHolder; // Protected member
    private double balance; // Private member

    // Constructor for BankAccount
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Interest rate in percentage

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); // Call the superclass constructor
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public void calculateInterest() {
        double interest = getBalance() * (interestRate / 100);
        System.out.println("Calculated Interest: $" + interest);
    }

    // Method to display SavingsAccount details
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessing public member
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to test the functionality
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount bankAccount = new BankAccount("123456789", "Alice", 5000.0);
        System.out.println("Bank Account Details:");
        bankAccount.displayDetails();

        // Deposit and withdraw money
        bankAccount.deposit(1000.0);
        bankAccount.withdraw(1500.0);
        System.out.println("\nUpdated Bank Account Details:");
        bankAccount.displayDetails();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Bob", 10000.0, 3.5);
        System.out.println("\nSavings Account Details:");
        savingsAccount.displaySavingsAccountDetails();

        // Calculate interest
        savingsAccount.calculateInterest();
    }
}