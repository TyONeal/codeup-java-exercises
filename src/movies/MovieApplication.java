package movies;
import util.Input;

import java.util.Arrays;




public class MovieApplication {

   public static Input menuInput = new Input();

    public static void main(String[] args) {
        while(true) {
            System.out.println("What would you like to do? \n\n 0 - Exit \n 1 - View All Movies \n 2 - View Movies in Drama Category \n 3 - View Movies in Horror Category \n 4 - View Movies in Musical Category \n 5 - View Movies in Sci-Fi Category \n 6 - View Movies in Comedy Category");
            menuInput.clearScanner();
           int response = menuInput.getInt();
            if (response == 0) {
                break;
            } else if (response == 1) {
                System.out.println(Arrays.toString(MoviesArray.findAll()));
            } else if (response == 2) {
               for (Movie movie : MoviesArray.findAll()) {
                   if(movie.getMovieCategory().equals("drama")){
                       System.out.println(movie.getMovieName());
                   }
               }
            } else if (response == 3) {
                for (Movie movie : MoviesArray.findAll()) {
                    if(movie.getMovieCategory().equals("horror")){
                        System.out.println(movie.getMovieName());
                    }
                }
            } else if (response == 4) {
                for (Movie movie : MoviesArray.findAll()) {
                    if(movie.getMovieCategory().equals("musical")) {
                        System.out.println(movie.getMovieName());
                    }
                }
            } else if (response == 5) {
                for (Movie movie : MoviesArray.findAll()) {
                    if(movie.getMovieCategory().equals("scifi")) {
                        System.out.println(movie.getMovieName());
                    }
                }
            } else if (response == 6) {
                for (Movie movie : MoviesArray.findAll()) {
                    if(movie.getMovieCategory().equals("comedy")) {
                        System.out.println(movie.getMovieName());
                    }
                }
            }
        }

        System.out.println("Would you like to add a movie?");
        menuInput.clearScanner();
        String addResponse = menuInput.getString();
            while(true) {
                if (addResponse.equalsIgnoreCase("yes")) {
                    String name = "";
                    String category = "";
                    Movie[] updatedMovieArray = new Movie[MoviesArray.findAll().length + 1];
                    Movie newMovie = new Movie(name, category);


                    for(int i = 1; i < MoviesArray.findAll().length; i++) {
                        updatedMovieArray[i] = MoviesArray.findAll()[i];
                    }
                    updatedMovieArray[updatedMovieArray.length - 1] = newMovie.addMovie();
                    break;



                } else if (addResponse.equalsIgnoreCase("no")) {
                    System.out.println("Thanks, and have a nice day!");
                    break;
                } else {
                    break;
                }
            }
    }

}
