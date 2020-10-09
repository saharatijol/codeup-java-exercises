package abstract_interface;

abstract class Employee extends Person implements Worker {
    protected String name;
    protected String department;

    public Employee(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    @Override
    public void sayHello() {
        System.out.printf("Hello my name is %s. I work in %s\n", this.getName(), this.getDepartment());
    }
    public abstract String work();
}