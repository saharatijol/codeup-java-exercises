public class PolymorphismDemo {

    public static String doWork(EmployeePolyMorph e) {
        return e.work();
    }

    public static void main(String[] args) {
        EmployeePolyMorph one = new EmployeePolyMorph();
        EmployeePolyMorph two = new Manager();

        System.out.println(doWork(one)); // Filling out TPS reports
        System.out.println(doWork(two)); // Managing employees
    }
}
