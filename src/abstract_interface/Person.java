package abstract_interface;

public class Person {
    private String name;

    public Person(String personName) {
        this.name = personName;
    }

    public String getName() {
        // TODO: return person's name
        return this.name;
    }

    public void setName(String name) {
        // TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
        // TODO: print a message to the console using person's name
        System.out.println("Hello, my name is " + this.name);
    }

    public static void main(String[] args) {
//        Person person1 = new Person("Michael");
//        Person person2 = new Person("Michael");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println("person1 = " + person1);
//        System.out.println("person2 = " + person2);
//        System.out.println(person1 == person2);
//        System.out.println("person1.name = " + person1.getName());
//        System.out.println("person2.name = " + person2.getName());
//        System.out.println(person1.getName() == person2.getName());

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("Cory");
        Person person2 = person1;
        System.out.println(person1.getName()); // Cory
        System.out.println(person2.getName()); // Cory
        person2.setName("Jane");
        System.out.println(person1.getName()); // Jane
        System.out.println(person2.getName()); // Jane

//        Person bob = new Person("Bob"); // Person object
//        System.out.println("bob's name = " + bob.getName());
//        bob.setName("Mando");
//        bob.sayHello();
    }
}
