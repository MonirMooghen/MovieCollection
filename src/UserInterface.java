import java.util.Scanner;
import java.util.ArrayList;

//User story #7
public class UserInterface {
    Controller myFirstCollection = new Controller();
    public void startProgram() {
    Scanner input = new Scanner(System.in);

    final int SENTINEL = 2;
    int menuInput = 0;
    String title; //added title så den overwriter de andre title-værdier og kan søge i searchMovie

    //Hardcodede værdier
    myFirstCollection.addMovie("Interstellar","Christopher Nolan",2014,true,201,"SciFi");
    myFirstCollection.addMovie("Harry Potter 1","JKR",2014,true,201,"Fantasy");
    myFirstCollection.addMovie("Harry Potter 2","JKR",2020,true,201,"Fantasy");

    while(menuInput !=SENTINEL) {
    System.out.println("Welcome to your movie collection");
    System.out.println("1. Create a new movie");
    System.out.println("2. Exit");
    System.out.println("3. View list of movies");
    System.out.println("4. Search for movie");
        System.out.println("5. Edit movie"); // ikke færdig
    menuInput = input.nextInt();
    input.nextLine();

    if (menuInput == 1) {
        // Tilføj film til MovieCollection
        addMovieMethod(); //metodekald til at oprette film
    }
    else if (menuInput == 3) { //User story #4
        myFirstCollection.filmList();
    }
    else if (menuInput == 4) { //User story #5
        System.out.println("Search for movie title: ");
        title = input.nextLine();
        myFirstCollection.searchMovies(title);

    } else if (menuInput == 5) {
        System.out.println("Choose the movie you want to edit.");

    } else {
        System.out.println("The program has ended");
    }
}
}
public void addMovieMethod() {
    //String title; //added title så den overwriter de andre title-værdier og kan søge i searchMovie
    Scanner input = new Scanner(System.in);
    //Controller myFirstCollection = new Controller(); Skal ikke være med, ellers laver den en ny controller instans.
    // Det var min fejl, så den ikke ville lagre eller søge i de film jeg tilføjede

    System.out.println("Enter movie title:");
    String title = input.nextLine(); //added "String" skal måske debugges igen

    System.out.println("Enter movie director:");
    String director = input.nextLine();

    System.out.println("Enter year created:");
    int yearCreated = input.nextInt();
    input.nextLine();

    //Ændret fra boolean true/false input
    boolean isInColor = false;
    System.out.println("Is the movie in color? Write Yes/No");
    String erIFarve = input.next();
    erIFarve = erIFarve.toLowerCase();
    if (erIFarve.equals("yes")) {
        isInColor = true;
    }

    System.out.println("Enter duration of movie in minutes:");
    int lengthInMinutes = input.nextInt();

    //dummy bug
    input.nextLine();

    System.out.println("Enter movie genre:");
    String genre = input.nextLine();

    myFirstCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
}
}