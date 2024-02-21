import java.util.ArrayList;

public class Controller {
//User story # 3
//As a movie enthusiast, I want my movie collection to have dynamic sizing so that
// I don’t have an upper limit of movies that can be stored in the collection.

    private MovieCollection myFirstCollection;
    public Controller() {
    myFirstCollection = new MovieCollection();
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
        myFirstCollection.addMovie(title, director, yearCreated, isInColor, lenghtInMinutes, genre);
    }
}
