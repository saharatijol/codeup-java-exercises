package abstract_interface;

public class Manager extends Employee{

    public Manager (String name, String department) {
        super(name, department);
    }

    public Manager (String name) {
        super(name, "Management");
    }


    public void doWork() {
        System.out.println("holding meetings");
    }

}
