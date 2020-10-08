package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        boolean again = false;
        do {
            DisplayUI();
            Input optionsInput = new Input();
            int option = optionsInput.getInt("Enter your choice: ");
            displayUserSelection(option);

            Input choice = new Input();
            again = choice.yesNo("Do you want to continue? y/n");
        } while(again);
        System.out.println("Alright!! Goodbye!!");
    }

    public static void DisplayUI() {
        System.out.println("What would you like to do?");
        System.out.println("" +
                "0 - exit\n" +
                "1 - view all movies \n" +
                "2 - view movies in the animated category \n" +
                "3 - view all movies in the drama category \n" +
                "4 - view all movies in the horror category \n" +
                "5 - view all movies sci-fi category \n" +
                "6 - view all movies in musical\n");
    }

    public static void displayUserSelection(int option) {
        switch(option) {
            case 0:
                System.out.println("GoodBye!");
                System.exit(0);
                break;
            case 1:
                DisplaySelectedMovies("all");
                break;
            case 2:
                DisplaySelectedMovies("animated");
                break;
            case 3:
                DisplaySelectedMovies("drama");
                break;
            case 4:
                DisplaySelectedMovies("horror");
                break;
            case 5:
                DisplaySelectedMovies("scifi");
                break;
            case 6:
                DisplaySelectedMovies("musical");
                break;
            default:
                System.out.println("That is not an option.... Again");
        }
    }

    public static void DisplaySelectedMovies(String selectedCategory) {
        Movie[] moviesList = MoviesArray.findAll();
        if(selectedCategory.equals("all")) {
            for(Movie movie : moviesList) {
                System.out.printf("title: %-34s |   category: %s\n", movie.getMovieName(), movie.getMovieCategory());
            }
        } else {
            for(Movie movie : moviesList) {
                if(movie.getMovieCategory().equals(selectedCategory)) {
                    System.out.printf("title: %-34s |   category: %s\n", movie.getMovieName(), movie.getMovieCategory());
                }
            }
        }
    }
}
