import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Lav MovieCollection objekt
    MovieCollection firstCollection = new MovieCollection();

    // Tilføj film til MovieCollection
        System.out.println("Enter movie title:");
        String title = input.nextLine();

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


        firstCollection.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);

        Movie[] test1 = firstCollection.getMovieList();
        System.out.println(test1[0].getTitle() + " er blevet tilføjet til listen");
    }
}