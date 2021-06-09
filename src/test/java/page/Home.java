package page;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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

} // end Home
