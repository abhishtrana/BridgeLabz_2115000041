import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public Account openAccount(Customer customer, double initialBalance) {
        Account account = new Account(this, customer, initialBalance);
        accounts.add(account);
        customer.addAccount(account);
        return account;
    }

    public String getName() {
        return name;
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}

class Account {
    private static int nextAccountNumber = 1001;
    private int accountNumber;
    private double balance;
    private Bank bank;
    private Customer customer;

    public Account(Bank bank, Customer customer, double initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.bank = bank;
        this.customer = customer;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Bank getBank() {
        return bank;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Account #" + accountNumber + " at " + bank.getName() + " with balance: $" + balance;
    }
}

public class AccountHolder {
    public static void main(String[] args) {
        Bank bank = new Bank("Global Bank");
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        bank.openAccount(customer1, 500.0);
        bank.openAccount(customer1, 1500.0);
        bank.openAccount(customer2, 250.0);

        customer1.viewBalance();
        customer2.viewBalance();
    }
}
