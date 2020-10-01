import java.util.Scanner;

public class ctrlStatementsExercise {
    public static void main(String[] args) {

        //======== 1. Loop Basics: While =========
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        //===== For Loop Refactor
        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }


        //===== Do-while: Part 1 =====
        int count = 0;
        do {
            System.out.println(count);
            count += 2;
        } while (count < 101);

        //===== For-Loop Refactor
        for (int count = 0; count <= 100; count += 2) {
            System.out.println(count);
        }

        //====== Do-while: Part 2 =====
        int count2 = 100;
        do {
            System.out.println(count2);
            count2 -= 5;
        } while (count2 >= -10);

        //===== For-Loop Refactor
        for (int count2 = 100; count2 >= -10; count2 -= 5) {
            System.out.println(count2);
        }

        //======= Do-while: Part 3 ======
        int count3 = 2;
        do {
            //count3 = count3 * count3;
            //System.out.println(square);
            System.out.println(count3);
            count3 = (int)Math.pow(count3, 2);
        }
        while (count3 < 1000000);

        //===== For-Loop Refactor
        for (int count3 = 2; count3 < 1000000; count3 = (int)Math.pow(count3, 2)) {
            System.out.println(count3);
        }

        //====== FizzBuzz: While loop =====
        int i = 1;
        while (i <= 100) {
            if (i % 5 == 0  && i % 3 == 0){
                System.out.println("FizzBuzz ");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz ");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz ");
            }
            else {
                System.out.println(i);
            }
            i++;
        }

        //======= FizzBuzz : For-loop =========
        for (int num = 1; num <= 100; num++) {
            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (num % 3 == 0) {
                System.out.println("Fizz ");
            }
            else if (num % 5 == 0) {
                System.out.println("Buzz ");
            }
            else {
                System.out.println(num);
            }
        }

        //======== Table of Powers ========
        Scanner scanner = new Scanner(System.in);
        String confirmation;

        do {

            System.out.println("What number would you like to go up to? ");
            int userInput = scanner.nextInt();
            System.out.println(userInput);

            System.out.println("Here's your table! \n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");

            for (int i = 1; i <= userInput; i++) {
                System.out.printf(" %-5d | %-7d | %-2d \n", i, i * i, i * i * i);
            }
            System.out.print("Do you still want to continue? (y/n): ");
            confirmation = scanner.next();
            scanner.nextLine();

        } while (confirmation.equals("y"));
        //System.out.println(confirmation);


        //===== Convert given number grades into letter grades =====
        int numGrade;
        String anotherGrade = "y";

        do {
            System.out.print("Enter numerical grade from 0 - 100: ");
            numGrade = scanner.nextInt();
            System.out.println("Grade entered is: " + numGrade);

            if (numGrade <= 100 && numGrade >= 88) {
                System.out.println("Your letter grade: A");
            } else if (numGrade <= 87 && numGrade >= 80) {
                System.out.println("Your letter grade: B");
            } else if (numGrade <= 79 && numGrade >= 67) {
                System.out.println("Your letter grade: C");
            } else if (numGrade <= 66 && numGrade >= 60) {
                System.out.println("Your letter grade: D");
            } else if (numGrade <= 59 && numGrade >= 0) {
                System.out.println("Your letter grade: F");
            } else {
                System.out.println("That is not a valid number! 1 - 100 please...");
            }
            System.out.println("Enter another grade?: (y/n) ");
            anotherGrade = scanner.next();

        } while (anotherGrade.equals("y"));
    }
}
