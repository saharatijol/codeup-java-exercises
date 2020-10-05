package oopLecture;

public class Person {
    public String firstName = "Unknown";
    public String lastName;
    public String password;
    public int age;

    public String sayHello() { // This is what you call "Instance Method"
        return lastName + ", " + firstName + " says, hi!";
    }

    public static void main(String[] args) {
//        Person rick = new Person(); // This is how you create a new instance of a class using "new" keyword, this is how you create a bew object
//        System.out.println(rick); // generates a reference ID to point where it exists in memory. Run: Person@2c8d66b2
//        System.out.println(rick.firstName);
//        System.out.println(rick.age);
//        rick.firstName = "Rick"; // if it has "." notation, this is called a "Field"
//        rick.lastName = "Smith";
//        System.out.println(rick.firstName);
//        System.out.println(rick.lastName);

//        Person person1 = new Person();
//        Person person2 = new Person();
//
//        person1.firstName = "Bob";
//        person2.firstName = "Bob";
//        System.out.println(rick.sayHello());
//
//        Person ada = new Person();
//        ada.firstName = "Ada";
//        ada.lastName = "Lovelace";
//
//        Person grace = new Person();
//        grace.firstName = "Grace";
//        grace.lastName = "Hopper";
//
//        System.out.println(ada.sayHello());   // "Hello from Ada Lovelace!"
//        System.out.println(grace.sayHello()); // "Hello from Grace Hopper!"
    }
}

