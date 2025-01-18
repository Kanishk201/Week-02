class BankAccount {
    
String accountHolder;
private String accountNumber;
private double balance;

public BankAccount(String accountHolder, String accountNumber, double balance) {
this.accountHolder = accountHolder;
this.accountNumber = accountNumber;
this.balance = balance;
}

// Method to deposit money 
public void deposit(double amount) {
if (amount > 0) {
balance += amount;
System.out.println("Deposited: " + amount);
} else {
System.out.println("Invalid deposit amount!");
}
}

// Method to withdraw money 
public void withdraw(double amount) {
if (amount > 0 && amount <= balance) {
balance -= amount;
System.out.println("Withdrawn: $" + amount);
} else if (amount > balance) {
System.out.println("Insufficient balance!");
} else {
System.out.println("Invalid withdrawal amount!");
}
}

// Method to display the current balance
public void displayBalance() {
System.out.println("Current Balance: $" + balance);
}

public static void main(String[] args) {

BankAccount account = new BankAccount("John", "123456789", 1000.00);

// Display initial balance
account.displayBalance();

// Deposit money
account.deposit(500.00);

// Withdraw money
account.withdraw(300.00);

account.withdraw(1500.00);

// Display balance
account.displayBalance();
}
}
