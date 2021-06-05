package page;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

public class Home {

    // tools
    protected static WebDriver driver;

    // web elements


    // others
    

    // variables
    String expectedText1, actualText1;

    public static void setWebDriver(WebDriver driver) {
        Home.driver = driver;
    } // setter manual setWebDriver

    public void viewHome(){
        expectedText1 = "Amazon.com. Spend less. Smile more.";
        try{
            actualText1 = driver.getTitle();
            Assert.assertEquals(actualText1, expectedText1, "Page title does not match!");
            System.out.println("Page title: " + actualText1);
        } catch (AssertionError e){
            Assert.fail(actualText1 + "Test Failed! Message does not match");
        }
    } // end viewHome()

    @Given("I have signed in to Amazon")
    public void i_have_signed_in_to_amazon() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I have signed in to Amazon.");

    } // end I have signed in to Amazon

    @Given("I have the following Computer Accessories and Peripherals on Amazon")
    public void i_have_the_following_computer_accessories_and_peripherals_on_amazon(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        // For other transformations you can register a DataTableType.

        List<List<String>> rows = dataTable.asLists(String.class);

        for (List<String> list:rows){
            System.out.println("I have the following accessories and peripherals on Amazon. " + "Title: " + list.get(0));
            System.out.println("I have the following accessories and peripherals on Amazon. " + "Brand: " + list.get(1));
        }

    } // end i_have_the_following_computer_accessories_and_peripherals_on_amazon

    @When("I searched for by {string}>")
    public void i_searched_for_by(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I have searched for");

    } // end i_searched_for_by

} // end Home
