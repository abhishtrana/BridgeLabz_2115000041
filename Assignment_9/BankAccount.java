class BankAccount {
    private static String bankName = "ABC Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; // Final variable
        totalAccounts++; // Increment total accounts
    }

    // Static method to get total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    // Method to display account details (with instanceof check)
    public void displayAccountDetails(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount account = (BankAccount) obj;
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + account.accountHolderName);
            System.out.println("Account Number: " + account.accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("John Doe", 1001);
        BankAccount acc2 = new BankAccount("Jane Smith", 1002);

        acc1.displayAccountDetails(acc1);
        acc2.displayAccountDetails(acc2);

        BankAccount.getTotalAccounts();
    }
}
