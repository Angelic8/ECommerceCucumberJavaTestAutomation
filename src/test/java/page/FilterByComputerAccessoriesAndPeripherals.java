package page;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;


public class FilterByComputerAccessoriesAndPeripherals {

    // local variables for login getters
    String userName = "Angel";
    String password = "Smith";

    // access another class
    Login login;

    @Given("I have signed in to Amazon")
    public void i_have_signed_in_to_Amazon() {
        login = new Login(userName, password);
        System.out.println("Signed in as: " + login.getUserName() + " " + login.getPassword());
    }

    @Given("I have the following Computer Accessories and Peripherals on Amazon")
    public void i_have_the_following_Computer_Accessories_and_Peripherals_on_Amazon(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> rows = dataTable.asLists(String.class);

        for (List<String> list: rows) {
            System.out.println("Individual Title list: " + list.get(0));
            System.out.println("Individual Brand list: " + list.get(1));
        }

    }

    @When("I searched for by {string}")
    public void i_searched_for_by(String string) {

    }

    @Then("I find Number of {string}")
    public void i_find_Number_of(String string) {

    }

} // end FilterByComputerAccessoriesAndPeripherals
