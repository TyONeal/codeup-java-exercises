package movies;
import java.util.Scanner;

public class Movie {
    private String name;
    private String category;

    private static Scanner scan = new Scanner(System.in);

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getMovieName() {

        return name;
    }

    public void setMovieName(String newName) {
        this.name = newName;
    }

    public String getMovieCategory() {
        return category;
    }

    public void setMovieCategory(String newCategory) {
        this.category = newCategory;
    }

    public Movie addMovie() {
        System.out.println("Let's add a movie!");
        Movie newMovie = new Movie(name, category);
        System.out.println("Start by entering the Movie's name:");
        newMovie.setMovieName(scan.nextLine());
        System.out.println("Now let's give it a category:");
        newMovie.setMovieCategory(scan.next());
        return newMovie;
    }
}
