public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Bio!");
//        System.out.print("Hello,");
//        System.out.print(" Bio!");
//        System.out.println(); //puts a newline


        // TODO: Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber;
        myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        // TODO: Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString;
        myString = "another day";
        System.out.println(myString);

        // TODO: Change your code to assign a character value to myString. What do you notice?
        myString = "h"; // result will be different if you did 'h' bec this is a character
        System.out.println(myString);

        // TODO: Change your code to assign the value 3.14159 to myString. What happens? // --Incompatible types
        //myString = 3.14159;
        //System.out.println(myString);

        // TODO: Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens? --variable myNumber might not have been initialized
        long myNumber;
        //myNumber = ;
        //System.out.println(myNumber);

        // TODO: Change your code to assign the value 3.14 to myNumber. What do you notice? --possible lossy conversion from double to long
        //myNumber = 3.14;
        //System.out.println(myNumber);

        // TODO: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        myNumber = 123L;
        System.out.println(myNumber);

        // TODO: Change your code to assign the value 123 to myNumber. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does? --long is also a form of integer, 3.14 is a double type
        // Longs can only hold integers
        myNumber = 123;
        System.out.println(myNumber);

        // TODO: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this? --lossy conversion from double to float
//        float myNumber2;
//        myNumber2 = 3.14;
//        System.out.println(myNumber2);

        // TODO: Copy and paste the following code blocks one at a time and execute them
        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int x2 = 5;
        System.out.println(++x2);
        System.out.println(x2);

        /* x is executed the value first before the operation where x2 is executing the operation first then spits out the value afterwards*/

        // TODO: Try to create a variable named class. What happens? --java: not a statement
//        int class;
//        class = 1;
//        System.out.println(class);

        // TODO: Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run? --Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        //	at HelloWorld.main(HelloWorld.java:68)
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three"; // java: incompatible types: java.lang.String cannot be converted to int

        // TODO: Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x = x + 5;
//        System.out.println(x);
    }
}


