import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {

    // TODO: Change println to return values in methods
    // TODO: Have the println in your main method instead

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        addition(5, 5);
//        subtraction(10, 5);
//        multiplication(7,  5);
//        multiplication2(7, 5);
//        division(24, 5);
//        modulus(7,3);
        getInteger(1, 10);

        //factorial();
        // #3 Factorial Problem
        while(true){
            System.out.println("factorial() = " + factorial());
            System.out.println("Do you want to continue? y/n");
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Ok, goodbye!");
                break;
            }
        }
        // #4 Dice Roll Problem
        rollDice(scan);
    }

    // 1. Basic Arithmetic
    public static void addition(int a, int b) {
        int add = a + b;
        System.out.println("Addition method: " + add);
    }

    public static void subtraction(int c, int d) {
        int subtract = c - d;
        System.out.println("Subtraction method: " + subtract);
    }

    public static void multiplication(int e, int f) {
        int product = e * f;
        System.out.println("Multiplication method: " + product);
    }

    //==== BONUS: Multiplication Method ====//
    public static void multiplication2(int e, int f) {
        int count  = 0;
        for (int i = 1; i <= f ; i++) {
            count = count + e;
        }
        System.out.println("Multiplication2 w/o '*' operator: " + count);
    }

    public static void division(int g, int h) {
        int quotient = g / h;
        System.out.println("Division method: " + quotient);
    }

    public static void modulus(int i, int j) {
        int mods = i % j;
        System.out.println("Modulus method: " + mods);
    }
    // Food for thought: if divided by 0, we get an error



    // 2. Validate User Input if within range
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("Input is invalid. Try again...");
            return userInput = getInteger(1, 10);
        } else {
            System.out.println("Thanks!!");
            return userInput;
        }
    }

    // Using recursion on #2
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Give me a number between " + min + " and  " + max + ": ");
//        int userInput = Integer.parseInt(scanner.nextLine());
//
//        if (userInput < min) {
//            System.out.println("This number is lower than " + min);
//            return getInteger(min, max);
//        } else if (userInput > max) {
//            System.out.println("This number is bigger than " + max);
//            return getInteger(min, max);
//        }
//        System.out.println("Thanks!!!");
//        return userInput;
//    }

    // Overloading getInteger() method
    public static int getInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();

        if (userInput <  1 || userInput > 10) {
            System.out.println("Input is invalid. Try again...");
            return userInput = getInteger();
        } else {
            return userInput;
        }
    }

    // 3. Calculate factorial
//    public static long factorial() {
//        String tryAgain = "y";
//        long result;
//
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter an integer between 1 and 10: ");
//            long userInput = scanner.nextInt();
//            System.out.println("User entered: " + userInput);
//
//            if (userInput < 1 || userInput > 10) {
//                System.out.println("Invalid input.... Try again...");
//                return factorial();
//            }
//            else {
//                result = 1;
//
//                for (int i = 1; i <= userInput; i++) {
//                    result = result * i;
//                }
//
//                System.out.printf("Factorial of %d is %d \n", userInput, result);
//                System.out.print("Do you want to continue (y/n): ");
//                tryAgain = scanner.next();
//            }
//
//        } while(tryAgain.equals("y"));
//        return result;
//    }

    // #3 Walk through solution
    public static long factorial() {
        int userInput = getInteger(1, 10);
        long output = 1;
        for (int counter = 1; counter <= userInput; counter++) {
            output *= counter;
        }
        return output;
    }

    // 4. Dice Rolling
    public static void randomize (short sides) {
        System.out.println( (int) Math.floor(Math.random() * sides + 1) );
        System.out.println( (int) Math.floor(Math.random() * sides + 1) );
    }

    public static void rollDice(Scanner scan){
        int counter = 0;
        while (true) {
            counter++;
            System.out.println("Roll Dice method");
            System.out.println("Number of sides: ");
            short sides = Short.parseShort(scan.nextLine());
            randomize(sides);
            System.out.println("Do you want to continue? y/n");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Ok, goodbye, you played " + counter + " times");
                break;
            }
        }
    }
}
