public class Account {

    private long account_no;
    private double balance;
    private String customer_name;
    private String email;
    private long phone_no;

    // Constructor w/o parameter
    public Account() {
        this(766453758, 0.00, "Unknown", "Default email", 0000000);
        //System.out.println("Empty constructor called");
    }

    // Overloaded Constructor w/ parameters
    public Account(long account_no, double balance, String customer_name, String email, long phone_no) {
        System.out.println("Account constructor with parameters called");
        this.account_no = account_no;
        this.balance = balance;
        this.customer_name = customer_name;
        this.email = email;
        this.phone_no = phone_no;
    }

    // Another Constructor
    public Account(String customer_name, String email, long phone_no) {
        this(99999, 100.55, customer_name, email, phone_no);
    }

    // Create getters and setters for each field
    // Getters
    public long getAccount_no() {
        return this.account_no;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomer_name() {
        return this.customer_name;
    }
    public String getEmail() {
        return this.email;
    }
    public long getPhone_no() {
        return this.phone_no;
    }

    // Setters
    public void setAccount_no(long account_no) {
        this.account_no = account_no;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }

    // Create 2 additional methods
    // 1. allow customer to deposit funds
    // 2. allow customer to withdraw
    // don't allow withdrawal if insufficient funds
    public void deposit(double depositAmt) {
        this.balance += depositAmt;
        System.out.println("Deposit of $" + depositAmt + " made. New balance: $" + this.balance);
    }

    public void withdrawal(double withdrawalAmt) {
        if (this.balance - withdrawalAmt < 0) {
            System.out.println("Insufficient funds. Only $" + this.balance + " available. Withdrawal not processed" );
        } else {
            this.balance -= withdrawalAmt;
            System.out.println("Withdrawal of $" + withdrawalAmt + " processed. Remaining balance: $" + this.balance);
        }
    }
}
