package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // While-Loop where we have a stopping inside while
        int count = 0;
        while (count != 6) {
            System.out.println("While Loop >> Count value is " + count);
            count++;
        }

        // For-Loop
        for(count = 1; count != 6; count++) {
            System.out.println("For-Loop >> Count value is " + count);
        }

        // While loop where we use break; to get out of the loop
        count = 1;
        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("While(true) >> Count value is " + count);
            count++;
        }

        // Do-While Loop
        count = 1;
        do {
            System.out.println("Do-While >> Count value was " + count);
            count++;
        } while (count != 6);
        System.out.println("===============================");
        count = 6;
        do {
            System.out.println("Do-While2 >> Count value was " + count);
            count++;
            if(count > 100) {
                break;
            }
        } while (count != 6);

        // Use of continue...
        int number = 4;
        int finishNumber = 20;
        int evenCounter = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenCounter++;
            if(evenCounter >= 5) {
                break;
            }
        }
        System.out.println("Even numbers found: " + evenCounter);
    }
        /*
        * ===== CHALLENGE =====
        * Create a method called isEvenNumber that takes a parameter of type int
        * Its purpose is to determine if the argument passed to the method is an even number or not
        * Return true if an even number, otherwise return false;
        *
        * Modify the while code above
        * MAke it also record the total number of even numbers it has found
        * and break once 5 are found
        * and at the end, display total number of even numbers found
        */

    public static boolean isEvenNumber (int number) {
        return number % 2 == 0;
    }
}
