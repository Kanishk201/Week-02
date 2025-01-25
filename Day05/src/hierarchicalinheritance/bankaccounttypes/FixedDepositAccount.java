package hierarchicalinheritance.bankaccounttypes;

class FixedDepositAccount extends BankAccount {
    int depositTerm; // Term in months

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance); // Call superclass constructor
        this.depositTerm = depositTerm;
    }

    // Method to display account type and details
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayAccountDetails();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}
