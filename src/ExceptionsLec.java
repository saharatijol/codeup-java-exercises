import util.Input;

public class ExceptionsLec {
    static String hello;
    static String[] colors = {"red", "green", "blue", "yellow", "orange", "purple"};

    static void first() {
        System.out.println("Start First");
        second();
        System.out.println("Finish First");
    }

    static void second() {
        System.out.println("Start Second");
        try {
            dangerZone();
        } catch (BIOException bex) {
            bex.printStackTrace();
        }
        System.out.println("Finish Second");
    }

    static void dangerZone() throws BIOException{
        System.out.println("Start dangerZone");
        // danger code
//        try {
//            throw new BIOException();
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }
        if (Math.floor(Math.random() * 3) == 0) {
            throw new BIOException();
        }
        System.out.println("Finish dangerZone");
    }

    static String getColorHexValue(String colorName) {
        switch(colorName.toLowerCase()) {
            case "red":
                return "110000";
            case "green":
                return "001100";
            case "blue":
                return "000011";
            default:
                throw new IllegalArgumentException("Unknown Color"); // Creating Exceptions
                // or RuntimeException
        }
    }

    public static void main(String[] args) throws Exception{
        System.out.println("Hello World");
        first();
//        if (Math.floor(Math.random() * 3) == 0)
//        throw new Exception("A problem happened");
        System.out.println("Program Finished Successfully. Yay!!");
    }
}

class BIOException extends Exception {}
