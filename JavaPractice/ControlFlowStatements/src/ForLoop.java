public class ForLoop {

<<<<<<< HEAD
    /*
     * Create a for-loop using any range of number
     * Determine if the number is a prime number using the isPrime method
     * If it is a prime number, print it out AND increment a count of the number of prime numbers found
     * If that count is 3, exit the for loop
     * HINT: Use the break; statement to exit
     */
=======
        /*
         *=========- CHALLENGE =========
         * Create a for-loop using any range of number
         * Determine if the number is a prime number using the isPrime method
         * If it is a prime number, print it out AND increment a count of the number of prime numbers found
         * If that count is 3, exit the for loop
         * HINT: Use the break; statement to exit
         */
>>>>>>> 1f297721900aa89268b118c89cf46d41fa9275eb

    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            System.out.println("Looping " + i); // Loop check
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
<<<<<<< HEAD

=======
>>>>>>> 1f297721900aa89268b118c89cf46d41fa9275eb
}
