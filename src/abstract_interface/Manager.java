package abstract_interface;

public abstract class Manager extends Employee{
    public Manager (String name, String department) {
        super(name, department);
    }


    public void doWork() {
        System.out.println("holding meetings");
    }

}
