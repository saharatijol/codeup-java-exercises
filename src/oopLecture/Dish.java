package oopLecture;

public class Dish {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary () {
        System.out.printf(" Cost: %s cents \n Name: %s \n Recommended: %b", costInCents, nameOfDish, wouldRecommend);
    }
}
