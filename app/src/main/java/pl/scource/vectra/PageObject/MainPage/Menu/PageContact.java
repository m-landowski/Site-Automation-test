package pl.scource.vectra.PageObject.MainPage.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PageContact {

    private WebDriver driver;
    private static Logger logger = LoggerFactory.getLogger(PageContact.class);

    @FindBy(xpath = "//h2[@class='cc-ontact-title']")
    WebElement txtHeaderText;

    @FindBy(xpath = "//p[contains(.,'Tel.: 801 080 180')]")
    WebElement txtPhoneNumber;

    public PageContact(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTxtHeaderText() {
        return txtHeaderText;
    }

    public WebElement getTxtPhoneNumber() {
        return txtPhoneNumber;
    }
}
