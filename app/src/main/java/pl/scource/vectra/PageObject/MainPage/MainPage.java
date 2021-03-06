package pl.scource.vectra.PageObject.MainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPage {

    private WebDriver driver;
    private static Logger logger = LoggerFactory.getLogger(MainPage.class);

    //@FindBy(linkText = "TV + INTERNET")
    @FindBy(xpath = "//a[contains(text(),'TV + Internet')]")
    WebElement txtMenuTVInternet; //

    //@FindBy(linkText = "INTERNET")
    @FindBy(xpath = "(//a[contains(text(),'Internet')])[2]")
    WebElement txtMenuInternet;

    //@FindBy(linkText = "KONTAKT")
    @FindBy(xpath = "(//a[contains(text(),'KONTAKT')])[3]")
    WebElement txtMenuKontakt;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getTxtMenuTVInternet() {
        return txtMenuTVInternet;
    }

    public WebElement getTxtMenuInternet() {
        return txtMenuInternet;
    }

    public WebElement getTxtMenuKontakt() {
        return txtMenuKontakt;
    }

    public void clickToMezuReroKontakt() {
        txtMenuKontakt.click();
    }

}
