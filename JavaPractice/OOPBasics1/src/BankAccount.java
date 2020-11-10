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
    // Create 2 additional methods
    // 1. allow customer to deposit funds
    // 2. allow customer to withdraw
    // don't allow withdrawal if insufficient funds
}
