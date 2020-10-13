import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner  = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true) {
            //System.out.println("Enter number: ");

            boolean isInt = scanner.hasNextInt();
            if(isInt) {
                int userInput = scanner.nextInt();
                sum += userInput;
                counter++;
            } else {
                break;
            }
            scanner.nextLine(); // handle enter key
        }
        long avg = Math.round( (double)sum / counter );
        System.out.printf("SUM = %d AVG = %d", sum, avg);
    }
}
