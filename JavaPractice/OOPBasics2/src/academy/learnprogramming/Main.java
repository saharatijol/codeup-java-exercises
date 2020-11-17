package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Resolution nativeResolution = new Resolution(2540, 1440);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);

	    Monitor theMonitor = new Monitor("27inch", "Acer", 27, nativeResolution);
	    Motherboard theMotherboard = new Motherboard("BK-200", "Asus", 4, 6, "v2.44");

	    // Demonstrates Composition: we have a class called PC that HAS A CASE theCase, HAS A MONITOR monitor, HAS A MOTHERBOARD motherboard
	    PC thePC = new PC(theCase, theMonitor, theMotherboard);
	    thePC.powerUp();
    }
}
