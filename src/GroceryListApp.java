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

        GroceryList meats = new GroceryList("Meat");
        meats.addItem("chicken");
        meats.addItem("beef");
        meats.addItem("turkey");
        meats.addItem("lamb");
        meats.addItem("pork");
        groceryItems.put("Meats" ,meats);

        GroceryList personalCare = new GroceryList("Personal Care");
        personalCare.addItem("shampoo");
        personalCare.addItem("soap");
        personalCare.addItem("lotion");
        personalCare.addItem("toothpaste");
        personalCare.addItem("deodorant");
        groceryItems.put("Personal Care" ,personalCare);

        GroceryList cleaners = new GroceryList("Cleaners");
        cleaners.addItem("detergent");
        cleaners.addItem("dishwashing soap");
        cleaners.addItem("floor solution");
        cleaners.addItem("sponge");
        cleaners.addItem("windex");
        groceryItems.put("Cleaners" ,cleaners);

        GroceryList beverages = new GroceryList("Beverages");
        beverages.addItem("soda pop");
        beverages.addItem("orange juice");
        beverages.addItem("coffee");
        beverages.addItem("tea");
        beverages.addItem("water");
        groceryItems.put("Beverages" ,beverages);


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
