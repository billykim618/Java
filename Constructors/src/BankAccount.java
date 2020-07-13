public class BankAccount {
    public BankAccount() {
        this(12345, 0, "Default Name",
                "123-456-7890", "johndoe@email.com");

        System.out.println("Instance was created without any constructors");
    }

    public BankAccount(int accountNumber, double balance, String customerName,
                       String phoneNumber, String email) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.customerEmail = email;

        System.out.println("Instance was created with acct # and name");
    }

    private int accountNumber;
    private double balance;
    private String customerName;
    private String phoneNumber;
    private String customerEmail;

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("New balance: $" + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0)
            System.out.println("Insufficient funds. You tried to withdraw $" + amount +
                    ", but only $" + this.balance + " available.");
        else {
            this.balance -= amount;
            System.out.println("You deposited $" + amount + ". Remaining balance: $" + this.balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
