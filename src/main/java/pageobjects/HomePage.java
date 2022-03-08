package pageobjects;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage {

    @FindBy(css = "a[aria-label='Create Story']")
    private WebElement createStoryLabel;

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(final WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public WebElement getCreateStoryLabel() {
        Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);
        return createStoryLabel;
    }


}
