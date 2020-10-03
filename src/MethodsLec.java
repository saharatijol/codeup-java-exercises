import java.util.Scanner;

public class MethodsLec {
    public static void main(String[] args) {
        System.out.println( sayHello("Sara") );
        System.out.println( sum(1, 2) );

        printer( sayHello("Fer") );
        printer( sum(3, 4)) ;

        //"sahara".lastIndexOf("s"); Check how this one worked

        printer(45);
        printer("ana");
        printer("csv:", "cols, rows", 4);

        count(3);

        System.out.println("getPower(2, 3) = " + getPower(2, 3));

        yesNo();
    }

    // Recursive Methods/Recursion
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return; // this says return nothing, look at this as if its a break out of loop
        }
        System.out.println(n);
        count(n - 1);
    }

    public static boolean yesNo() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Menu options....");
        System.out.println("Do you want to continue? Yes/no");

        if(scan.nextLine().equalsIgnoreCase("yes")) {
            return yesNo();
        } else {
            System.out.println("Ok.. Goodbye..");
            return false;
        }
    }


    // For-Loop
//    public static long getPower(int base, int exponent) {
//        long result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result = result * base;
//        }
//        return result;
//    }

    // Recursion
    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }


    public static boolean checkInkLevels() {
        return true;
    }

    public static void printer(String data) { // void does not return anything, just do an action. IT does not care for return values or types
        checkInkLevels();
        System.out.println("printing strings... = " + data);
    }
    // Overloading the printer method
    public static void printer(int data) {
        System.out.println("printing numbers..." + data);
    }

    public static void printer(String prefix, String data, int numberOfCopies) {
        System.out.println(prefix + " printing strings with a prefix... = " + data + " printing " + numberOfCopies + " copies.");
    }

    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

//    public static returnType methodName([param1[, param2[, ...]]) {
//        // the statements of the method
//        // a return statement, if a return type is declared
//    }

}
