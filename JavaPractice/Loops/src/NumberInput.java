import java.util.Scanner;

public class NumberInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        int sum = 0;

        while (i <= 10) {
            System.out.printf("Enter number #%d:\n", i);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int userInput = scanner.nextInt();
                sum += userInput;
                i++;
            } else {
                System.out.println("Invalid Number");
                scanner.nextLine(); // handle nextLine character
            }
        }
        System.out.println(sum);
    }
}
