class BankAccount1 {
    // Attributes
    public final String accountNumber;  
    protected String accountHolder;
    private double balance;   
    private static String BankName = "Apna Bank"; 
    private static int totalCount = 0;    

    // Constructor
    public BankAccount1(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalCount++;
    }

    //Method to display total count
     static int getTotalAccounts(){
        return totalCount;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to set the balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        if(this instanceof BankAccount1){
        System.out.println("Bank Name : " + BankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println();
        }else{
            System.out.println("This is not the instace of the class ");
        }
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount1 {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsAccountDetails() {
       if (this instanceof SavingsAccount){
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);  
        System.out.println("Account Holder: " + accountHolder);  
        System.out.println("Interest Rate: " + interestRate + "%");
    System.out.println();
}
        else{
            System.out.println("this is not the instace of the class");
        }
    }
}

// Main class for testing
public class BankAccount {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount1 account = new BankAccount1("123456789", "Alice", 1000.0);
        System.out.println("Bank Account Details:");
        account.displayAccountDetails();

        // Modify and access balance
        account.setBalance(1500.0);
        System.out.println("\nUpdated Balance: $" + account.getBalance());
        account.displayAccountDetails();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Bob", 2000.0, 3.5);
        savingsAccount.displaySavingsAccountDetails();
        savingsAccount.displayAccountDetails();

        System.out.println("The total number of accounts is : "+ savingsAccount.getTotalAccounts());

        
    }
}