public class Person2  {
//    public String name;

    // Access Modifiers
//    protected String name;
//    private int age;

    // super Keyword
    private String name;

    public Person2 (String name) {
        this.name = name;
    }

    // super Keyword
    public String getName() {
        return name;
    }

//    // Inheritance Demo
//    public void sayHello() {
//        System.out.println("Hello from " + name + "!"); // example 1
//    }

//    // Extending Classes Demo
//    public void sayHello() {
//        System.out.println("Hello, World!");
//    }

    // Overriding Demo
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}
