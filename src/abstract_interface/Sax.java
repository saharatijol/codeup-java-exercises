package abstract_interface;

public class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable {
    private int saxType;

    public Sax (int saxType, String instrumentClassification) {
        super(instrumentClassification);
        this.saxType = saxType;
    }

    public int getSaxType() {
        return this.saxType;
    }

    public void setSaxType() {
        this.saxType = saxType;
    }

    @Override
    public void startMusic() {
        System.out.println("some sexy Kenny Roger tune.... yum..");
    }

    @Override
    public void stopMusic() {
        System.out.println("uuhhmm... that's not Kenny Roger... ugh");
    }

    @Override
    public void volumeUp() {
        System.out.println("Crescendo....");
    }

    @Override
    public void volumeDown() {
        System.out.println("Decrescendo....");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("It sounds off key, tune it");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Standard tuning is overrated... Change it");
    }
}
