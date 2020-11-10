
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if ((this.age < 0) || (this.age > 100)) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return ((this.age > 12) && (this.age < 20));
    }

    public String getFullName() {
        if ((this.firstName == null) && (this.lastName == null)) {
            return " ";
        } else if (this.firstName == null) {
            return String.format("%s", this.lastName);
        } else if (this.lastName == null) {
            return String.format("%s", this.firstName);
        } else {
            return String.format("%s %s", this.firstName, this.lastName);
        }
    }
}
