import java.util.Scanner;

public class consoleIOLec {
    public static void main(String[] args) {
        System.out.println("/==== Console IO Lecture ====/");

//        System.out.print("here");
//        System.out.print("there ");
//
//        System.out.print("here\n");
//        System.out.print("there\n");
//
//        System.out.println("Hello" + " " + "World");
//
//        System.out.printf("Hello ");
//        System.out.printf("World\n");
//
//        String name = "World";
//        System.out.printf("Hello %s\n", name);

        // printf and %s is a placeholder, it's good use for formatting string concatenation
        String myName = "Douglas";
        System.out.printf("Hello %s\n", myName);
        System.out.printf("Hello %S\n", myName); //All Caps

        //
        int number = 4;
        String typeOfPet = "cats";
        System.out.printf("I have %d %s.", number, typeOfPet);
        //System.out.printf("I have %s %s.", number, typeOfPet);
        //*Note** It's the same result %s vs %d but %d is better practice bec its more explicit that you are referring to a number

        double dollars = 10;
        System.out.printf("The cost of a typical drink is $%.2f. \n", dollars);
        //2f chops off the default decimal places(10.123456) to 10.12

        //What about input?
        Scanner sc = new Scanner(System.in);

//        System.out.println("Please enter your first name.");
//        String firstName = sc.next();
//        System.out.printf("Hello, %s!\n", firstName);

//        System.out.println("Please enter your full name.");
//        String firstName = sc.next();
//        String middleName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("Hello, %s %s %s!\n", firstName, middleName, lastName);

//        System.out.println("How old are you?");
//        int age = sc.nextInt();
//        System.out.printf("You are %s years old. Wow!", age);

        // Wait.. I want a whole line! How do I that?
        System.out.println("What is your favorite quote?");
        String quote = sc.nextLine();
        System.out.printf("Wow!! \"%s\" is a great quote.\n", quote);
        // \"%s\" puts a quote inside a string. #Escape Sequences


    }
}
