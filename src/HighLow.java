import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(randomNumber());

        System.out.println(userPick(scanner));
    }

    public static int randomNumber() {
        return (int) Math.floor(Math.random() * 100 + 1);
    }

    public static String userPick(Scanner scanner) {
        System.out.println("Pick a number between 1 - 100: ");
        int userInput = parseInt(scanner.nextLine());
        if (userInput < 1 || userInput > 100) {
            return "Invalid number.. ";
        } else if (userInput > randomNumber()) {
            return "LOWER!";
        } else if (userInput < randomNumber()) {
            return "HIGHER!";
        } else if (userInput == randomNumber()) {
            return "GOOD GUESS";
        }
        return "Thanks for playing";
    }
}
