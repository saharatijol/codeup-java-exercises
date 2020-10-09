public abstract class Accountant extends EmployeeAbstract {

    public Accountant(String name) {
        super (name, "Accounting");
    }

    public void doWork(){
        System.out.println("crunching numbers...");
    }

    public static void main(String[] args) {
        // Employee tim = new Employee("Tim", "Accounting"); // we can't instantiate bec we are inside an abstract class
        Employee cindy = new Employee("Cindy"); // we can't instantiate bec we are inside an abstract class


    }
}
