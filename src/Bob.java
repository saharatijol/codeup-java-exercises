import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String askAgain = "y";

        do {
            System.out.println();
            System.out.println("Ask Bob something: ");
            String askedBob = scanner.nextLine();
            //System.out.println(askedBob);
            //System.out.println(askedBob.lastIndexOf('?') != -1);

            if (askedBob.lastIndexOf('?') != -1) {
                System.out.println("Sure");
            } else if (askedBob.lastIndexOf('!') != -1) {
                System.out.println("Whoa, chill out!!");
            } else if (askedBob.equals("")) {
                System.out.println("Fine! Be that way.");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Still want to talk to Bob? (y/n) ");
            askAgain = scanner.nextLine();
            //System.out.println();
        } while (askAgain.equals("y"));
        System.out.println("Ok. Bye!!");
    }
}
