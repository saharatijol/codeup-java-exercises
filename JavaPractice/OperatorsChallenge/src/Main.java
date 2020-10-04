public class Main {
    public static void main(String[] args) {
        /*
         * 1. Create a double variable with a value of 20.00
         * 2. Create a second variable of type double with value 80.00
         * 3. Add both numbers together and multiply by 100.00
         * 4. Use the remainder operator to figure out what the remainder from the result of the operation in step 3 and 40.00
         * 5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, false if its NOT zero
         * 6. Output the boolean variable
         * 7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true. Don't be surprised if you see output for this step, where you might expect it to show
         * */

        double myDouble1 = 20.00;
        double myDouble2 = 80.00;
        double addDoubles = ((myDouble1 + myDouble2) * 100);
        System.out.println("Total = " + addDoubles);

        double remainder = addDoubles % 40.00; // Change this
        System.out.println("Remainder: " + remainder);

        boolean isZero = (remainder == 0) ? true : false;
        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
