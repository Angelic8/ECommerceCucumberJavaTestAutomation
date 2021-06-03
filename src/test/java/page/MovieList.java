package page;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MovieList {

    List<String> testList = new ArrayList<String>();

    @Test
    public void testListMovies(){
        testList.add("movie1");
        testList.add("movie2");

        System.out.println("Test List" + testList);

        for (String list:testList){
            System.out.println("List: " + list);
        }

    } // end testListMovies()

    @Test
    public void testMovies(){
        List<String> movieList = new ArrayList<>();
        Movie movie = new Movie("movie1","movie2");

        movieList.add(movie.getMovie());

        System.out.println("Movie: " + movie.getMovie());
        System.out.println("Actor: " + movie.getActor());
    } // end testMovies()

} // end MovieList
