package abstract_interface;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
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
}
