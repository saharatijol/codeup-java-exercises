package academy.learnprogramming;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        // Only accept these values
        if(tonerLevel > -1 && tonerLevel <= 100 ) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int fillUpToner(int currLevel) {
        if(currLevel > 0 && currLevel <= 100) {
            if(this.tonerLevel + currLevel > 100) {
                return -1;
            }
            this.tonerLevel += currLevel;
            return this.tonerLevel;
        } else {
            return -1;
        }

    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
