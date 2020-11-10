public class BankAccount {

    private long account_no;
    private double balance;
    private String customer_name;
    private String email;
    private long phone_no;

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
    public double deposit(double money) {
        return money + this.balance;
    }

    public double withdraw(double money) {
        if (this.balance < 0) {
            return -1;
        } else {
            return this.balance - money;
        }
    }
}
