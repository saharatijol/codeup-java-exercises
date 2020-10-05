package oopLecture;

import org.w3c.dom.ls.LSOutput;

public class Dish {
    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;

    public void printSummary () {
        System.out.printf(" Cost: %s cents \n Name: %s \n Recommended: %b", costInCents, nameOfDish, wouldRecommend);
    }

    public static void sayHowdy() {
        System.out.println("Howdy!");
    }

    public static void main(String[] args) {
        System.out.println(Math.PI);
        Math.random();
//
//        Dish d = new Dish();
//        Dish.printSummary();
//        Dish.sayHowdy();
    }
}
