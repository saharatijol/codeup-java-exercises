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
        dangerZone();
        System.out.println("Finish Second");
    }

    static void dangerZone() {
        System.out.println("Start dangerZone");
        // danger code
        try {
            System.out.println("Tenth color is: " + colors[9]); // ArrayIndexOutOfBoundsException
            int numHello = new Integer("hello"); // NumberFormatException
            // Below another NumberFormatException
            Input input = new Input();
            int nameInt = input.getInt("Please enter your name: ");
            System.out.println("nameInt = " + nameInt);
            int num = 1 / 0; // ArithmeticException

            // NullPointerException
            if (hello.equals("hello")) {
                System.out.println("Hello!");
            }

            for (String color : colors) {
                System.out.printf("Hex value of color %s is %s\n", color, getColorHexValue(color));
            }
        } catch (ArrayIndexOutOfBoundsException aibex) {
            System.out.println("ArrayIndexOutOfBounds Exception");
            System.out.println(aibex.getMessage());
        } catch (NumberFormatException nfex) {
            System.out.println("Number Format Exception");
            System.out.println(nfex.getMessage());
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
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
        //first();
        if (Math.floor(Math.random() * 3) == 0)
        throw new Exception("A problem happened");
        System.out.println("Program Finished Successfully. Yay!!");
    }
}

class BIOException extends Exception {}
