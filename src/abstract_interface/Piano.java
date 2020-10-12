package abstract_interface;

public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable {

    private int numberOfKeys;

    public Piano (int numberOfKeys, String instrumentClassification) {
        super(instrumentClassification);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public void setNumberOfKeys() {
        this.numberOfKeys = numberOfKeys;
    }

    @Override
    public void startMusic() {
        System.out.println("Fur Elise");
    }

    @Override
    public void stopMusic() {
        System.out.println("You sound tired... Take a break");
    }

    @Override
    public void volumeUp() {
        System.out.println("Play mezzo-forte");
    }

    @Override
    public void volumeDown() {
        System.out.println("Play mezzo-piano");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Sounds off-key... Please tune it, my ears are bleeding..");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Kill the piano, yup... ");
    }
}
