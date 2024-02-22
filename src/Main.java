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


    final int SENTINEL = 2;
    int menuInput = 0;
    String title; //added title så den overwriter de andre title-værdier og kan søge i searchMovie

        while (menuInput != SENTINEL) {
            System.out.println("Welcome to your movie collection");
            System.out.println("1. Create a new movie");
            System.out.println("2. Exit");
            System.out.println("3. View list of movies");
            System.out.println("4. Search for movie");
            menuInput = input.nextInt();

            if (menuInput == 1) {

                // Tilføj film til MovieCollection
                //dummy bug
                input.nextLine();

                System.out.println("Enter movie title:");
                title = input.nextLine();


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
                if(erIFarve.equals("yes")){
                    isInColor=true;
                }

                System.out.println("Enter duration of movie in minutes:");
                int lengthInMinutes = input.nextInt();

                //dummy bug
                input.nextLine();

                System.out.println("Enter movie genre:");
                String genre = input.nextLine();


                myFirstCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

            } if (menuInput == 3) { //User story #4
                myFirstCollection.filmList();
            } if (menuInput == 4) { //User story #5
                System.out.println("Search for movie title: ");
                title = input.nextLine();
                input.nextLine();
                myFirstCollection.searchMovie(title);

            } else {
                System.out.println("The program has ended");

            }
        }
    }
}