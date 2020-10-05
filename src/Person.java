public class Person {
    private String name;

    public String getName() {
        // TODO: return person's name
        return name;
    }

    public void setName(String name) {
        // TODO: change the name property to the passed value
        this.name = name;
    }

    public void sayHello() {
        // TODO: print a message to the console using person's name
        System.out.println("Hello, " + this.name);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        //sayHello(person1.name);

    }
}
