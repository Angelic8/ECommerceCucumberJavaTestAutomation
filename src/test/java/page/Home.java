package page;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Home {

    // tools
    protected static WebDriver driver;

    // web elements


    // variables
    String expectedText1, actualText1;

    public static void setWebDriver(WebDriver driver) {
        Home.driver = driver;
    } // setter manual setWebDriver

    public void viewHome(){
        expectedText1 = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        try{
            actualText1 = driver.getTitle();
            Assert.assertEquals(actualText1, expectedText1, "Page title does not match!");
            System.out.println("Page title: " + actualText1);
        } catch (AssertionError e){
            Assert.fail("Test Failed! Message does not match");
        }

    } // end viewHome()


} // end Home
