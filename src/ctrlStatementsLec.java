import java.util.Scanner;

public class ctrlStatementsLec {
    public static void main(String[] args) {
        System.out.println("Control Structures Lec");
        System.out.println("-----------------------");

        int operatorId = 8922;
        int operatorAge = 18;

        boolean isSignedIn = operatorId == 8922;

        //isSignedIn = operatorId == "8922"; // This cannot work bec you need to compare them of the same type

        System.out.println("isSignedIn = " + isSignedIn);

        boolean isTerminated = operatorId != 8922;
        System.out.println("isTerminated = " + isTerminated);

        boolean isMinor = operatorAge < 18;
        System.out.println("isMinor = " + isMinor);

        // Will work the same as above.
        isMinor = operatorAge <= 17;
        System.out.println("isMinor = " + isMinor);

        // Can they sell cigarettes or can they sell alcohol?
        boolean canSellTobacco = operatorAge > 17;
        System.out.println("canSellTobacco = " + canSellTobacco);

        boolean canSellAlcohol = operatorAge >= 21;
        System.out.println("canSellAlcohol = " + canSellAlcohol);

        // Using && operator
        boolean canProceed = isSignedIn && canSellAlcohol;
        System.out.println("canProceed = " + canProceed);

        canProceed = isSignedIn && canSellTobacco;
        System.out.println("Tobacco canProceed = " + canProceed);

        boolean isRestrictedCashier = !canSellAlcohol || !canSellTobacco;
        System.out.println("isRestrictedCashier = " + isRestrictedCashier);

        // String Comparison
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = scanner.next();

        // Don't do this!!!!!!!!!!!!!!!!!!!! Bec this will always evaluate to false even if you entered "y"
        //boolean confirmation = userInput == "y";

        // Do this instead, bec you are comparing
//        boolean confirmation = userInput.equals("y");
//        System.out.println("confirmation = " + confirmation);

        // Control Structures
        // If Statement
        isTerminated = true;
        isSignedIn = false;
        if (!isTerminated && isSignedIn) {
            // If true, run this code please!
            System.out.println("Start ringing items.");
        } else if (isTerminated) {
            System.out.println("Hasta la vista! You are terminated!");
        } else if (!isSignedIn) {
            System.out.println("You are not signed in. Please sign in.");
        }
        else {
            // If false, run this code please.
            System.out.println("Cannot compute!");
        }

        // Switch Statements
        int dayOfWeekNumber = 5;
        String dayOfWeek = "";

        switch (dayOfWeekNumber) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
        }

        System.out.println("Today is " + dayOfWeek);

        // While loop
        int i = 0;
        while (i <= 10) {
            System.out.println("While loop: i: " + i);
            i++;
        }

        // Do-While Loop
        int counter = 0;
        do {
            System.out.println("Do while loop: counter: " + counter);
            counter++;
        } while (counter <= 0);

        // For-Loop
        for (int x = 0; x < 10; x++) {
            System.out.println("For-Loop >> The value of x: " + x);
        }

        // Break and Continue
        for (int a = 0; a <= 10; a++) {
            if (a % 2 == 1) {
                continue;
            } else if (a > 5) {
                break;
            }
            System.out.println("a = " + a);
        }
        System.out.println("Finished");
    }
}
