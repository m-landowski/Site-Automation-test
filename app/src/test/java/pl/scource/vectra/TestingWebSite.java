package pl.scource.vectra;

import Utils.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pl.scource.vectra.PageObject.MainPage.*;
import pl.scource.vectra.PageObject.MainPage.Menu.PageContact;


public class TestingWebSite {
    private WebDriver driver;

    private MainPage mainPage;
    private PageContact pageContact;
    private Waits waits = new Waits();

    @BeforeTest
    public void setUp() {
        driver = new BrowserSetup().chooseDriver(System.getProperty("browser"), driver);
        //Punkt 1
        driver.get(System.getProperty("baseUrl"));
        mainPage = PageFactory.initElements(driver, MainPage.class);
        pageContact = PageFactory.initElements(driver, PageContact.class);

        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);
    }

    @Test
    public void TestWebsite()  {
        //Punkt 2
        waits.waitForElementToBeVisible(driver, mainPage.getTxtMenuTVInternet());
        //2a Assercja na "TV + INTERNET"
        String MenuZeroTvInternetText = "TV + INTERNET";
        Assert.assertEquals(mainPage.getTxtMenuTVInternet().getText(), MenuZeroTvInternetText);

        //2b Assercja na  "%%INTERNET"
        String txtMenuZeroTvInternet =mainPage.getTxtMenuTVInternet().getText();
        Assert.assertTrue(txtMenuZeroTvInternet.matches(".* INTERNET"));

        String MenuZeroInternetText = "INTERNET";
        Assert.assertEquals(mainPage.getTxtMenuInternet().getText(), MenuZeroInternetText);

        //Punkt 3  -- Assercja
        String MenuZeroKontakt = "KONTAKT";
        Assert.assertEquals(mainPage.getTxtMenuKontakt().getText(), MenuZeroKontakt);

        //Punkt 4
        mainPage.clickToMezuReroKontakt();

        //Punkt 5
        waits.waitForElementToBeVisible(driver, pageContact.getTxtHeaderText());
        String textHeaderContact = pageContact.getTxtHeaderText().getText();
        Assert.assertTrue(textHeaderContact.matches("Kontakt z firm\\D Vectra"));

        //Punkt 6 -- Assercja
        String txtPhoneNumber ="Tel.: 801 080 180";
        Assert.assertEquals(pageContact.getTxtPhoneNumber().getText(),txtPhoneNumber);

    }
    @AfterMethod
    public void cleanUp(){
        System.out.println("===Zamkniecie  Przegladarki: "+ System.getProperty("browser"));
        driver.close();
    }
}
