package academy.learnprogramming;

// Demonstrates Composition: we have a class called PC that HAS A CASE theCase, HAS A MONITOR monitor, HAS A MOTHERBOARD motherboard
// Advantage: if we use standard extend to inherit, you can only inherit from one class at a time.
// PC comprises of three other classes we created.
public class PC {
    private Case theCase;
    private Monitor monitors;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitors, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitors.drawPixelAt(1200, 50, "yellow");
    }


}
