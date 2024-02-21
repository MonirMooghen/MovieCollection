import java.util.ArrayList;
public class MovieCollection {


    // <Movie> kalder min klasse Movie.java
    ArrayList<Movie> films = new ArrayList<>();

    //private Movie[] movieList;
    int count ;

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
        Movie movie = new Movie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
        films.add(movie);

    }


}