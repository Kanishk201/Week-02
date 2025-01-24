import java.util.ArrayList;

class Bank {
    private String name;
    private ArrayList<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void openAccount(Customer customer, double initialBalance) {
        Account newAccount = new Account(this, customer, initialBalance);
        accounts.add(newAccount);
        customer.addAccount(newAccount);
        System.out.println("Account opened successfully for " + customer.getName() + " in " + name + " Bank.");
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}

// Customer Class
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account account : accounts) {
            System.out.println("Account ID: " + account.getId() + " | Balance: $" + account.getBalance());
        }
    }
}

// Account Class
class Account {
    private static int idCounter = 1;
    private int id;
    private Bank bank;
    private Customer customer;
    private double balance;

    public Account(Bank bank, Customer customer, double initialBalance) {
        this.id = idCounter++;
        this.bank = bank;
        this.customer = customer;
        this.balance = initialBalance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to Account ID: " + id);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Account ID: " + id);
        } else {
            System.out.println("Insufficient funds in Account ID: " + id);
        }
    }
}

public class BankAndCustomer {
    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank.openAccount(customer1, 500.00);
        bank.openAccount(customer1, 1500.00);
        bank.openAccount(customer2, 1000.00);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}
