package page;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class LoginStep {

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        System.out.println("I should see the login page.");
    }

    @Given("I enter the following for Login")
    public void i_enter_the_following_for_Login(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> rows = dataTable.asLists(String.class);

        for (List<String> list : rows){
            System.out.println("Username: " + list.get(0));
            System.out.println("Password: " + list.get(1));

        }

    }

    @Given("I click the login button")
    public void i_click_the_login_button() {
        System.out.println("Login button is clicked.");
    }

    @Then("I should see the userform page")
    public void i_should_see_the_userform_page(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        List<List<String>> rows = dataTable.asLists(String.class);

        for (List<String> list:rows){
            System.out.println("Name: " + list.get(0));
            System.out.println("Email: " + list.get(1));
        }

    }

}
