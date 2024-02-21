import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //User story #1
    // Lav MovieCollection objekt
    // MovieCollection firstCollection = new MovieCollection();

    //User story #2:
    // As a movie enthusiast, I want to see a menu on the screen so that I can choose between
    // 1) creation of a new movie in my movie collection and 2) exit from the program
        Controller myFirstCollection = new Controller();


    int SENTINEL = 2;
    int menuInput = 0;

        while (menuInput != SENTINEL) {
            System.out.println("Welcome to your movie collection");
            System.out.println("1. Create a new movie");
            System.out.println("2. Exit");
            menuInput = input.nextInt();

            if (menuInput == 1) {

                // Tilføj film til MovieCollection
                System.out.println("Enter movie title:");
                String title = input.nextLine();

                //dummy bug
                input.nextLine();

                System.out.println("Enter movie director:");
                String director = input.nextLine();

                System.out.println("Enter year created:");
                int yearCreated = input.nextInt();

                System.out.println("Is the movie in color? Enter True/False");
                boolean isInColor = input.nextBoolean();

                System.out.println("Enter duration of movie in minutes:");
                int lengthInMinutes = input.nextInt();

                //dummy bug
                input.nextLine();

                System.out.println("Enter movie genre:");
                String genre = input.nextLine();


                myFirstCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

                //ArrayList<Movie> test1 = myFirstCollection.getFilms();
                System.out.println(title + " er blevet tilføjet til listen");
            } else {
                System.out.println("The program has ended");
            }
        }
    }
}