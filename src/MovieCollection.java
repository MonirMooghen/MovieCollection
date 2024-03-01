import java.lang.reflect.Array;
import java.util.ArrayList;
public class MovieCollection {
    // <Movie> kalder min klasse Movie.java
    ArrayList<Movie> films = new ArrayList<>();

    //private Movie[] movieList;
    //int count ;
    public void addMovie(String title, String director, int yearCreated,
                         boolean isInColor, int lengthInMinutes, String genre) {
        Movie movie = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        films.add(movie);
        System.out.println(movie.toString());
    }

    // User story # 4
    //As a movie enthusiast I want to see a list of all movies so that I can get an overview of my collection.
    public void filmList() { //laver liste
        for (Movie moviePrintOut : films) {
            System.out.println(moviePrintOut.toString());
        }
    }

    // User story #5 og #6 - search option
    //public void searchMovie(String title) {
    public ArrayList<Movie> searchMovies(String title){ //Ny metode så den er en ArrayList i stedet
    ArrayList<Movie> searchMatchList = new ArrayList<>();
        for (Movie movie : films) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
            searchMatchList.add(movie);
            }
        } return searchMatchList;
    }

    //User story #8 - edit option - ikke færdig
    public String editMovie(int index, int attribute, String str){
        Movie movie = films.get(index);
        if (attribute == 1) {
            movie.setTitle(str);
        }
        else if (attribute == 3){
            movie.setYear(Integer.parseInt(str));
        }
        return movie.toString();
    }
}