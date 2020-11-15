public class Sedan extends Car{

    private int seats;
    private int year;

    public Sedan(int seats, int year) {
        super(4, 6, 85);
        this.seats = seats;
        this.year = year;
    }
}
