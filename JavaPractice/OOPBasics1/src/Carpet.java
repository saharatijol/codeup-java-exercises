
public class Carpet {
    private double cost;

    public Carpet (double cost) {
        this.cost = cost < 0 ? 0 : cost; // used if before but ternary seemed better
    }

    public double getCost() {
        return this.cost;
    }
}
