package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("" +
                "0 - exit\n" +
                "1 - view all movies \n" +
                "2 - view movies in the animated category \n" +
                "3 - view all movies in the drama category \n" +
                "4 - view all movies in the horror category \n" +
                "5 - view all movies sci-fi category \n");

        Input optionsInput = new Input();
        int [] options = {1, 2, 3, 4, 5};
        int userChoice = optionsInput.getInt("Enter your choice: ");


    }
}
