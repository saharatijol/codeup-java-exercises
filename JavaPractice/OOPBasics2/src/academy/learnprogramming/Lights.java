package academy.learnprogramming;

public class Lights {
    private int countLights;
    private boolean isOn;
    private String color;

    public Lights(int countLights, boolean isOn, String color) {
        this.countLights = countLights;
        this.isOn = isOn;
        this.color = color;
    }

    public void turnOn() {
        System.out.println("Lights are on..");
    }

    public int getCountLights() {
        return countLights;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getColor() {
        return color;
    }
}
