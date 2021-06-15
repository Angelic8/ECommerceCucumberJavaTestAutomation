package page;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;


public class FilterByComputerAccessoriesAndPeripherals {

    // local variables for login getters
    String userName = "Angel";
    String password = "Smith";
    int titlesOnAmazonByBrand;

    // access another class
    Login login;
    Title title;
    TitlesOnAmazon titlesOnAmazon = new TitlesOnAmazon();

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

            title = new Title(list.get(0), list.get(1));
            titlesOnAmazon.setTitleList(title);
        }

    }

    @When("I searched for title by {string}")
    public void i_searched_for_by(String brand) {
        titlesOnAmazonByBrand = titlesOnAmazon.getTitleList(brand).size();
        System.out.println("Titles count actual: " + titlesOnAmazonByBrand);
    }

    @Then("I find Number of {int}")
    public void i_find_Number_of(int expected) {
        try{
            System.out.println("Titles on Amazon by Brand - Actual: " + titlesOnAmazonByBrand);
            System.out.println("Expected: " + expected);
            Assert.assertEquals(expected, titlesOnAmazonByBrand);
            System.out.println("Test Passed");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Test Failed");
            Assert.fail();
        }
    }

} // end FilterByComputerAccessoriesAndPeripherals
