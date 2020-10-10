
// Curriculum notes:


// *** How to define class that inherits from another class using "extends" keyword
public class Employee extends Person2 {
    private double salary;


    public Employee(String employeeName) {
        super(employeeName);
    }


    // Inheritance Demo
//    public static void main(String[] args) {
//        Employee john = new Employee("John");
//        john.sayHello();
//        System.out.println(john.name);
//    }

    // Extending Classes
    public void doWork() {
        System.out.println("Work, work...");
    }

    // Method Overriding
    public void sayHello() {
        System.out.println("How can I help you?");
    }

    // Access Modifiers
//    public String getName() {
//        return this.name;
//    }

    // An ERROR because its a private defined field
//    public int getAge() {
//        return this.age;
//    }

    public static void main(String[] args) {
        // Call to Demo Extending classes
        Person2 p = new Person2("john");
        Employee e = new Employee("tom");
        e.sayHello();
        e.doWork();

        // Calling to Demo Method Overriding
        Person2 p2 = new Person2("peter");
        Employee e2 = new Employee("peter");
        p2.sayHello();
        e2.sayHello();



    }

}


