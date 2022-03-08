package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    @FindBy(css = "#email")
    private WebElement emailField;

    @FindBy(css = "#pass")
    private WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;


    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(final WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(String url) {
        driver.get(url);
    }

    public HomePage signIn(String username, String password) {
        enterCredentials(username, password);
        clickLogin();
        return new HomePage(driver);
    }

    private void enterCredentials(String name, String password) {
        emailField.clear();
        emailField.sendKeys(name);
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    private void clickLogin() {
        loginButton.click();
    }




}
