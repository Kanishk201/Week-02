package hierarchicalinheritance.bankaccounttypes;

class SavingsAccount extends BankAccount {
     double interestRate; // Annual interest rate in percentage

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Call superclass constructor
        this.interestRate = interestRate;
    }

    // Method to display account type and details
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

