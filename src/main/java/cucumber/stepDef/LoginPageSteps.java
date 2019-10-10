package cucumber.stepDef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageSteps {
    public static WebDriver driver;

    @Given("^I open the browser and navigate to facebook login page$")
    public void i_open_the_browser_and_navigate_to_facebook_login_page() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
    }

    @When("^I land on facebook homepage i validate login page is displayed$")
    public void i_land_on_facebook_homepage_i_validate_login_page_is_displayed() {
    }

    @Then("^I validate email or phone field is displayed$")
    public void i_validate_email_or_phone_field_is_displayed() {

    }

    @Then("^I validate password field is displayed$")
    public void i_validate_password_field_is_displayed() {

    }

    @Then("^I validate Login button is displayed$")
    public void i_validate_Login_button_is_displayed() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
