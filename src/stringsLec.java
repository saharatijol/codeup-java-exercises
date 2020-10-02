import java.util.Scanner;

public class stringsLec {
    public static void main (String[] args) {
        String message = "Hello";
        System.out.println(message);
        message = message + " World!";
        System.out.println(message);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();

        // Don't do this!
        //boolean confirmation = userInput == "y";


        // DON'T DO THIS
//        if ("I am a string" == "I am a string") {
//            System.out.println("Strings are equal");
//        }

        // Do this instead!
        if ("I am a string".equals("I am a string")) {
            System.out.println("Strings are equal");
        }

        String input = "Codeup Rocks!";

        input.equals("codeup rocks!"); // false
        input.equals("Codeup Rocks!"); // true

        input.equalsIgnoreCase("codeup rocks!"); // true
        input.equalsIgnoreCase("Codeup Rocks!"); // true

        input.startsWith("codeup"); // false
        input.startsWith("Codeup"); // true

        input.endsWith("rocks"); // false
        input.endsWith("rocks!"); // false
        input.endsWith("Rocks!"); // true
        // System.out.println(input.endsWith("Rocks!"));

        // Example: char charAt(int index)
        String str_Sample = "RockStars";
        System.out.println("My string sample is 'RockStars'");
        System.out.println("Character at position 5: " + str_Sample.charAt(5));

        // Example: int indexOf(String subString) only checks for first instance
        System.out.println("Index of character 'r': " + str_Sample.indexOf('r'));

        // Example: int lastIndexOf(String subString)
        System.out.println("Last index of character 's': " + str_Sample.lastIndexOf('s'));

        // Example: int length()
        System.out.println("Length of string RockStars: " + str_Sample.length());

        // Example: String replace(String pattern, String replacement)
        System.out.println("Replace 'Rock' with 'Duke': " + str_Sample.replace("Rock", " Duke"));

        // Example: String substring(int beginIndex[, int endIndex])
        String longStr = "A quick brown fox jumps over the lazy dog"; //ox jumps over the lazy dog
        System.out.println();
        System.out.println("Example string: " + longStr);
        System.out.println("Substring starting from index 15: ");
        System.out.println(longStr.substring(15));
        System.out.println();

        // Example: String toLowerCase()
        System.out.println("My string sample is 'RockStars'");
        System.out.println("Using toLowerCase() method: " + str_Sample.toLowerCase());

        // Example: String toUpperCase()
        System.out.println("Using toUpperCase() method: " + str_Sample.toUpperCase());
        System.out.println();

        // Example: String trim()
        String longerStr = "A quick      brown fox jumps    over the      lazy dog      "; //ox jumps over the lazy dog
        System.out.println("Example string with trailing spaces: " + longerStr);
        System.out.println("Using trim() method: " + longerStr.trim());
    }
}
