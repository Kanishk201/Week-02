package problemstatements.bankingsystem;

interface Loanable {
    void applyForLoan();

    double calculateLoanEligibility();
}