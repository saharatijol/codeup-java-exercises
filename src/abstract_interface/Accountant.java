package abstract_interface;

public class Accountant extends Employee{

    public Accountant(String name, String department) {
        super (name, department);
    }

//    public Accountant(String name) {
//        super (name, "Accounting");
//    }

    public void doWork(){
        System.out.println("crunching numbers...");
    }



}

