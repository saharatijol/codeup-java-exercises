public class VipCustomer {
    private String name;
    private double credit_limit;
    private String email;

    public VipCustomer() {
        this("unknown", "basic@email.com", 0.00);
    }

    public VipCustomer(String name, String email) {
        this(name, email, 0.00);
    }

    public VipCustomer(String name, String email, double credit_limit) {
        this.name = name;
        this.email = email;
        this.credit_limit = credit_limit;
    }

    public String getName() {
        return name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }
}
