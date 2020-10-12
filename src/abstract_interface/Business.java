package abstract_interface;


public class Business {
    public static void main(String[] args) {
        Employee[] employees = {
                new Developer("Mike"),
                new Manager("Anne"),
                new Accountant("Cindy", "Accounting")
        };

        for (Employee e : employees) {
            e.sayHello();
            e.doWork();
        }
    }
//     class -> extends
//     interface -> implements
//     abstract method cannot have implementation, must be overridden
//     abstract class cannot be instantiated, must be extended
}
