package oopLecture;

public class DishTools {
    // AVG Cost of Dish in cents
    public static final int avgCost = 13000;

    //shoutDishName()
    public static void shoutDishName(Dish dish1) {
        System.out.println(dish1.nameOfDish.toUpperCase());
    }

    // analyzeDishCost
    public static String analyzeDishCost(Dish dish1) {
        if (dish1.costInCents > avgCost ) {
            return "More expensive that average";
        } else {
            return "Less expensive than average";
        }
    }

    //flipRecommendation
    public static boolean flipRecommendation(Dish dish1) {
        return (!(dish1.wouldRecommend));
    }


}
