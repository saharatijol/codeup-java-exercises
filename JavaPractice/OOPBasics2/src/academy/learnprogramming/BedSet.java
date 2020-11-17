package academy.learnprogramming;

public class BedSet {
    private int size;
    private int sleepsPeople;
    private String sheetSet;

    public BedSet(int size, int sleepsPeople, String sheetSet) {
        this.size = size;
        this.sleepsPeople = sleepsPeople;
        this.sheetSet = sheetSet;
    }

    public void grabSheets() {
        System.out.println("Grab the sheets..");
    }

    public int getSize() {
        return size;
    }

    public int getSleepsPeople() {
        return sleepsPeople;
    }

    public String getSheetSet() {
        return sheetSet;
    }
}
