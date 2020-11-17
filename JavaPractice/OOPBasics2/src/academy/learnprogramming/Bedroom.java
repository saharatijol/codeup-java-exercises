package academy.learnprogramming;

public class Bedroom {
    private Lights light;
    private Bed bed;
    private Dresser dresser;

    public Bedroom(Lights light, Bed bed, Dresser dresser) {
        this.light = light;
        this.bed = bed;
        this.dresser = dresser;
    }

    public void makeBed() {
        bed.getBedset().grabSheets();
        turnOnLights();
    }

    private void turnOnLights(){
        light.turnOn();
    }
}
