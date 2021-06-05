package test;

/*
  ****************************************

  @author angel
 * @date 1 June 2021
 * @project ECommerce Selenium Java
 * ****************************************
 */

import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;
import page.*;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class EComTestCases {

    // tools
    private static WebDriver driver;

    // pages
    protected static Home homeObj;

    @BeforeTest
    public void setupTest() {

        // Push Notifications
        // 1 - Create a map to store preferences (Chrome)
        Map<String, Object> prefs = new HashMap<String, Object>();

        // 2- Add key and value to map as follow to switch off browser notification
        // Pass the argument 1 to allow and 2 to block
        prefs.put("profile.default_content_setting_values.notifications", 1);

        // 3- Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // 4 - Set ExperimentalOption - prefs
        options.setExperimentalOption("prefs", prefs);
        options.setAcceptInsecureCerts(true);
        WebDriverManager.chromedriver().setup();

        // 5 - Now Pass ChromeOptions instance to ChromeDriver Constructor
        // To initialize chrome driver which will switch off this browser notification on the chrome browser
        driver = new ChromeDriver(options);
        // browser resolution
        driver.manage().window().maximize();

        String appURL = "https://www.amazon.com/";
        driver.get(appURL);
        driver.manage().deleteAllCookies();

        homeObj = new Home();
        homeObj.setWebDriver(driver);

    } // end setupTest

    @Test(priority = 1)
    public void testHome(){
        homeObj.viewHome();
        homeObj.i_have_signed_in_to_amazon();
        //homeObj.i_have_the_following_computer_accessories_and_peripherals_on_amazon(DataTable.emptyDataTable());
    } // end method testHome()


} // end EComTestCases
