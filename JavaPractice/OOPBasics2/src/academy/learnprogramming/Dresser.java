package academy.learnprogramming;

public class Dresser {
    private int numDrawers;
    private boolean isMirror;
    private int length;
    private int width;

    public Dresser(int numDrawers, boolean isMirror, int length, int width) {
        this.numDrawers = numDrawers;
        this.isMirror = isMirror;
        this.length = length;
        this.width = width;
    }

    public int getNumDrawers() {
        return numDrawers;
    }

    public boolean isMirror() {
        return isMirror;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
