package hierarchicalinheritance.bankaccounttypes;

public class AccountHierarchy {
    public static void main(String[] args) {
        // Create objects for each account type
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 5000.0, 3.5);
        CheckingAccount checkingAccount = new CheckingAccount("CA67890", 2000.0, 1000.0);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD11223", 10000.0, 12);

        // Display details for each account type
        System.out.println("Savings Account Details:");
        savingsAccount.displayAccountType();
        System.out.println("\nChecking Account Details:");
        checkingAccount.displayAccountType();
        System.out.println("\nFixed Deposit Account Details:");
        fixedDepositAccount.displayAccountType();
    }
}