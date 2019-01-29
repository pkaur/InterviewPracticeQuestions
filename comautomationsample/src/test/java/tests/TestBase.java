package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestBase {

    protected static WebDriver driver;
    static String driverPath = "/Users/niteshnayak/IdeaProjects/comautomationsample/src/test/java/drivers/chromedriver";

    public WebDriver getDriver() {
        return driver;
    }

    private void setDriver(String browserType) {

        switch (browserType) {
            case "chrome":
                driver = initChromeDriver();
                break;
            case "firefox":
                driver = initFirefoxDriver();
                break;
            default:
                System.out.println("browser : " + browserType
                        + " is invalid, Launching Firefox as browser of choice..");
                driver = initChromeDriver();
        }
    }

    private static WebDriver initChromeDriver() {
        System.out.println("Launching google chrome with new profile..");
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    private static WebDriver initFirefoxDriver() {
        System.out.println("Launching Firefox browser..");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }

    @Parameters({ "browserType"})
    @BeforeSuite
    public void initializeTestBaseSetup(String browserType) {
        try {
            setDriver(browserType);

        } catch (Exception e) {
            System.out.println("Error....." + e.getStackTrace());
        }
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
    }

