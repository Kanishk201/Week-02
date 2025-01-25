package hierarchicalinheritance.bankaccounttypes;

class CheckingAccount extends BankAccount {
    double withdrawalLimit; // Daily withdrawal limit

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Call superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }

    // Method to display account type and details
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayAccountDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit + " per day");
    }
}
