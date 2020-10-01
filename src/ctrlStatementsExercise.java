import java.util.Scanner;

public class ctrlStatementsExercise {
    public static void main(String[] args) {

        // 1. Loop Basics: While
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//
//         // Do-while: Part 1
//        int count = 0;
//        do {
//            System.out.println(count);
//            count += 2;
//        } while (count < 101);
//
//        // Do-while: Part 2
//        int count2 = 100;
//        do {
//            System.out.println(count2);
//            count2 -= 5;
//        } while (count2 >= -10);

        // Do-while: Part 3
//        int count3 = 2;
//        do {
//            int square = (int)Math.pow(count3, 2);
//            //System.out.println(square);
//            count3 = square;
//            System.out.println(count3);
//        }
//        while (count3 < 1000000);

        // FizzBuzz: While loop
//        int i = 1;
//        while (i <= 100) {
//            if (i % 5 == 0  && i % 3 == 0){
//                System.out.println("FizzBuzz ");
//            }
//            else if (i % 3 == 0) {
//                System.out.println("Fizz ");
//            }
//            else if (i % 5 == 0) {
//                System.out.println("Buzz ");
//            }
//            else {
//                System.out.println(i);
//            }
//            i++;
//        }

        // FizzBuzz : For-loop
//        for (int num = 1; num <= 100; num++) {
//            if (num % 5 == 0 && num % 3 == 0) {
//                System.out.println("FizzBuzz");
//            }
//            else if (num % 3 == 0) {
//                System.out.println("Fizz ");
//            }
//            else if (num % 5 == 0) {
//                System.out.println("Buzz ");
//            }
//            else {
//                System.out.println(num);
//            }
//        }

        // Table of Powers
        String confirmation;
        do {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to? ");
        int userInput = scanner.nextInt();
        System.out.println(userInput);

        System.out.println("Here's your table! \n");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (int i = 1; i <= userInput; i++) {
            System.out.printf(" %-5d | %-7d | %-2d \n", i, i*i, i*i*i);
            }
            System.out.print("Do you still want to continue? (y/n)");
            confirmation = scanner.next();
             scanner.nextLine();
        } while (confirmation.equals("y"));
        //System.out.println(confirmation);

        
    }


}
