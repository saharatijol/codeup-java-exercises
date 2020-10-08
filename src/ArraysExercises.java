import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        // 1.
        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers); // This references its spot in memory
        System.out.println(Arrays.toString(numbers)); // Prints it to console

        Person[] persons = new Person[3];
        persons[0] = new Person("Jimi");
        persons[1] = new Person("Joe");
        persons[2] = new Person("Steve");

        for (Person person : persons) {
            System.out.println(person.getName());
        }

        // Initialize the new person
        Person newPerson = new Person("BB King");
        addPerson(persons, newPerson);

    }

    public static void addPerson(Person[] persons, Person addPerson) {
        Person [] copyPerson = Arrays.copyOf(persons, persons.length + 1);

        copyPerson[copyPerson.length - 1] = addPerson;
        System.out.println("=== Copy of Person object that holds an array w/ added person ===");

        for (Person addedPerson: copyPerson) {
            System.out.println(addedPerson.getName());
        }
    }

//    public static Person[] addPerson (Person[] originalArray, Person personToAdd) {
//        Person[] newArray = Arrays.copyOf(originalArray, originalArray.length + 1);
//        return newArray;
//    }
}
