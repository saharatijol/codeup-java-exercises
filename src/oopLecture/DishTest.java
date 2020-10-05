package oopLecture;

public class DishTest {

    public static void main(String[] args) {

        Dish dish1 = new Dish ();
        dish1.costInCents = 75;
        dish1.nameOfDish = "Smashed Potaters";
        dish1.wouldRecommend = true;

        dish1.printSummary();
    }
}
