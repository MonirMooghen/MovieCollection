public class Movie {
    //Attributter
    private String title;
    private String director;
    private int yearCreated;
    private boolean isInColor;
    private int lenghtInMinutes;
    private String genre;

    //Constructor
    public Movie(String title, String director, int yearCreated, boolean isInColor, int lenghtInMinutes, String genre) {
        this.title = title;
        this.director = director;
        this.yearCreated = yearCreated;
        this.isInColor = isInColor;
        this.lenghtInMinutes = lenghtInMinutes;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean isInColor() {
        return isInColor;
    }

    public int getLenghtInMinutes() {
        return lenghtInMinutes;
    }

    public String getGenre() {
        return genre;
    }

    //Override metode
    @Override
    public String toString (){
        String result = "";
        result += "Title: " + title + "\n" + "Director: " + director + "\n" + "Year: " + yearCreated + "\n"
                + "Length in minutes: " + lenghtInMinutes + "\n" + "Genre: " + genre ;
        if(isInColor){
            result += "\n" + "Is in color: Yes";
        } else {
            result += "\n" + "Is in color: No";
        }
        return result + "\n";
    }
}