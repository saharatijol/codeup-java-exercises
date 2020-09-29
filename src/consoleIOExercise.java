import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class consoleIOExercise {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f \n", pi);

        Scanner sc = new Scanner(System.in);

        // TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        System.out.println("Enter a number: ");
        int numEntered = sc.nextInt();
        System.out.printf("Number entered is: %d \n", numEntered);

        // What happens if you input something that is not an integer?
        // Error messages: Exceptions in thread "main" InputMismatch Exception

        // TODO: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Enter 3 words: ");
        String wordOne = sc.next();
        String wordTwo = sc.next();
        String wordThree = sc.next();
        System.out.printf("Your 3 words are: %s, %s, %s \n", wordOne, wordTwo, wordThree);

        // TODO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        sc.nextLine(); //this will be needed so that the next nextLine() will consume this and display the whole string
        System.out.println("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.printf("Here is my sentence: %s \n", sentence);

        // TODO: Prompt the user to enter values of length and width of a classroom at Codeup. Use the nextLine method to get user input and parse the resulting string to a numeric type.
        // -Assume that the rooms are perfect rectangles.
        // -Assume that the user will enter valid numeric data for length and width.

        System.out.println("Enter length and width of classroom: ");
        Scanner perimeter = new Scanner (System.in);

        // I added import static java.lang.Integer.parseInt for parseInt() to work
        int length = parseInt(perimeter.nextLine());
        int width = parseInt(perimeter.nextLine());

        int area;
        area = length * width;

        int myPerimeter;
        myPerimeter = (2 * (length + width));

        System.out.printf("Area of classroom is %s and it's perimeter is %s", area, myPerimeter);

        // TODO: BONUS =>


        //*------------- Perimeter Example Walk through -------------*//
//        System.out.println("Please enter length of classroom: ");
//        int length = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Please enter width of classroom: ");
//        int width = Integer.parseInt(sc.nextLine());
//
//        int area = length * width;
//        int perimeter = (2 * length) + (2 * width);
//
//        System.out.printf("The area is: %d\n", area);
//        System.out.printf("The perimeter is: %d\n", perimeter);








    }
}
