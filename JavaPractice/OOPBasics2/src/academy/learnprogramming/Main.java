package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        Dimensions dimensions = new Dimensions(20,20,5);
//        Resolution nativeResolution = new Resolution(2540, 1440);
//	    Case theCase = new Case("220B", "Dell", "240", dimensions);
//
//	    Monitor theMonitor = new Monitor("27inch", "Acer", 27, nativeResolution);
//	    Motherboard theMotherboard = new Motherboard("BK-200", "Asus", 4, 6, "v2.44");
//
//	    // Demonstrates Composition: we have a class called PC that HAS A CASE theCase, HAS A MONITOR monitor, HAS A MOTHERBOARD motherboard
//	    PC thePC = new PC(theCase, theMonitor, theMotherboard);
//	    thePC.powerUp();

//		Wall wall1 = new Wall("West");
//		Wall wall2 = new Wall("East");
//		Wall wall3 = new Wall("South");
//		Wall wall4 = new Wall("North");
//
//		Ceiling ceiling = new Ceiling(12, 55);
//		Bed bed = new Bed("Modern", 4,3,2,1);
//		Lamp lamp = new Lamp("Classic", false, 75);
//
//		Bedroom bedRoom = new Bedroom("Sara", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
//		bedRoom.makeBed();
//		bedRoom.getLamp().turnOn();

        // NOT Encapsulation
		Player player1 = new Player();
		player1.name = "Sahara";
		player1.health = 20;
		player1.weapon = "Sword";

		int damage = 10;
		player1.loseHealth(damage);
		System.out.println("Remaining health for Player1= " + player1.healthRemaining());

		damage = 11;
		player1.loseHealth(damage);
		System.out.println("Remaining health for Player1 = " + player1.healthRemaining());

		// YES Encapsulation
        EnhancedPlayer player2 = new EnhancedPlayer("Sara", 200, "Sword");
        System.out.println("Initial health for Player2 is " + player2.getHealth());
    }
}
