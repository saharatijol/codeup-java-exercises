public abstract class EmployeeAbstract extends PersonAbstract{
    protected String department;

    public EmployeeAbstract(String name, String dept) {
        super(name);
        this.department = dept;
    }

    public String getDepartment() {
        return this.department;
    }

    public abstract void doWork(); // abstract method cannot have a body
}
