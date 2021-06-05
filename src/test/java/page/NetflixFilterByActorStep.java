package page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import java.util.List;

public class NetflixFilterByActorStep {

    String username = "Angel";
    String password = "Smith";

    Login login;
    Movie movie;
    MoviesOnNetflix moviesOnNetflix = new MoviesOnNetflix();

    @Given("I have signed in to Netflix")
    public void i_have_signed_in_to_netflix() {
        // Write code here that turns the phrase above into concrete actions
        login = new Login(username, password);
        System.out.println("Logged in " + login.getUsername() + " " + login.getPassword());
    }

    @Given("I have the following movies on Netflix")
    public void i_have_the_following_movies_on_netflix(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> rows = dataTable.asLists(String.class);

        for (List<String> list : rows) {
            System.out.println("Movie: " + list.get(0));
            System.out.println("Actor: " + list.get(1));

            movie = new Movie(list.get(0), list.get(1));
            moviesOnNetflix.setMovieList(movie);
        }

    }

    @When("I searched for movies by {string}>")
    public void i_searched_for_movies_by(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I find Number of {string}")
    public void i_find_number_of(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

} // end NetflixFilterByActorStep
