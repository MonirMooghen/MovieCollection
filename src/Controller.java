//import java.util.ArrayList;
public class Controller {
//controller constructor. opretter hvad en vi putter ind i den. så moviecollection.
//controlleren uddelelegerer videre til moviecollection. den er mellemmand mellem main og resten


//User story # 3
//As a movie enthusiast, I want my movie collection to have dynamic sizing so that
// I don’t have an upper limit of movies that can be stored in the collection.

    MovieCollection myFirstCollection; //slettet "private"
    public Controller() {
        myFirstCollection = new MovieCollection();
    }

    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        myFirstCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
    }

    //User story # 4
    //As a movie enthusiast I want to see a list of all movies so that I can get an overview of my collection.
    public void filmList() { //så den kan kalde den henne i main metoden
        myFirstCollection.filmList();
    }

    //User story #5
    public void searchMovie(String title) {
        myFirstCollection.searchMovie(title);
    }
}