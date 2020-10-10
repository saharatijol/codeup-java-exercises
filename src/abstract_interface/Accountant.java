package abstract_interface;

public abstract class Accountant extends Employee{

    public Accountant(String name) {
        super (name, "Accounting");
    }

    public void doWork(){
        System.out.println("crunching numbers...");
    }

}

