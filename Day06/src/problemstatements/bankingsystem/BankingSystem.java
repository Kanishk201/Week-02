package problemstatements.bankingsystem;

public class BankingSystem {
    public static void main(String[] args) {
        // Create a list of bank accounts
        BankAccount[] accounts = new BankAccount[] {
                new SavingsAccount("SA001", "Alice", 5000),
                new CurrentAccount("CA001", "Bob", 10000)
        };

        // Process and display account details
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan();
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }

            System.out.println("-----------------------");
        }

        // Demonstrating deposit and withdrawal
        accounts[0].deposit(1000);
        accounts[0].withdraw(2000);
        accounts[1].withdraw(500);
    }
}
