package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {
    public WebDriver chooseDriver(String browser, WebDriver driver) {
        switch (browser) {
            case "chrome": {
                System.out.println("===Run Browser Chrome");
                System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver");
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                options.addArguments("start-maximized");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            }
            break;
            case "firefox": {
                System.out.println("=== Run Browser Firefox");
                System.setProperty("webdriver.gecko.driver", "Driver\\geckodriver"); //driver w Wersji 0.29.0 (2021-01-14
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            }
            break;
        }
        return driver;
    }
}
