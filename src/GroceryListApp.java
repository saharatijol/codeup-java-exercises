import util.Input;

import java.util.HashMap;

public class GroceryListApp {

    public static void main(String[] args) {

        HashMap<String, GroceryList> groceryItems = new HashMap<>();

        GroceryList produce = new GroceryList("Produce");
        produce.addItem("tomatoes");
        produce.addItem("banana");
        produce.addItem("garlic");
        produce.addItem("onion");
        produce.addItem("apples");
        groceryItems.put("Produce" ,produce);


        Input userInp = new Input();

        System.out.println("Welcome to Sahara's Corner Store!!");

        boolean createList = userInp.yesNo("Would you like to create a grocery list?");

        if (!createList) {
            System.out.println("Alright then... Next time..");
        } else {
            categoryUI();
            int userCategory = userInp.getInt("Select one (1-5): ");

            if(userCategory == 1) {
                System.out.println("Available items under Produce Section: ");
                for (String items : groceryItems.keySet()) {
                    System.out.println(items);
                }
            }
        }

    }

    public static void categoryUI () {
        System.out.println("Categories:\n" +
                            "1 - Produce\n" +
                            "2 - Meat\n" +
                            "3 - Personal Care\n" +
                            "4 - Cleaning\n" +
                            "5 - Beverages\n"
                            );
    }
}
