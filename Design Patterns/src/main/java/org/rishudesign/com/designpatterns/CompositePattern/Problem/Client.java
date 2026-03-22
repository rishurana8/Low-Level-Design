package org.rishudesign.com.designpatterns.CompositePattern.Problem;

public class Client {
    public static void main(String[] args) {
        Directory movieDirectory  = new Directory("movies");

        File movieName = new File("Krish");

        movieDirectory.add(movieName);
        Directory comedyMovieDirectory = new Directory("ComedyMovies");
        File dumbAndDumber = new File("DumbAndDumber");
        comedyMovieDirectory.add(dumbAndDumber);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.printContent();
    }
}
