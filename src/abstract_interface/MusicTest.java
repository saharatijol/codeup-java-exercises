package abstract_interface;

public class MusicTest {

    public static void main(String[] args) {
//        Piano grandPiano = new Piano(88, "Grand Piano");
//
//        System.out.println(grandPiano.getNumberOfKeys());


        Tuneable whateverPiano;
        whateverPiano = new Piano (88, "Grand Piano");
        detuneRetune(whateverPiano);

        VolumeAdjustable whateverInstrument;
        whateverInstrument = new Sax (23, "Soprano");
        makeTwoStaccatoSounds(whateverInstrument);
    }

    public static void detuneRetune(Tuneable tuneableObj) {
        tuneableObj.detuneInstrument();
        tuneableObj.tuneInstrument();
    }

    public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
        va.volumeUp();
        va.volumeDown();
        va.volumeUp();
        va.volumeDown();
    }
}
