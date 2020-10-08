package movies;

public class Movie {
    private String name;
    private String category;

    // Constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Getters
    public String getMovieName() {
        return this.name;
    }
    public String getMovieCategory() {
        return this.category;
    }

    // Setters
    public void setMovieName() {
        this.name = name;
    }
    public void setMovieCategory() {
        this.category = category;
    }
}
