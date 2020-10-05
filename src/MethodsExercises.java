import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        addition(5, 5);
//        subtraction(10, 5);
//        multiplication(7,  5);
//        multiplication2(7, 5);
//        division(24, 5);
//        modulus(7,3);
//        getInteger(1, 10);

        factorial();
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
            return userInput;
        }
    }

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
    public static long factorial() {
        String tryAgain = "y";
        long result;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer between 1 and 10: ");
            long userInput = scanner.nextInt();
            System.out.println("User entered: " + userInput);

            if (userInput < 1 || userInput > 10) {
                System.out.println("Invalid input.... Try again...");
                return factorial();
            }
            else {
                result = 1;

                for (int i = 1; i <= userInput; i++) {
                    result = result * i;
                }

                System.out.printf("Factorial of %d is %d \n", userInput, result);
                System.out.print("Do you want to continue (y/n): ");
                tryAgain = scanner.next();
            }

        } while(tryAgain.equals("y"));
        return result;
    }

    // 4. Dice Rolling


}
