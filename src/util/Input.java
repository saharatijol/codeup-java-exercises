package util;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Type a string: ");
        String typedString = scanner.nextLine();
        return typedString;
    }

    public boolean yesNo() {
        System.out.println("yey or nay?: ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yey") || choice.startsWith("y")) {
            return true;
        } else if (choice.equalsIgnoreCase("nay") || choice.startsWith("n")) {
            return false;
        } else {
            System.out.println("What is that? That's not an option.. Again");
            return yesNo();
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y")) {
            return true;
        } else if (choice.equalsIgnoreCase("no") || choice.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("What is that? That's not an option.. Again");
            return yesNo(prompt);
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter number between %d and %d: ", min, max);
        int guessNum = parseInt(scanner.nextLine());
        if (guessNum > max) {
            System.out.println("You're above range.. Again ");
            return getInt(min, max);
        } else if (guessNum < min) {
            System.out.println("You're below range.. Again");
            return getInt(min, max);
        } else {
            System.out.println("You are within range.. Next");
            return guessNum;
        }
    }

    public int getInt() {
        System.out.println("Give me number: ");
        int number = parseInt(scanner.nextLine());
        return number;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter number between %s and %s: ", min, max);
        double guessDouble = parseDouble(scanner.nextLine());
        if (guessDouble > max) {
            System.out.println("You're ABOVE range.. Again ");
            return getDouble(min, max);
        } else if (guessDouble < min) {
            System.out.println("You're BELOW range.. Again");
            return getDouble(min, max);
        } else {
            System.out.println("You WITHIN range... Next");
            return guessDouble;
        }

    }

    public double getDouble() {
        System.out.println("Enter a number with decimal: ");
        double numDouble = parseDouble(scanner.nextLine());
        return numDouble;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double numDouble = parseDouble(scanner.nextLine());
        return numDouble;
    }

//    public static void main(String[] args) {
//        Input input1 = new Input ();
//        System.out.println(input1.getString());
//        System.out.println(input1.yesNo());
//        System.out.println(input1.getInt(1, 10));
//        System.out.println(input1.getInt());
//        System.out.println(input1.getDouble(1.0, 10.5));
//        System.out.println(input1.getDouble());
//
//    }
}
