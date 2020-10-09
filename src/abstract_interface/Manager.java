package abstract_interface;

class Manager extends Employee{
    public Manager (String name, String department) {
        super(name, "Management");
    }

    public String work() {
        return "holding meetings";
    }

}
