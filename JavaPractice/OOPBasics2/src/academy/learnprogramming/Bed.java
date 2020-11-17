package academy.learnprogramming;

public class Bed {
    private BedSet bedset;
    private int legs;
    private int pillows;
    private boolean isComfortable;

    public Bed(BedSet bedset, int legs, int pillows, boolean isComfortable) {
        this.bedset = bedset;
        this.legs = legs;
        this.pillows = pillows;
        this.isComfortable = isComfortable;
    }

    public BedSet getBedset() {
        return bedset;
    }

    public int getLegs() {
        return legs;
    }

    public int getPillows() {
        return pillows;
    }

    public boolean isComfortable() {
        return isComfortable;
    }
}
