package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {

    @FindBy(xpath = "//*[@class='fb_logo img sp_U-ZrA51p6aB sx_8a1b62']")
    WebElement facebookLogo;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement passwordField;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginButton;

    public void homepageIsDisplayed() {
        Assert.assertEquals(facebookLogo.isDisplayed(), true, "facebook page wasn't displayed");
    }

    public void emailIsDisplayed() {
        Assert.assertEquals(emailField.isDisplayed(), true, "email field wasn't displayed");
    }

    public void passwordIsDisplayed() {
        Assert.assertEquals(passwordField.isDisplayed(), true, "password field wasn't displayed");
    }

    public void loginIsDisplayed() {
        Assert.assertEquals(loginButton.isDisplayed(), true, "login button wasn't displayed");
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void fillUserNamePasswordField(String user, String pass) {
        emailField.sendKeys(user);
        passwordField.sendKeys(pass);
    }
}
