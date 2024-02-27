import java.util.ArrayList;
public class MovieCollection {
    // <Movie> kalder min klasse Movie.java
    ArrayList<Movie> films = new ArrayList<>();

    //private Movie[] movieList;
    //int count ;
    public void addMovie(String title, String director, int yearCreated,
                         boolean isInColor, int lenghtInMinutes, String genre) {
        Movie movie = new Movie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
        films.add(movie);
        System.out.println(movie.toString());

    }

    // User story # 4
    //As a movie enthusiast I want to see a list of all movies so that I can get an overview of my collection.
    public void filmList() {
        for (Movie moviePrintOut : films) {
            System.out.println(moviePrintOut.toString());
        }

    }

    // User story #5
    public void searchMovie(String title) {
        boolean found = false;

        for (Movie searchingMovie : films) {
            if (searchingMovie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Following movies fit your search criteria: ");
                System.out.println(searchingMovie.toString());
                found = true;
            }
        }
        if (!found) { //tilføjet så sout kun printes hvis filmen ikke er der, og ikke ved hver iteration
            System.out.println("No movies fit your search criteria");
        }
    }
}