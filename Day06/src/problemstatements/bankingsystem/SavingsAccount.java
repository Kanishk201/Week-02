package problemstatements.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; // 4%

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for Savings Account: " + getAccountNumber());
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3; // Loan eligibility is 3x the balance
    }
}
