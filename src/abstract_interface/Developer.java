package abstract_interface;

public class Developer extends Employee {

    public Developer (String name, String department) {
        super(name, department);
    }

    public Developer (String name) {
        super(name, "Development");
    }

    public void doWork() {
        System.out.println("typing some code.....");
    }
}
