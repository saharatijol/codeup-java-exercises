import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true; // Flag

        while(true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();
                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }

            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("Min = " + min + " , Max = " + max);
        scanner.close();
    }
}
