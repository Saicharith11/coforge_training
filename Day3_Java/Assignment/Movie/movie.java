package day3.assignment;

public class movie {

    private String movieName;
    private String director;
    private double rating;

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String toString() {
        return "Movie Name: " + movieName +
               "\nDirector: " + director +
               "\nRating: " + rating;
    }
}