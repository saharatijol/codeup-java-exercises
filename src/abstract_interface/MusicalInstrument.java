package abstract_interface;

abstract class MusicalInstrument implements Playable {
    private String instrumentClassification;

    public MusicalInstrument(String instrumentClassification) {
        this.instrumentClassification = instrumentClassification;
    }

    public String getInstrumentClassification() {
        return this.instrumentClassification;
    }

    public void setInstrumentClassification(String instrumentClassification) {
        this.instrumentClassification = instrumentClassification;
    }
}
