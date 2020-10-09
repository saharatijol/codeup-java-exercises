package abstract_interface;

class Developer extends Employee{
    public Developer (String name, String department) {
        super(name, "Development");
    }

    public Developer (String name) {
        super(name, "Development");
    }

    public String work() {
        return "writing code";
    }
}
