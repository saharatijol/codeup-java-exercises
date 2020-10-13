import java.util.ArrayList;

public class GroceryList {
    private String name;
    private ArrayList<String> groceryList;

    // Constructor
    public GroceryList (String name) {
        this.name = name;
        this.groceryList = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addItem (String item) {
        this.groceryList.add(item);
    }

    public int getQuantity() {
        return this.groceryList.size();
    }
}
