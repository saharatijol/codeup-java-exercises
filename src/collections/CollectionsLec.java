package collections;

import java.util.ArrayList;

public class CollectionsLec {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("Sahara");
        System.out.println(names.size());

        names.add("Daniel");
        names.add("Kenneth");

        // To access indices within an Array List, you will need to use methods for that
        System.out.println("names.get(0) = " + names.get(0));
        //System.out.println("names.get(1) = " + names.get(1)); // there is space but there is no value occupying that space =>> Index out of bounds error
        System.out.println("names.indexOf(\"Kenneth\") = " + names.indexOf("Kenneth")); // -> will return an integer

        if (names.contains("Sahara")) {
            System.out.println("names.get(2) = " + names.get(2).toUpperCase());
        }


    }
}
