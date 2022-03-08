package tests;

import com.google.common.util.concurrent.Uninterruptibles;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginPageTest extends TestRunner {


    @Test
    public void test() {
        LoginPage loginPage = new LoginPage(driver);
        String url = "https://www.facebook.com/";
        loginPage.goTo(url);

        String username = "silver.best@mail.ru";
        String pass = "Silver@01021961";

        HomePage homePage = loginPage.signIn(username, pass);
        Assert.assertTrue(homePage.getCreateStoryLabel().isDisplayed(), "Story label is not displayed");

    }
}
